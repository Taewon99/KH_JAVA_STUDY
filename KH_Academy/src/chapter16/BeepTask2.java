package chapter16;

import java.awt.Toolkit;

public class BeepTask2 extends Thread {
	public static Toolkit tk = Toolkit.getDefaultToolkit();
	
	

	public BeepTask2(String name) {
		super(name);
	}



	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			tk.beep();
			System.out.println(getName()+"¶¯");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}
