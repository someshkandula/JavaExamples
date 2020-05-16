/**
 * 
 */
package com.somesh.examples.thread;

/**
 * @author ksomalin
 *
 */
public class ThreadExecute {

	public static void main(String[] args) throws InterruptedException {
		Counter c = new Counter();
		Thread t = new Thread(new TheadEx("one",c));
		t.setName("T1");
		
		
		Thread t2 = new Thread(new TheadEx("Two",c));
		t2.setName("T2");
		
		t.start();
		t2.start();
		t.join();
		t2.join();
		
		System.out.println("counter"+c.count);

	
	}
}
