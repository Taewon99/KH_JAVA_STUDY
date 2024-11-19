package chapter16;

public class SynchronizedMain {

	public static void main(String[] args) {
		ShareData shareData = new ShareData();

		Thread thread = new User1(shareData, 100);
		Thread thread2 = new User2(shareData, 50);
		
		thread.start();
		thread2.start();
	}

}
