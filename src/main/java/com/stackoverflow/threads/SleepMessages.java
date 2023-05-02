package com.stackoverflow.threads;

import java.text.SimpleDateFormat;

public class SleepMessages {
	public static void main(String args[]) throws InterruptedException {
		String importantInfo[] = { "Mares eat oats", "Does eat oats", "Little lambs eat ivy",
				"A kid will eat ivy too" };

		for (int i = 0; i < importantInfo.length; i++) {
			// Pause for 4 seconds
			String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
			System.out.println(timeStamp);
			Thread.sleep(4000);
			// Print a message
			System.out.println(importantInfo[i]);
		}
		
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new java.util.Date());
		System.out.println("outside loop:"+timeStamp);
	}
}