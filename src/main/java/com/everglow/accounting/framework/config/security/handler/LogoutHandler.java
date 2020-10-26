package com.everglow.accounting.framework.config.security.handler;

import cn.hutool.core.convert.Convert;
import cn.hutool.json.JSONUtil;

import com.everglow.accounting.util.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author ljz
 * 认证成功处理器
 */
@Component("logoutHandler")
public class LogoutHandler implements LogoutSuccessHandler {
	@Value("${global.log.log-save.enabled}")
	private Boolean isLogSave;
	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		response.setHeader("Access-Control-Allow-Credentials", "true");
		response.setHeader("Access-Control-Allow-Origin", Convert.toStr(request.getHeader("Origin")));
		response.setHeader("Access-Control-Allow-Headers",
				"Content-Type, Content-Length, Authorization, Accept, X-Requested-With");
		response.setContentType("application/json;charset=UTF-8");
		response.getWriter().write(JSONUtil.toJsonPrettyStr(R.genOkResult()));
	}
}
