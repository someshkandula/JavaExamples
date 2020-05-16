package com.somesh.examples.thread;

public class Counter {
	
	int count;
	
	public synchronized void increment() {
		count++;
	}

	public Counter() {
	}

}
