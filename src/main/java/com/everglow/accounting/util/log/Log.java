//package com.everglow.accounting.util.log;
//
//import com.smac.common.enums.ActionEnum;
//import org.aspectj.lang.JoinPoint;
//
//import javax.servlet.http.HttpServletRequest;
//
//public interface Log {
//	/**
//	 * 通过注解的方式记录log
//	 * 大多数情况通过controller中的model字段判断操作名称
//	 * 对于ActionEnum是CHANGE_STATUS的情况，通过ApiOperation自定义操作名称，比如启用，禁用等
//	 */
//	void saveLog(JoinPoint joinPoint, Exception e, HttpServletRequest request) throws Exception;
//	/**
//	 * 主要用于登录控制部分
//	 */
//	void saveLog(HttpServletRequest request, ActionEnum actionEnum) throws Exception;
//
//	/**
//	 * 灵活地记录日志
//	 * @param operator 操作人
//	 * @param operation 操作内容
//	 */
//	void saveLog(String operator, String operation) throws Exception;
//}
