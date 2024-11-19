package hello;

public class Triangle extends Shape {
	private int base, height;

	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return base * height/2;
	}

	@Override
	public String toString() {
		return "Triangle [" + super.toString() + ", base=" + base + ", height=" + height + ", calcArea()="
				+ calcArea() + "]";
	}


}
