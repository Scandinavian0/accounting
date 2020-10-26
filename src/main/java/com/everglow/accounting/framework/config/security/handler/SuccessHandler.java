//package com.everglow.accounting.framework.config.security.handler;
//
//import cn.hutool.core.date.DateUtil;
//import cn.hutool.core.lang.Dict;
//import cn.hutool.json.JSONUtil;
//import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
//import com.everglow.accounting.modules.entity.User;
//import com.everglow.accounting.modules.mapper.UserBaseMapper;
//import com.everglow.accounting.util.R;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.Resource;
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
///**
// * @ClassName SuccessHandler
// * @Decripiton 认证成功处理器
// * @Author Everglow
// * @Date 2020/10/26 15:28
// * @Version 1.0
// **/
//@Component("successHandler")
//public class SuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {
//    @Value("${global.log.log-save.enabled}")
//    private Boolean isLogSave;
//    @Resource
//    private UserBaseMapper userMapper;
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
//                                        Authentication authentication) throws ServletException, IOException {
//        String username = authentication.getPrincipal().toString();
//        User user = userMapper.selectOne(new QueryWrapper<User>().eq("username", username));
//        response.setContentType("application/json;charset=UTF-8");
//        System.out.println("获取登录用户名称:"+user.getUsername());
//        response.getWriter()
//                .write(JSONUtil.toJsonPrettyStr(R.genOkResult(Dict.create()
//                        .set("loginTime", DateUtil.now())
//                )));
//
//    }
//
//}
