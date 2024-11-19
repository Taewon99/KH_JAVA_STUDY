package chapter02;

import java.util.Scanner;

public class Calculation {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input fisrt value: ");
		int x = scan.nextInt();
		System.out.print("Input seocond value: ");
		int y = scan.nextInt();
		
		int sum = x + y;
		int sub = x - y;
		int mult = x * y;
		int div = x / y;
		
		
		System.out.println("\nCalculation would be:");
		System.out.println("Addition = "+sum);
		System.out.println("Subtraction = "+sub);
		System.out.println("Multiplication = "+mult);
		System.out.println("Division = "+div);
		
	}

}
