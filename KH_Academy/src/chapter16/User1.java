package chapter16;

public class User1 extends Thread {
	// ����������Ŭ���� ��������� ����.

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
