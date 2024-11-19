package hello;

public class Shape {
	private String color;

	public Shape(String color) {
		super();
		this.color = color;
	}

	public double calcArea() {
		return 0;
	}

	@Override
	public String toString() {
		return "color=" + color + "";
	}

}