package chapter14;

import java.io.Serializable;
import java.util.Objects;

import Test.Student;

public class CarLamda implements Serializable, Comparable<CarLamda> {
	private int num;
	private String name, color;
	private int price;

	public CarLamda() {
		this(0,null, null, 0);
	}

	public CarLamda(int num, String name, String color, int price) {
		super();
		this.num = num;
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return Objects.hash(num,name);
	}

	@Override
	public boolean equals(Object obj) {
		CarLamda carLamda = null;
		if (!(obj instanceof Student)) {
			System.out.println("객체비교 불가");
			return false;
		}
		carLamda = (CarLamda) obj;
		if (num == carLamda.num && name == carLamda.name) {
			return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "CarLamda [" + num + ", " + name + ", " + color + ", " + price + "]";
	}

	@Override
	public int compareTo(CarLamda carLamda) {
		return num - carLamda.num;
	}

}
