package chapter07;

public class Rectangle extends Shape {
	private int area;

	public Rectangle(int x, int y) {
		super(x, y);
		this.area = 0;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	@Override
	public void draw() {
		area = getX()*getY();
		System.out.printf("�簢���� ���̴� %d �Դϴ�\n", area);

	}

}
