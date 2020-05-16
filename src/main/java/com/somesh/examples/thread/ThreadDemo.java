/**
 * 
 */
package com.somesh.examples.thread;

/**
 * @author ksomalin
 *
 */
public class ThreadDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			Thread t = new Thread(new Task());
			t.start();
		}
		System.out.println(" Main Completed!!! ");
	}
}


