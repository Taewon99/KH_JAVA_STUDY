package chapter16_example;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = new BeepTask();
		Thread thread = new Thread(r,"¶¯");

		thread.start();

		System.out.println("thread name = " + thread.getName());
	}

}
