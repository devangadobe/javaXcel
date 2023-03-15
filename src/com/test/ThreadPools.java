package com.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPools {

	public static void main(String[] args) {

		ExecutorService threadPool = Executors.newFixedThreadPool(2);
		
		threadPool.execute(()->runJob("Job 1"));
		threadPool.execute(()->runJob("Job 2"));
		
		threadPool.shutdown();
		
	}
	
	public static void runJob(String jobName) {
		
		for (int i = 0; i < 10 ; i++) {
			
			String threadName = Thread.currentThread().getName();
			System.out.println(jobName + " is running on "+threadName);
			
		}
		
		
	}

}
