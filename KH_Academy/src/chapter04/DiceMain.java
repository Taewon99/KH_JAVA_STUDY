package chapter04;

public class DiceMain {

	public static void main(String[] args) {

		Dice dice1 = new Dice();
		Dice dice2 = new Dice();
		int count = 0;

		do {
			dice1.roll();
			dice2.roll();

			System.out.println("주사위1 = " + dice1.getValue() + " 주사위2 = " + dice2.getValue());
			count++;

		} while (!(dice1.getValue()==1 && dice2.getValue()==1));

		System.out.println("(" + dice1.getValue() + ", " + dice2.getValue() + ")이 나오는데 걸린 횟수 = " + count);
	}

}
