package chapter07;

public class AutoCar implements InterfaceCar {

	@Override
	public void start() {
		System.out.println("�ڵ����� ����մϴ�");
	}

	@Override
	public void stop() {
		System.out.println("�ڵ����� �����մϴ�.");
	}

	@Override
	public int setSpeed(int speed) {
		System.out.println("�ڵ����� �ӵ��� " + speed + "km/h�� �ٲߴϴ�.");
		return speed;
	}

	@Override
	public int turn(int degree) {
		System.out.println("�ڵ����� ������ " + degree + "��ŭ �ٲߴϴ�.");
		return degree;
	}

}
