package chapter06;

public class Bomb {
	private int expPower;

	public Bomb(int expPower) {
		this.expPower = expPower;
	}

	public int getExplosivePower() {
		return expPower;
	}

	public void setExplosivePower(int explosivePower) {
		this.expPower = explosivePower;
	}

	@Override
	public String toString() {
		return "Bomb [expPower=" + expPower + "]";
	}
	
	public void bombBlast() {
		System.out.println("∆¯≈∫¿Ã"+expPower+"ªÁ¿Ã¡Ó∑Œ ∆¯πﬂ«’¥œ¥Ÿ.");
	}
}
