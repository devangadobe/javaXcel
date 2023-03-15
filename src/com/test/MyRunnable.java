package com.test;

import java.util.concurrent.CountDownLatch;

public class MyRunnable implements Runnable {

	private CountDownLatch latch;

	public MyRunnable(CountDownLatch latch) {
		this.latch = latch;
	}

	@Override
	public void run() {
       go();
	}

	private void go() {
		try {
			latch.await();
			//Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}			
		System.out.println("Inside go() of MyRunnable");
	}

}
