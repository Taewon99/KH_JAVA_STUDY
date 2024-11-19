package chapter16;

import java.awt.Toolkit;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		// 规过 1 (class implements Runnnable(何=磊))
		Runnable r = new BeepTask();
		Thread thread = new Thread(r,"规过 1");

		thread.start();

		// 规过 2 (class extends Thread(何=磊))
		Thread thread2 = new BeepTask2("规过 2");
		thread2.start();

		// 规过 3 (烙矫按眉(Runnalbe 备泅))
		Runnable r3 = new Runnable() {
			public static Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {

				for (int i = 1; i <= 5; i++) {
					tk.beep();
					System.out.println("动");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

		Thread thread3 = new Thread(r3,"规过 3");
		thread3.start();

		// 规过 4 (烙矫按眉 (Thread 烙矫按眉))
		Thread thread4 = new Thread("规过 4") {
			public static Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					tk.beep();
					System.out.println("动");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		};
		thread4.start();

		// 规过 5 ((规过3) 烙矫按眉 -> 恩促侥钎泅)
		Runnable r5 = () -> {
			Toolkit tk = Toolkit.getDefaultToolkit();

			for (int i = 1; i <= 5; i++) {
				tk.beep();
				System.out.println("动");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};
		Thread thread5 = new Thread(r5,"规过 5");
		thread5.start();

		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
			Thread.sleep(1000);
		}
		System.out.println("the end");
	}

}
