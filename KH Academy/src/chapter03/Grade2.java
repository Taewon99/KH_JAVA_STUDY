package chapter03;

import java.util.Scanner;

public class Grade2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;

		do {
			System.out.println("Please input your score (input 0 to finish)");
			score = scan.nextInt();
			String grade = null;

			if (score == 0) {
				System.out.println("Thank you, Bye");
				break;
			}

			switch (score / 10) {
			case 9, 10:
				grade = "A";
				break;
			case 8:
				grade = "B";
				break;
			case 7:
				grade = "C";
				break;
			case 6:
				grade = "D";
				break;
			default:
				grade = "F";
				break;
			}

			System.out.println("\nyour score " + score + " is grade " + grade + "\n");

		} while (score != 0);

		scan.close();
		System.exit(1);
	}

}
