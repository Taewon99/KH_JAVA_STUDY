package chapter16;

public class ThreadPriorityMain {

	public static void main(String[] args) {
		Thread[] tArray = new Thread[11];
		
		for (int i = 1; i <= 10; i++) {
			tArray[i] = new ThreadPriority("thread" + i);

			// 우선순위 권한 설정
			if (i != 10) {
				tArray[i].setPriority(Thread.MIN_PRIORITY);
			}else {
				tArray[i].setPriority(Thread.MAX_PRIORITY);
			}
			tArray[i].start();

		}
	}

}
