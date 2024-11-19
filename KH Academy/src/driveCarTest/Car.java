package driveCarTest;

public class Car extends Vehicle implements Move {

	public Car(String name) {
		super(name);
		super.setOn(false);
	}

	@Override
	public void start() {
		if (getSpeed() >= 0 && isOn() == true) {
			System.out.println(getName() + " 자동차가 현재 주행 중 입니다.\n");
		} else {
			System.out.println(getName() + " 자동차의 주행을 시작합니다.\n");
			setOn(true);
		}
	}

	@Override
	public void stop() {
		if (getSpeed() > 0) {
			System.out.println(getName() + " 자동차가 현재 주행 중 입니다, 정지 후 시동을 꺼주세요.\n");
		} else if (getSpeed() == 0) {
			System.out.println(getName() + " 자동차의 주행이 완료 되었습니다.\n");
			setOn(false);
		} else {
			System.out.println(getName() + " 0km 이하로는 운행할 수 없습니다, 자동차의 주행이 완료 되었습니다.\n");
			setOn(false);
		}
	}

	@Override
	public void speedUp(int speed) {
		if (isOn() == false) {
			System.out.println("먼저 " + getName() + " 자동차의 시동을 걸어주세요\n");
		} else {
			if (getSpeed() + speed > 300) {
				setSpeed(300);
				System.out.println(getName() + " 자동차의 최고 속력은 300km 입니다. 300km 속도로 주행합니다.\n");
			} else {
				setSpeed(getSpeed() + speed);
				System.out.println(getName() + " 자동차의 현재 속도는 " + this.getSpeed() + "km 입니다.\n");
			}
		}
	}

	@Override
	public void speedDown(int speed) {
		if (isOn() == false) {
			System.out.println("먼저 " + getName() + " 자동차의 시동을 걸어주세요\n");
		} else {
			if (getSpeed() - speed <= 0) {
				setSpeed(0);
				System.out.println(getName() + " 자동차가 정지 했습니다.\n");
			} else {
				setSpeed(getSpeed() - speed);
				System.out.println(getName() + " 자동차의 현재 속도는 " + this.getSpeed() + "km 입니다.\n");
			}
		}
	}

	@Override
	public String toString() {
		return "getName()";
	}

}