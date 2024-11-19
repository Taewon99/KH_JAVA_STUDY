package chapter04;

public class Sphere {
	int radius;
	//정적변수(Method Memory 영역에 상수값 지정)
	static final double PI = 3.171592;
	
	//생성자 함수
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	//함수
	public double getVolume() {
		return Math.pow(radius, 3) * 3 / 4 * Math.PI;
	}

}
