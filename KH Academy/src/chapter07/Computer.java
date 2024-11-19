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
		System.out.println("컴퓨터를 켰습니다.");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("컴퓨터를 껐습니다.");
	}

}
