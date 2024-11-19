package chapter04;

import java.util.Scanner;

public class BoxMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Box box = new Box();
		
		System.out.print("상자의 가로를 입력하세요: ");
		box.setLength(scan.nextInt());
		System.out.print("상자의 세로를 입력하세요: ");
		box.setWidth(scan.nextInt());
		System.out.print("상자의 높이를 입력하세요: ");
		box.setHeight(scan.nextInt());
		
		System.out.printf("\n상자의 가로, 세로, 높이는 %d, %d, %d 입니다.\n",box.getLength(),box.getWidth(),box.getHeight());
		System.out.println("상자의 부피는 "+box.getVolume()+"입니다.");

	}

}
