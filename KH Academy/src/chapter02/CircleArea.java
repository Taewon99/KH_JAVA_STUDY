package chapter02;

import java.util.Scanner;

public class CircleArea {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input radius for area of the circle : ");
		int radius = scan.nextInt();
		
		final double PI = 3.141592;
		double area = radius * radius * PI;
		
		System.out.println("\nThe area of the circle is "+area+"cm^2");
		
	}

}
