package chapter02;

import java.util.Scanner;

public class Calculation2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input fisrt value: ");
		double x = scan.nextDouble();
		System.out.print("Input seocond value: ");
		double y = scan.nextDouble();
		System.out.print("Input third value: ");
		double z = scan.nextDouble();
		
		
		double sum = x + y + z;
		double sub = x - y - z;
		double mult = x * y * z;
		double div = x / y / z;
		
		
		System.out.println("\nCalculation would be:");
		System.out.println("Addition = "+sum);
		System.out.println("Subtraction = "+sub);
		System.out.println("Multiplication = "+mult);
		System.out.println("Division = "+div);
		
	}

}
