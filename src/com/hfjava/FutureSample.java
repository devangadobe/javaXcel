package com.hfjava;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureSample {

	public static void main(String[] args) {

		ExecutorService executorService = Executors.newFixedThreadPool(5);

		Future<String> future = executorService.submit(() -> {
			Thread.sleep(5000);
			return "Hello World";
		});
		
		if(!future.isCancelled() && future.isDone()) {
			try {
			String str = future.get(10,TimeUnit.SECONDS);
			System.out.println(str);
			}catch(InterruptedException | ExecutionException | TimeoutException e){				
				e.printStackTrace();
			}
		}

	}

}
