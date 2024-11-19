package chapter05;

import java.util.Scanner;

public class BookMain2 {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		Book[] bookArray = new Book[20];
		boolean endFlag = false;

		while (endFlag == false) {
			printInstruction();
			int userIns = scan.nextInt();

			switch (userIns) {
			case 1:
				inputBook(bookArray);
				break;
			case 2:
				searchBook(bookArray);
				break;
			case 3:
				printBooks(bookArray);
				break;
			case 4:
				System.out.println("����Ǿ����ϴ�.");
				endFlag = true;
				break;
			}
		}

	}

	public static void printInstruction() {
		System.out.println("==========================");
		System.out.println("1. å ���\n2. å�˻�\n3. ��� å ���\n4. ����");
		System.out.println("==========================");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
	}

	public static void inputBook(Book[] bookArray) {
		System.out.print("å ��ȣ�� �Է��� �ּ���: ");
		scan.nextLine();
		int no = scan.nextInt();
		System.out.print("������ �Է��� �ּ���: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("������ �Է��� �ּ���: ");
		int score = scan.nextInt();

		Book book = new Book(no, title, score);
		bookArray[no - 1] = book;
	}

	public static void searchBook(Book[] bookArray) {
		boolean findFlag = false;
		System.out.print("å ������ �Է��� �ּ���: ");
		scan.nextLine();
		String title = scan.nextLine();
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null&&bookArray[i].getTitle().equals(title)) {
				System.out.println("�Է��Ͻ� å ������ : " + bookArray[i].toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(title + "å�� ���� ���� �ʽ��ϴ�.");
		}

	}

	public static void printBooks(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] == null) {
				break;
			}
			System.out.println(bookArray[i].toString());
		}
	}

}
