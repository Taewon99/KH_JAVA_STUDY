package chapter02;

import java.util.Scanner;

public class TempConversion {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean play = true;

		do {
			System.out.println("1. celsius => Fahrenheit\n2. Fahrenheit => Celsius");
			int option = scan.nextInt();

			if (option == 1) {
				System.out.print("Please input Celsius : ");
				double celsius = scan.nextDouble();

				double fahrenheit = (celsius * 9 / 5) + 32;
				System.out.println("\n"+celsius + " Celsius is " + fahrenheit + " Fahrenheit\n");
				
				System.out.print("play again(y/n) : ");
				String answer = scan.next();
				
				if (answer.equalsIgnoreCase("y")) {
					play = true;
				} else if (answer.equalsIgnoreCase("n")) {
					play = false;
				} else {
					System.out.println("\nplease input y or n\n");
				}

			} else if (option == 2) {
				System.out.print("Please input Fahrenheit : ");
				double fahrenheit = scan.nextDouble();

				double celsius = (fahrenheit - 32) * 5 / 9;
				System.out.println("\n"+fahrenheit + " Fahrenheit is " + celsius + " Celsius\n");
				
				System.out.println("play again(y/n) : ");
				String answer = scan.next();
				
				if (answer.equalsIgnoreCase("y")) {
					play = true;
				} else if (answer.equalsIgnoreCase("n")) {
					play = false;
				} else {
					System.out.println("\nplease input y or n\n");
				}

				
			} else {
				System.out.println("\nplease choose 1 or 2\n");
			}

		} while (play);
		
		System.out.println("Bye");

	}

}
