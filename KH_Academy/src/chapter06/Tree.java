package chapter06;

public class Tree extends Bomb {

	public Tree(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		super.bombBlast();
		System.out.println("나무가지가 떨어지면서 나무가 불타오릅니다.");
	}

}
