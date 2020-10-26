//package com.everglow.accounting.util.log;
//
//import cn.hutool.core.lang.Dict;
//
//import java.util.concurrent.BlockingQueue;
//import java.util.concurrent.LinkedBlockingQueue;
//
///**
// *  日志队列
// *
// * @author ljz
// * @date 2019年1月5日
// */
//public class LogQueue {
//	/** 队列容量 */
//	private static final Integer MAX_SIZE = 1000;
//	/** 链表队列实现先进先出 */
//	private static BlockingQueue<Dict> blockingQueue = new LinkedBlockingQueue<Dict>(MAX_SIZE);
//
//	/** 线程安全 */
//	private static class LogSingle {
//		private static final LogQueue QUEUE = new LogQueue();
//	}
//
//	/** 获取队列 */
//	public static LogQueue getLogProducer() {
//		return LogSingle.QUEUE;
//	}
//
//	public void produce(Dict log) throws Exception {
//		blockingQueue.put(log);
//	}
//
//	public Dict consume() throws InterruptedException {
//		return blockingQueue.take();
//	}
//
//	/** 获取待处理日志数量 */
//	public Integer getLogSize() {
//		return blockingQueue.size();
//	}
//}
