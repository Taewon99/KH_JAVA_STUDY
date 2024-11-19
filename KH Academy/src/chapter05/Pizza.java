package chapter05;

public class Pizza {
	private String topping;
	private int radius;
	public static int count = 0;

	public Pizza(String topping, int radius) {
		super();
		this.topping = topping;
		this.radius = radius;
		count ++;
	}

	public String getTopping() {
		return topping;
	}

	public void setTopping(String topping) {
		this.topping = topping;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Pizza [topping=" + topping + ", radius=" + radius + "]";
	}

}
