package chapter05;

import java.util.Scanner;

public class MovieMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Movie[] movieArray = new Movie[3];

		for (int i = 0; i < movieArray.length; i++) {
			System.out.print((i + 1) + ". ��ȭ�� ������ �Է��ϼ���: ");
			String title = scan.nextLine();
			System.out.print((i + 1) + ". ��ȭ�� ������ �Է��ϼ���: ");
			String director = scan.nextLine();

			movieArray[i] = new Movie(title, director);
		}

		for (int i = 0; i < movieArray.length; i++) {
			System.out.println("===============================");
			System.out.println("����: " + movieArray[i].getTitle());
			System.out.println("����: " + movieArray[i].getDirector());
			System.out.println("===============================");
		}
	}

}
