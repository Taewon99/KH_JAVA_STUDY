package hello;

interface MyMath {
	int calculate(int x);
}

public class Lamda {
	public static void main(String[] args) {
		int value = 9;
		
		MyMath s = (int x) -> x*x;
		int y = s.calculate(value);
		System.out.println(y);

	}

}
