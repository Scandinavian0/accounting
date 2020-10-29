package com.everglow.accounting.framework.config.security;

import com.everglow.accounting.framework.config.security.filter.AuthenticationFilter;
import com.everglow.accounting.framework.config.security.handler.*;
import com.everglow.accounting.framework.config.security.token.TokenAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.configurers.ExpressionUrlAuthorizationConfigurer;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Configuration
@EnableWebSecurity
@Component
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Resource
    private ExceptionHandler exceptionHandler;
    @Resource
    private AuthenticationFilter authenticationFilter;
    @Resource
    private SuccessHandler successHandler;
    @Resource
    private FailureHandler failureHandler;
    @Resource
    private LogoutHandler logoutHandler;
    @Resource
    private IgnoreUrl ignoreUrl;
    @Resource
    private UserDeatils userDeatils;
    @Resource
    private SessionRegistry sessionRegistry;

    @Bean
    public SessionRegistry getSessionRegistry() {
        return new SessionRegistryImpl();
    }
    /**
     * @Description: 密码加密
     * @Param:
     * @Return:
     * @Author Everglow
     * @Date: 2020/10/27 17:06
     */
    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDeatils).passwordEncoder(this.passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        ExpressionUrlAuthorizationConfigurer<HttpSecurity>.ExpressionInterceptUrlRegistry registry = http
                .authorizeRequests();
        /*忽略的权限的url*/
        ignoreUrl.getUrls().forEach(url -> registry.antMatchers(url).permitAll());
        //开启跨域
        http
                .cors().and()
                /*关闭跨站请求防护*/
                .csrf().disable()
                /*指定登录页面*/
                .formLogin().loginPage("/login")
                /*成功和失败处理器*/
                .successHandler(successHandler)
                .failureHandler(failureHandler).and()
                /*登出成功处理器*/
                .logout().logoutSuccessHandler(this.logoutHandler).invalidateHttpSession(true)
                .deleteCookies("JSESSIONID").and()
                /*自定义security拒绝类*/
                .exceptionHandling().authenticationEntryPoint(this.exceptionHandler).and()
                /*对所有权限做限制*/
                .authorizeRequests()
                /*所有请求全部需要鉴权认证*/
                .anyRequest().authenticated().and();
        /*自定义filter*/
        http.addFilterBefore(this.authenticationFilter, UsernamePasswordAuthenticationFilter.class);
        //生成token存放在redis中
//        http.addFilterAfter(new TokenAuthenticationFilter().doFilter(););
        // 禁用页面缓存
        //http.headers().cacheControl();
        /*设置session账号同时在线次数*/
        http.sessionManagement().maximumSessions(1).expiredUrl("/expired").sessionRegistry(sessionRegistry);
        //允许frame加载
        http.headers().frameOptions().disable();

    }
}
