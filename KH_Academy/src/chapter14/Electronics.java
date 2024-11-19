package chapter14;

public class Electronics {
	private String name;
	private int price;

	public Electronics(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Electronics ec)) {
			return false;
		}
		return name==ec.name;
	}

	@Override
	public String toString() {
		return "Electronics [" + name + ", " + price + "]";
	}

}
