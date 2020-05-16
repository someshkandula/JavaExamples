/**
 * 
 */
package com.somesh.examples.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ksomalin
 *
 */
public class ExecutorFixedThreadDemo {

	public static void main(String[] args) {
		//Create the pool
		ExecutorService ex = Executors.newFixedThreadPool(10);
		
		//Submit the task for execution...
		for(int i=0;i<100;i++) {
			ex.submit(new Task());
		}
		System.out.println(" Thread Name: " + Thread.currentThread().getName());
		System.out.println(" Main Completed!!! ");
		
		ex.shutdown();
	}
}


