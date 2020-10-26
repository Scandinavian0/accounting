//package com.everglow.accounting.util.log;
//
//import cn.hutool.core.lang.Console;
//import cn.hutool.core.lang.Dict;
//import com.smac.common.exception.FrameworkException;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
//import org.springframework.stereotype.Component;
//
//import javax.annotation.PostConstruct;
//import javax.annotation.PreDestroy;
//import java.util.concurrent.ExecutorService;
//import java.util.concurrent.Executors;
//
//
///**
// *  邮件消费
// *
// * @author ljz
// * @date 2019年1月5日
// */
//@Component
//@ConditionalOnProperty(value = {"global.log.log-save.enabled"}, havingValue = "true")
//public class LogCustomer {
//
///** 消费者数量 */
//
//	@Value("${global.log.log-save.threads}")
//	private Integer COUNT;
//
//	@PostConstruct
//	public void startThread() {
//		ExecutorService excutor = Executors.newFixedThreadPool(COUNT);
//		for (int i = 0; i < COUNT; i++) {
//			excutor.execute(() -> {
//				while (true) {
//					try {
//						Dict log = LogQueue.getLogProducer().consume();
//						if (log != null) {
//							Console.log("日志线程("+COUNT+"):" + Thread.currentThread().getName() + "日志内容---" + log.toString());
//						}
//					} catch (Exception e) {
//						throw new FrameworkException("日志出队异常！");
//					}
//				}
//			});
//		}
//	}
//
//	@PreDestroy
//	public void stopThread() {
//		Console.log("线程销毁");
//	}
//}
//
