package chapter04;

public class DeskLamp {

	private boolean isOn;

	public boolean getIsOn() {
		return isOn;
	}

	public void setIsOn(boolean isOn) {
		this.isOn = isOn;
	}

	public void turnOn() {
		isOn = true;
	}

	public void turnOff() {
		isOn = false;
	}

	public String status() {
		return "���� ���´� " + (isOn == true ? "�������ϴ�." : "�������ϴ�.");
	}

}
