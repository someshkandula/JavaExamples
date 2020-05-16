package com.somesh.examples.thread;
class Task implements Runnable {
	@Override
	public void run() {
		System.out.println("TASK Class Thread Name: " + Thread.currentThread().getName());
	}
}