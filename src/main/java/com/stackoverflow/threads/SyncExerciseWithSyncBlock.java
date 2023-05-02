package com.stackoverflow.threads;

public class SyncExerciseWithSyncBlock {

	public Object lock1 = new Object();
	public Object lock2 = new Object();

	public static void main(String[] args) {
		SyncExerciseWithSyncBlock block=new SyncExerciseWithSyncBlock();
		block.method1();
		block.method2();
	
	}
	
	public void method1() {
		synchronized (lock1) {
			try {
				System.out.println("In Method 1");
				System.out.println("Current Thread Name: "+Thread.currentThread().getName());
				Thread.sleep(5000);
			} catch (Exception e) {
				System.out.println("Catch of method 1");
			} finally {
				System.out.println("Finally of method 1");
			}
		}

	}

	public void method2() {

		synchronized (lock2) {
			try {
				for (int i = 1; i < 10; i++) {
					System.out.println("Method 2 " + i);
					System.out.println("Current Thread Name: "+Thread.currentThread().getName());
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				System.out.println("Catch of method 2");
			} finally {
				System.out.println("Finally of method 2");
			}
		}
	}

}