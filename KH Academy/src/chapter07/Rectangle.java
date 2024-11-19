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
		System.out.printf("사각형의 넓이는 %d 입니다\n", area);

	}

}
