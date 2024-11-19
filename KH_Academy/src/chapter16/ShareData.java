package chapter16;

public class ShareData {
	private int memory;

	public ShareData() {
	}

	public int getMemory() {
		return memory;
	}

	// 동기화처리 임계영역(함수전체설정)
	public void setMemory(int memory) {
		synchronized (this) {
			this.memory = memory;
			// 2초간 정지
			try {
				Thread.sleep(2000);
				System.out.println(Thread.currentThread().getName() + ":" + this.memory);
				// memory 가지고 2초동안 연산처리
				// context switching 발생
			} catch (InterruptedException e) {
			}
			// 연산결과값 출력
		}
	}

	@Override
	public String toString() {
		return "ShareData [" + memory + "]";
	}

}
