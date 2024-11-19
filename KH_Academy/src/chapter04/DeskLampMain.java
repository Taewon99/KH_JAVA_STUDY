package chapter04;

public class DeskLampMain {

	public static void main(String[] args) {
		DeskLamp deskLamp = new DeskLamp();

		deskLamp.turnOn();
		System.out.println(deskLamp.status());

		deskLamp.turnOff();
		System.out.println(deskLamp.status());

		deskLamp.setIsOn(true);
		System.out.println(deskLamp.status());

		deskLamp.setIsOn(false);
		System.out.println(deskLamp.status());
	}

}
