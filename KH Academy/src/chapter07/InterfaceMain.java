package chapter07;

import java.util.ArrayList;

public class InterfaceMain {

	public static void main(String[] args) {
		ArrayList<InterfaceCar> list = new ArrayList<InterfaceCar>();

		list.add(new AutoCar());
		list.add(new AiCar());

		for (InterfaceCar data : list) {
			data.start();
			data.setSpeed(30);
			data.turn(15);
			data.stop();
			System.out.println();
		}
	}

}
