package chapter16ThreadStates;

public class ThreadStateMain {

	public static void main(String[] args) {
		Thread t = new TargetThread();

		Thread thread = new TraceStateThread((TargetThread) t);
		thread.start();
	}

}
