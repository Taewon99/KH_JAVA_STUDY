package chapter16;

import java.awt.Toolkit;

public class ThreadMain2 {

	public static void main(String[] args) throws InterruptedException {
		// ��� 1 (class implements Runnnable(��=��))
		Runnable r = new BeepTask();
		Thread thread = new Thread(r,"��� 1");

		thread.start();

		// ��� 2 (class extends Thread(��=��))
		Thread thread2 = new BeepTask2("��� 2");
		thread2.start();

		// ��� 3 (�ӽð�ü(Runnalbe ����))
		Runnable r3 = new Runnable() {
			public static Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {

				for (int i = 1; i <= 5; i++) {
					tk.beep();
					System.out.println("��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

			}
		};

		Thread thread3 = new Thread(r3,"��� 3");
		thread3.start();

		// ��� 4 (�ӽð�ü (Thread �ӽð�ü))
		Thread thread4 = new Thread("��� 4") {
			public static Toolkit tk = Toolkit.getDefaultToolkit();

			@Override
			public void run() {
				for (int i = 1; i <= 5; i++) {
					tk.beep();
					System.out.println("��");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}

		};
		thread4.start();

		// ��� 5 ((���3) �ӽð�ü -> ���ٽ�ǥ��)
		Runnable r5 = () -> {
			Toolkit tk = Toolkit.getDefaultToolkit();

			for (int i = 1; i <= 5; i++) {
				tk.beep();
				System.out.println("��");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

			}
		};
		Thread thread5 = new Thread(r5,"��� 5");
		thread5.start();

		for (int i = 1; i <= 5; i++) {
			System.out.print(i);
			Thread.sleep(1000);
		}
		System.out.println("the end");
	}

}
