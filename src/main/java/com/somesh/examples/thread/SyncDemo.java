package com.somesh.examples.thread;

public class SyncDemo {

	public SyncDemo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Counter c = new Counter();

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					c.increment();
				}
			}
		});

		t1.start();
		t2.start();

		t1.join();
		t2.join();
		System.out.println(" count " + c.count);

	}

}
