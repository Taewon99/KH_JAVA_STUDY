package chapter16ThreadStates;

public class TraceStateThread extends Thread {
	private TargetThread targetThread;

	public TraceStateThread(TargetThread targetThread) {
		setName("���ý�����");
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			State state = targetThread.getState();

			System.out.println("targetThread�� ���� ���´� = " + state.toString());

			if (state == Thread.State.NEW) {
				targetThread.start();
			} else if (state == Thread.State.TERMINATED) {
				System.out.println("���¸� ������ �����尡 ����Ǿ����ϴ�.");
				break;
			}

			try {
				Thread.sleep(500);
			} catch (Exception e) {

			}
		}
		System.out.println(getName() + " = the end");
	}

}
