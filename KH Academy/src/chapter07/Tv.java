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
		System.out.println("TV¸¦ Ä×½À´Ï´Ù.");
	}

	@Override
	public void turnOff() {
		isOn = false;
		System.out.println("TV¸¦ ²°½À´Ï´Ù.");
	}

}
