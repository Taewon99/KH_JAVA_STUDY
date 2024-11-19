package chapter05;

public class ECar {
	private static ECar instance = new ECar();
	private int battery, distance;

	private ECar() {
		battery = 100;
		distance = 0;
	}

	public static ECar getInstance() {
		return ECar.instance;
	}

	public int getBattery() {
		return battery;
	}

	public void setBattery(int battery) {
		this.battery = battery;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}

	public static void setInstance(ECar instance) {
		ECar.instance = instance;
	}

	public void disDistance() {
		System.out.println("주행거리: " + distance + "km");
	}

	public void disBattery() {
		System.out.println("배터리 :" + battery + "%");
	}

	public void drive() {
		if (battery > 0) {
			distance++;
			battery -= 10;
		} else {
			System.out.println("배터리 잔량이 없습니다. 배터리 충전을 해주세요");
		}
	}

	@Override
	public String toString() {
		return "주행거리: " + distance + "km, 배터리: " + battery + "%";
	}
}
