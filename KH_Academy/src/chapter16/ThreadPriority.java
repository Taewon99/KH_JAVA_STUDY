package chapter16;

public class ThreadPriority extends Thread {

	public ThreadPriority(String name) {
		setName(name);
	}

	@Override
	public void run() {
		// 시간체크 방법
		long start = System.currentTimeMillis();
		for (int i = 0; i <= 200000000; i++) {

		}
		long stop = System.currentTimeMillis();
		System.out.println(getName()+" "+(stop-start)/1000.0);
	}

}
