package chapter05;

public class Singleton {
	private int name, age, no;

	private static Singleton instance = new Singleton();

	private Singleton() {

	}

	public static Singleton getInstance() {
		return Singleton.instance;
	}

	public int getName() {
		return name;
	}

	public void setName(int name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	@Override
	public String toString() {
		return "Singleton [name=" + name + ", age=" + age + ", no=" + no + "]";
	}

}
