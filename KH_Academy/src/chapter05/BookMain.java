package chapter05;

import java.util.Scanner;

public class BookMain {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		boolean exitFlag = false;
		Book[] bookArray = new Book[20];

		while (!exitFlag) {
			dispMenu();
			int menuNo = scan.nextInt();

			switch (menuNo) {
			case 1:
				insertBook(bookArray);
				break;
			case 2:
				findBooks(bookArray);
				break;
			case 3:
				printBooks(bookArray);
				break;
			case 4:
				exitFlag = true;
				System.out.println("���α׷� ����");
				break;
			}

		}
	}

	public static void dispMenu() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("1. å���\n2. å�˻�\n3. ��ü���\n4. ����");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.print("��ȣ�� �Է¿��: ");
	}

	public static void insertBook(Book[] bookArray) {
		System.out.print("å ��ȣ�� �Է��ϼ���: ");
		int no = scan.nextInt();
		System.out.print("����: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("����: ");
		int score = scan.nextInt();

		Book book = new Book(no, title, score);
		bookArray[no - 1] = book;
	}

	public static void printBooks(Book[] bookArray) {
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] == null) {
				continue;
			}
			System.out.println(bookArray[i].toString());
		}
	}

	public static void findBooks(Book[] bookArray) {
		boolean findFlag = false;
		System.out.print("�˻� ����: ");
		scan.nextLine();
		String title = scan.nextLine();
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null && bookArray[i].getTitle().equals(title)) {
				System.out.println("������ ã��å: " + bookArray[i].toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(title + " å�� �����ϴ�.");
		}
	}
}
