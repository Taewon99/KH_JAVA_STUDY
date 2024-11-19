package chapter16;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	public static Toolkit tk = Toolkit.getDefaultToolkit();

	@Override
	public void run() {

		for (int i = 1; i <= 5; i++) {
			tk.beep();
			System.out.println("¶¯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
