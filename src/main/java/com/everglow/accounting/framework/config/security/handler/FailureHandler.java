package com.everglow.accounting.framework.config.security.handler;

import cn.hutool.json.JSONUtil;

import com.everglow.accounting.util.R;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Everglow
 * 认证失败处理器
 */
@Component("failureHandler")
public class FailureHandler extends SimpleUrlAuthenticationFailureHandler {
	@Value("${global.log.log-save.enabled}")
	private Boolean isLogSave;

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
			AuthenticationException exception) throws IOException, ServletException {
		//设置返回类型
		response.setContentType("application/json;charset=UTF-8");
		String message = "用户名或密码错误！";
		//将错误信息写入
		if ("User is disabled".equals(exception.getMessage())) {
			message = "用户已被禁用！";
		}
		response.getWriter().write(JSONUtil.toJsonPrettyStr(R.genFailedResult(message)));
	}
}
