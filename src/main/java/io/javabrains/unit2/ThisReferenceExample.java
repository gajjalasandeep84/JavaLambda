package io.javabrains.unit2;

import io.javabrains.unit2.ClosuresExample.Process;

public class ThisReferenceExample {

	public void doProcess(int i, Process p) {
		p.process(i);
	}

	public void execute() {// non static block
		doProcess(10, i -> {
			System.out.println("Value of i is" + i);
			System.out.println(this);
		});
	}

	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		// System.out.println(thisReferenceExample);
		thisReferenceExample.doProcess(10, new Process() {/// Anonymous inner class
			@Override
			public void process(int i) {
				System.out.println("Value of i is" + i);
				System.out.println(this);
			}

			/*
			 * public String toString() { return "This the anonymous inner class"; }
			 */
		});

		thisReferenceExample.execute();
		

	}

	public String toString() {
		return "This the anonymous inner class";
	}
}
