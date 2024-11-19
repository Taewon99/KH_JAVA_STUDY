package chapter16;

public class ShareData {
	private int memory;

	public ShareData() {
	}

	public int getMemory() {
		return memory;
	}

	// ����ȭó�� �Ӱ迵��(�Լ���ü����)
	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			// 2�ʰ� ����
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + ":" + this.memory);
				// memory ������ 2�ʵ��� ����ó��
				// context switching �߻�
			} catch (InterruptedException e) {
			}
			// �������� ���
		}
	}

	@Override
	public String toString() {
		return "ShareData [" + memory + "]";
	}

}
