package chapter16;

import java.awt.Toolkit;

public class ThreadMain {

	public static void main(String[] args) throws InterruptedException {

		Thread thread = new Thread(() -> {
			Toolkit tk = Toolkit.getDefaultToolkit();
			for (int i = 1; i <= 5; i++) {
				tk.beep();
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		thread.start();
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("the end");
	}

}
