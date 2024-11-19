package chapter07;

public class Tv implements RemoteControl {
	private boolean isOn;

	public Tv(boolean isOn) {
		super();
		this.isOn = isOn;
	}

	@Override
	public void turnOn() {
		isOn = true;
		System.out.println("TV�� �׽��ϴ�.");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("TV�� �����ϴ�.");
	}

}
