package chapter03;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean play = true;
		
		do {
			System.out.println("Please input any number (0 is finishing game)");
			int num = scan.nextInt();
			
			if(num == 0) {
				System.out.println("Thank you for play, Bye");
				play = false;
			}
			else if (num % 2 == 0) {
				System.out.println("\n"+num + " is Even number\n");
			} else {
				System.out.println("\n"+num + " is Odd number\n");
			}

		} while (play);

	}

}
