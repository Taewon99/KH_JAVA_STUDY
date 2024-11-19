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
				System.out.println("종료되었습니다.");
				endFlag = true;
				break;
			}
		}

	}

	public static void printInstruction() {
		System.out.println("==========================");
		System.out.println("1. 책 등록\n2. 책검색\n3. 모든 책 출력\n4. 종료");
		System.out.println("==========================");
		System.out.print("번호를 입력하시오: ");
	}

	public static void inputBook(Book[] bookArray) {
		System.out.print("책 번호를 입력해 주세요: ");
		scan.nextLine();
		int no = scan.nextInt();
		System.out.print("제목을 입력해 주세요: ");
		scan.nextLine();
		String title = scan.nextLine();
		System.out.print("평점을 입력해 주세요: ");
		int score = scan.nextInt();

		Book book = new Book(no, title, score);
		bookArray[no - 1] = book;
	}

	public static void searchBook(Book[] bookArray) {
		boolean findFlag = false;
		System.out.print("책 제목을 입력해 주세요: ");
		scan.nextLine();
		String title = scan.nextLine();
		for (int i = 0; i < bookArray.length; i++) {
			if (bookArray[i] != null&&bookArray[i].getTitle().equals(title)) {
				System.out.println("입력하신 책 정보는 : " + bookArray[i].toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(title + "책이 존재 하지 않습니다.");
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
