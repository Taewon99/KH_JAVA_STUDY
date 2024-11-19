package chapter07;

import java.util.ArrayList;

public class RemoteControlMain {   
	public static void main(String[] args) {
		ArrayList<RemoteControl> list = new ArrayList<RemoteControl>();

		list.add(new Tv(false));
		list.add(new Computer(false));

		for (RemoteControl data : list) {
			data.turnOn();
			data.turnOff();
		}
	}
}
