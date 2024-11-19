package chapter07;

public class AiCar implements InterfaceCar {

	@Override
	public void start() {
		System.out.println("자율주행이 자동차를 출발시킵니다.");
	}

	@Override
	public void stop() {
		System.out.println("자율주행이 자동차를 정지합니다.");
	}

	@Override
	public int setSpeed(int speed) {
		System.out.println("자율주행이 자동차 속도를 "+speed+"km/h로 바꿉니다.");
		return speed;
	}

	@Override
	public int turn(int degree) {
		System.out.println("자율주행이 자동차 방향을 "+degree+"도 만큼 바꿉니다.");
		return degree;
	}

}
