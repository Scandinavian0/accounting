package com.everglow.accounting.framework.config.security.filter;


import cn.hutool.core.convert.Convert;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * author: everglow
 * description:
 */
@Component
public class AuthenticationFilter extends OncePerRequestFilter {
    private final static String IGNORE_OPTIONS = "OPTIONS";

    /**
     * @Description:  解决跨域问题
     * @Param: request，response，filterChain
     * @Return:
     * @Author Everglow
     * @Date: 2020/10/26 15:26
     */
    @Override
    protected void doFilterInternal( final HttpServletRequest request, final HttpServletResponse response, final FilterChain filterChain)
            throws ServletException, IOException {

        // 解决跨域问题
        response.setHeader("Access-Control-Allow-Origin", Convert.toStr(request.getHeader("Origin")));
        response.setHeader("Access-Control-Allow-Credentials", "true");
        response.setHeader("Access-Control-Allow-Headers", "Content-Type, Content-Length, Authorization, Accept, X-Requested-With");
        // 明确允许通过的方法，不建议使用*
        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Expose-Headers", "*");
        // 预请求后，直接返回
        // 返回码必须为 200 否则视为请求失败
        if (IGNORE_OPTIONS.equals(request.getMethod())) {
            return;
        }
        filterChain.doFilter(request, response);
    }
}
