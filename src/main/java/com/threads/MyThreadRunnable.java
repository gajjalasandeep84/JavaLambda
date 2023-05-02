package com.threads;

public class MyThreadRunnable implements Runnable {

	@Override
	public void run() {
		System.out.println("Thread is running");

	}

	public static void main(String args[]) {
		Thread t = new Thread(new MyThreadRunnable());
		t.start();
	}

}
