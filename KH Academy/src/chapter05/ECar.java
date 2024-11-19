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
		System.out.println("����Ÿ�: " + distance + "km");
	}

	public void disBattery() {
		System.out.println("���͸� :" + battery + "%");
	}

	public void drive() {
		if (battery > 0) {
			distance++;
			battery -= 10;
		} else {
			System.out.println("���͸� �ܷ��� �����ϴ�. ���͸� ������ ���ּ���");
		}
	}

	@Override
	public String toString() {
		return "����Ÿ�: " + distance + "km, ���͸�: " + battery + "%";
	}
}
