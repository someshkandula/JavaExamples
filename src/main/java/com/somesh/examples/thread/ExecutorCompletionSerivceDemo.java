/**
 * 
 */
package com.somesh.examples.thread;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author ksomalin
 *
 */

public class ExecutorCompletionSerivceDemo {

	/**
	 * 
	 */
	public ExecutorCompletionSerivceDemo() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 * @throws InterruptedException
	 * @throws ExecutionException
	 */
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		List<Callable<String>> taskList = Arrays.asList(new TaskA(), new TaskB(), new TaskC());

		ExecutorService pool = Executors.newFixedThreadPool(3);
		ExecutorCompletionService<String> completionService = new ExecutorCompletionService<>(pool);
		for (final Callable<String> task : taskList) {
			completionService.submit(task);
		}

		for (int i = 0; i < taskList.size(); ++i) {
			Future<String> future = completionService.take();
			System.out.println("Completed task " + taskList.get(i) + " Response : " + future.get());
		}

		if (pool != null) {
			System.out.println("Shutting down the pool ");
			pool.shutdown();
		}
	}

}

class TaskA implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		return "Task A completed";
	}
}

class TaskB implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(5000);
		return "Task B completed";
	}
}

class TaskC implements Callable<String> {
	@Override
	public String call() throws Exception {
		Thread.sleep(500);
		return "Task C completed";
	}
}