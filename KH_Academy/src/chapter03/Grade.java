package chapter03;

import java.util.Scanner;

public class Grade {

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
			} else if (score >= 95) {
				grade = "A+";
			} else if (score >= 90) {
				grade = "A";
			} else if (score >= 85) {
				grade = "B+";
			} else if (score >= 80) {
				grade = "B";
			} else if (score >= 75) {
				grade = "C+";
			} else if (score >= 70) {
				grade = "C";
			} else if (score >= 65) {
				grade = "D+";
			} else if (score >= 60) {
				grade = "D";
			} else {
				grade = "F";
			}

			System.out.println("\nyour score " + score + " is grade " + grade + "\n");

		} while (score != 0);

		scan.close();
		System.exit(1);
	}

}
