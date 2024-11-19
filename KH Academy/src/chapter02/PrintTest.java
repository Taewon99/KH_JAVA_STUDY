package chapter02;

import java.util.Scanner;

public class PrintTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input fisrt value : ");
		int x = scan.nextInt();
		System.out.print("Input second value : ");
		int y = scan.nextInt();
		System.out.print("Input third value : ");
		int z = scan.nextInt();
		
		int sum = x+y+z;
		
		System.out.println("\n"+x+"+"+y+"+"+z+"="+sum);
	}

}
