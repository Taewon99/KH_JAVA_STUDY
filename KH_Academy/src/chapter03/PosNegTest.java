package chapter03;

import java.util.Scanner;

public class PosNegTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean play = true;

		do {
			System.out.println("Please input any number (0 is finishing game)");
			int num = scan.nextInt();

			if (num == 0) {
				System.out.println("Thank you for play, Bye");
				play = false;
			} else if (num > 0) {
				System.out.println("\n" + num + " is Positive Number\n");
			} else {
				System.out.println("\n" + num + " is Negative Number\n");
			}

		} while (play);

	}

}
