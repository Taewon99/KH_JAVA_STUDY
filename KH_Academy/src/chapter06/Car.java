package chapter06;

public class Car {
	private int speed;

	public Car(int speed) {
		super();
		this.speed = speed;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + "]";
	}
	
	
}