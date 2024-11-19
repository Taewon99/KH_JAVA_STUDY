package chapter04;

public class Sphere {
	int radius;
	//��������(Method Memory ������ ����� ����)
	static final double PI = 3.171592;
	
	//������ �Լ�
	public Sphere(int radius) {
		this.radius = radius;
	}
	
	//�Լ�
	public double getVolume() {
		return Math.pow(radius, 3) * 3 / 4 * Math.PI;
	}

}
