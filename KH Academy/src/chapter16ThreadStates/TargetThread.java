package chapter16ThreadStates;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 1000000000; i++) {

		}

		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
		}

		for (int i = 0; i < 1000000000; i++) {

		}
	}

}
