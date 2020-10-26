//package com.everglow.accounting.util.log;
//
//import cn.hutool.core.lang.Console;
//import cn.hutool.http.HttpStatus;
//import com.smac.common.exception.FrameworkException;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.*;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.core.annotation.Order;
//import org.springframework.http.HttpMethod;
//import org.springframework.stereotype.Component;
//import org.springframework.util.StringUtils;
//import org.springframework.web.context.request.RequestContextHolder;
//import org.springframework.web.context.request.ServletRequestAttributes;
//
//import javax.annotation.Resource;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.util.Arrays;
//import java.util.Objects;
//
///**
// * 日志切面
// *
// * @author ljz
// */
//@Order(value = 0)
//@Aspect
//@Component
//@ConditionalOnProperty(value = {"global.log.enabled"}, havingValue = "true")
//public class LogAspect {
//
//	/**
//	 * 控制日志打印启用
//	 */
//	@Value("${global.log.log-print}")
//	private Boolean logPrint;
//	/**
//	 * 控制日志保存启用
//	 */
//	@Value("${global.log.log-save.enabled}")
//	private Boolean logSave;
//
//	@Resource
//	private Log log;
//
//	/**
//	 * 配置切面
//	 */
//	@Pointcut(value = "execution(* com.smac.*.controller.*.*(..))")
//	public void log() {
//	}
//
//	/**
//	 * 请求Controller 日志处理
//	 *
//	 * @param joinPoint {@link JoinPoint}
//	 */
//	@Before("log()")
//	public void logDeBefore(JoinPoint joinPoint) {
//		if (logPrint) {
//			ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder
//					.getRequestAttributes();
//			assert attributes != null;
//			HttpServletRequest request = attributes.getRequest();
//			Console.log("----------------------------------------------------------");
//			Console.log("请求路径:{}", request.getRequestURL().toString());
//			Console.log("请求类型:{}", request.getMethod());
//			Console.log("客户端IP:{}", request.getRemoteAddr());
//			Console.log("请求方法:{}",
//					joinPoint.getSignature().getDeclaringTypeName() + "." + joinPoint.getSignature().getName());
//			Console.log("请求参数:{}", Arrays.toString(joinPoint.getArgs()));
//		}
//	}
//
//	/**
//	 * 之后操作
//	 *
//	 * @param returnValue {@link Object}
//	 */
//	@AfterReturning(pointcut = "log()", returning = "returnValue")
//	public void logDoAfterReturning(Object returnValue) {
//		if (logPrint) {
//			if (StringUtils.isEmpty(returnValue)) {
//				returnValue = "";
//			}
//			Console.log("请求响应:{}", returnValue);
//			Console.log("----------------------------------------------------------");
//		}
//	}
//
//
//	// ----------------------------------------------------------------------------------------------------------------------
//
//	/**
//	 * 配置日志注解
//	 */
//	@Pointcut("@annotation(com.smac.common.annotation.Log)")
//	public void annotationCut() {
//	}
//	@Before("annotationCut()")
//	public void doBefore(JoinPoint joinPoint){
//		if (logSave) {
//			HttpServletRequest request = ((ServletRequestAttributes) Objects
//					.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
//			if(!HttpMethod.DELETE.toString().equals(request.getMethod().toUpperCase())){
//				return;
//			}
//			try {
//				log.saveLog(joinPoint, null, request);
//			} catch (Exception e) {
//				throw new FrameworkException("日志保存异常！");
//			}
//		}
//	}
//	/**
//	 * 前置通知 用于拦截操作
//	 */
//	@AfterReturning(pointcut = "annotationCut()")
//	public void doAfter(JoinPoint joinPoint) {
//		if (logSave) {
//			HttpServletRequest request = ((ServletRequestAttributes) Objects
//					.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
//			HttpServletResponse response = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
//			if(response!=null && response.getStatus() != HttpStatus.HTTP_OK){
//				return;
//			}
//			if(HttpMethod.DELETE.toString().equals(request.getMethod().toUpperCase())){
//				return;
//			}
//			try {
//				log.saveLog(joinPoint, null, request);
//			} catch (Exception e) {
//				e.printStackTrace();
//				throw new FrameworkException("日志保存异常！");
//			}
//		}
//	}
//
//	/**
//	 * 日志处理
//	 */
//	@AfterThrowing(value = "annotationCut()", throwing = "e")
//	public void doAfter(JoinPoint joinPoint, Exception e) {
//		/*if (logSave) {
//			if ("不允许访问".equals(e.getMessage())) {return;}
//			HttpServletRequest request = ((ServletRequestAttributes) Objects
//					.requireNonNull(RequestContextHolder.getRequestAttributes())).getRequest();
//			try {
//				log.saveLog(joinPoint, e, request);
//			} catch (Exception ex) {
//				throw new FrameworkException("日志保存异常！");
//			}
//		}*/
//	}
//}
