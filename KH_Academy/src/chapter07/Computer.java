package chapter07;

public class Computer implements RemoteControl {
	private boolean isOn;

	public Computer(boolean isOn) {
		super();
		this.isOn = isOn;
	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("��ǻ�͸� �׽��ϴ�.");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("��ǻ�͸� �����ϴ�.");
	}

}
