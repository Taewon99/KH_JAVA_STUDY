package chapter16ThreadStates;

public class TraceStateThread extends Thread {
	private TargetThread targetThread;

	public TraceStateThread(TargetThread targetThread) {
		setName("감시스레드");
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		while (true) {
			State state = targetThread.getState();

			System.out.println("targetThread의 현재 상태는 = " + state.toString());

			if (state == Thread.State.NEW) {
				targetThread.start();
			} else if (state == Thread.State.TERMINATED) {
				System.out.println("상태를 점검할 스레드가 종료되었습니다.");
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
