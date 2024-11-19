package chapter06;

import java.util.Scanner;

public class StudentMain {
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		Student[] studentArray = new Student[20];
		boolean endFlag = false;

		while (endFlag == false) {
			printInstruction();
			int userIns = scan.nextInt();
			switch (userIns) {
			case 1:
				inputStudent(studentArray);
				break;
			case 2:
				searchStudent(studentArray);
				break;
			case 3:
				printStudents(studentArray);
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
		System.out.println("1. 학생정보 등록\n2. 학생정보검색\n3. 모든 학생정보 출력\n4. 종료");
		System.out.println("==========================");
		System.out.print("번호를 입력하시오: ");
	}

//	studentNumber, String name, int korScore, int engScore, int mathScore
	public static void inputStudent(Student[] studentArray) {
		System.out.print("학번을 입력해 주세요: ");
		scan.nextLine();
		int studentNumber = scan.nextInt();
		scan.nextLine();
		System.out.print("이름을 입력해 주세요: ");
		String name = scan.nextLine();
		System.out.print("국어 성적을 입력해 주세요");
		int korScore = scan.nextInt();
		System.out.print("영어 성적을 입력해 주세요 ");
		scan.nextLine();
		int engScore = scan.nextInt();
		System.out.print("수학 성적을 입력해 주세요 ");
		scan.nextLine();
		int mathScore = scan.nextInt();

		Student student = new Student(studentNumber, name, korScore, engScore, mathScore);
		studentArray[studentNumber - 1] = student;
	}

	public static void searchStudent(Student[] studentArray) {
		boolean findFlag = false;
		System.out.print("학생의 이름을 입력해 주세요: ");
		scan.nextLine();
		String name = scan.nextLine();
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getName().equals(name)) {
				System.out.println("입력하신 학생의 정보는 : " + studentArray[i].toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(name + " 학생은 존재 하지 않습니다.");
		}

	}

	public static void printStudents(Student[] studentArray) {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				break;
			}
			System.out.println(studentArray[i].toString());
		}
	}
}
