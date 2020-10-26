package com.everglow.accounting.framework.config.security.handler;

import cn.hutool.json.JSONUtil;
import com.everglow.accounting.util.R;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.Serializable;

/**
 *
 * security拒绝处理类
 * @author ljz
 */
@Component
public class ExceptionHandler implements AuthenticationEntryPoint, Serializable {

	/**
	 * 当访问的资源没有权限时被调用
	 */
	@Override
	public void commence(final HttpServletRequest request, final HttpServletResponse response,
			final AuthenticationException authException) throws IOException {

			response.setContentType("application/json;charset=UTF-8");
			response.getWriter().write(JSONUtil.toJsonPrettyStr(R.genForbiddenResult("抱歉，访问被拒绝")));

	}
}
