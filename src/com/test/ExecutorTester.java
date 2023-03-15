package com.test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTester {

	public static void main(String[] args) {
		
		ExecutorService exeService = Executors.newSingleThreadExecutor();
		
		CountDownLatch latch = new CountDownLatch(1);
		
		Runnable job = new MyRunnable(latch);
		
		exeService.execute(job);
		
		System.out.println(Thread.currentThread().getName()+" : back in main()");
		
		latch.countDown();
		
		//Thread.dumpStack();
		
		exeService.shutdown();

	}

}
