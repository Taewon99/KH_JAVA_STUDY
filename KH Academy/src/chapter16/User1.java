package chapter16;

public class User1 extends Thread {
	// 공유데이터클래스 멤버변수로 가짐.

	private ShareData shareData;
	private int value;

	public User1(ShareData shareData, int value) {
		super();
		setName("Thread_user1");
		this.shareData = shareData;
		this.value = value;
	}

	@Override
	public void run() {
		shareData.setMemory(value);
	}

}
