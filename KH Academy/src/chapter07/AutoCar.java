package chapter07;

public class AutoCar implements InterfaceCar {

	@Override
	public void start() {
		System.out.println("자동차가 출발합니다");
	}

	@Override
	public void stop() {
		System.out.println("자동차가 정지합니다.");
	}

	@Override
	public int setSpeed(int speed) {
		System.out.println("자동차가 속도를 " + speed + "km/h로 바꿉니다.");
		return speed;
	}

	@Override
	public int turn(int degree) {
		System.out.println("자동차가 방향을 " + degree + "만큼 바꿉니다.");
		return degree;
	}

}
