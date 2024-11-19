package chapter04;

public class Dice {

	private int face;

	public Dice() {
		face = 0;
	}

	public int roll() {
		face = (int) (Math.random() * 6) + 1;
		return face;
	}

	public int getValue() {
		return face;
	}

	public void setvalue(int face) {
		this.face = face;
	}
}
