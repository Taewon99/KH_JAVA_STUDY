package chapter16;

public class User2 extends Thread {
	// ����������Ŭ���� ��������� ����.

	private ShareData shareData;
	private int value;

	public User2(ShareData shareData, int value) {
		super();
		setName("Thread_user2");
		this.shareData = shareData;
		this.value = value;
	}

	@Override
	public void run() {
		shareData.setMemory(value);
	}

}
