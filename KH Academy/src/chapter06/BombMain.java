package chapter06;

public class BombMain {

	public static void main(String[] args) {

		Bomb[] bombArray = new Bomb[] {new Tree(2)};

		for (int i = 0; i < bombArray.length; i++) {
			bombArray[i].bombBlast();
		}

	}

}
