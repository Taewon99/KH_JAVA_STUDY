package chapter05;

public class SingletonMain {

	public static void main(String[] args) {
		Singleton single = Singleton.getInstance();
		Singleton single2 = Singleton.getInstance();
		
		System.out.println(single);
		System.out.println(single2);
		
		single.setAge(25);
		System.out.println(single.getAge());
		System.out.println(single2.getAge());
		
	}

}
