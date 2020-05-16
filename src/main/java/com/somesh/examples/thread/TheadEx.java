/**
 * 
 */
package com.somesh.examples.thread;

/**
 * @author ksomalin
 *
 */
public class TheadEx extends Thread {
	
	Counter c = null;
	public TheadEx(String name, Counter c) {
		this.c = c;
	}

	int counter = 0;

	public void run() {

		for (int i = 0; i <= 1000; i++) {
			c.increment();
		}
	}

}
