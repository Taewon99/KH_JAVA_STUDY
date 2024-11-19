package chapter03;

import java.util.Scanner;

public class RandomTest {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		boolean play = true;
		int comp;
		do {
			System.out.println("Please choose between (0)Paper, (1)Scissor, (2)Rock");
			int user = scan.nextInt();

			comp = (int) (Math.random() * 3);

			if (user > 2) {
				System.out.println("please choose between 0-2\n");
				continue;
			}

			if (user == comp) {
				System.out.println("you: " + user + " comp: " + comp + "\nyou draw\n");
			} else if (user == (comp + 1) % 3) {
				System.out.println("you: " + user + " comp: " + comp + "\nyou win\n");
			} else if (comp == (user + 1) % 3) {
				System.out.println("you: " + user + " comp: " + comp + "\nyou lose\n");
			}
			String answer;

			do {
				System.out.println("play more? (y/n)");
				answer = scan.next();
				System.out.println("");

				if (answer.equalsIgnoreCase("y")) {
					play = true;
				} else if (answer.equalsIgnoreCase("n")) {
					play = false;
				} else {
					System.out.println("please choos y or n");
				}

			} while (!(answer.equalsIgnoreCase("y") || answer.equalsIgnoreCase("n")));
		} while (play);

		System.out.println("Thank you for play, bye");
	}

}
