package chapter05;

public class Rect {

	private int height, width;

	public Rect(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rect [height=" + height + ", width=" + width + "]";
	}
	
	public int getArea() {
		return height*width;
	}
	
	
}
