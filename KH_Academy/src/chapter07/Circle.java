package chapter07;

public class Circle extends Shape {

	private int radius;
	private double area;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
		this.area= 0.0;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		area = Math.PI*Math.pow(radius, 2);
		System.out.printf("���� ���̴� %.2f �Դϴ�\n", area);
	}

}
