package chapter06;

public class ECar extends Car {
	
	private int battery;

	public ECar(int speed, int battery) {
		super(speed);
		this.battery = battery;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	@Override
	public String toString() {
		return "ECar [battery=" + battery + "]";
	}
	
	
}
