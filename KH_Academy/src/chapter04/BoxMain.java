package chapter04;

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Box box = new Box();
		
		System.out.print("������ ���θ� �Է��ϼ���: ");
		box.setLength(scan.nextInt());
		System.out.print("������ ���θ� �Է��ϼ���: ");
		box.setWidth(scan.nextInt());
		System.out.print("������ ���̸� �Է��ϼ���: ");
		box.setHeight(scan.nextInt());
		
		System.out.printf("\n������ ����, ����, ���̴� %d, %d, %d �Դϴ�.\n",box.getLength(),box.getWidth(),box.getHeight());
		System.out.println("������ ���Ǵ� "+box.getVolume()+"�Դϴ�.");

	}

}
