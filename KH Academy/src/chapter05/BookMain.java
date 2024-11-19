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
				System.out.println("프로그램 종료");
				break;
			}

		}
	}

	public static void dispMenu() {
		System.out.println("+++++++++++++++++++++++++++");
		System.out.println("1. 책등록\n2. 책검색\n3. 전체출력\n4. 종료");
		System.out.println("+++++++++++++++++++++++++++");
		System.out.print("번호를 입력요망: ");
	}

	public static void insertBook(Book[] bookArray) {
		System.out.print("책 번호를 입력하세요: ");
		int no = scan.nextInt();
		System.out.print("제목: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("평점: ");
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
		System.out.print("검색 제목: ");
		scan.nextLine();
		String title = scan.nextLine();
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null && bookArray[i].getTitle().equals(title)) {
				System.out.println("고객님이 찾는책: " + bookArray[i].toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(title + " 책은 없습니다.");
		}
	}
}
