package chapter06;

public class Tree extends Bomb {

	public Tree(int expPower) {
		super(expPower);
	}

	@Override
	public void bombBlast() {
		super.bombBlast();
		System.out.println("���������� �������鼭 ������ ��Ÿ�����ϴ�.");
	}

}
