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
				System.out.println("����Ǿ����ϴ�.");
				endFlag = true;
				break;
			}
		}

	}

	public static void printInstruction() {
		System.out.println("==========================");
		System.out.println("1. �л����� ���\n2. �л������˻�\n3. ��� �л����� ���\n4. ����");
		System.out.println("==========================");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
	}

//	studentNumber, String name, int korScore, int engScore, int mathScore
	public static void inputStudent(Student[] studentArray) {
		System.out.print("�й��� �Է��� �ּ���: ");
		scan.nextLine();
		int studentNumber = scan.nextInt();
		scan.nextLine();
		System.out.print("�̸��� �Է��� �ּ���: ");
		String name = scan.nextLine();
		System.out.print("���� ������ �Է��� �ּ���");
		int korScore = scan.nextInt();
		System.out.print("���� ������ �Է��� �ּ��� ");
		scan.nextLine();
		int engScore = scan.nextInt();
		System.out.print("���� ������ �Է��� �ּ��� ");
		scan.nextLine();
		int mathScore = scan.nextInt();

		Student student = new Student(studentNumber, name, korScore, engScore, mathScore);
		studentArray[studentNumber - 1] = student;
	}

	public static void searchStudent(Student[] studentArray) {
		boolean findFlag = false;
		System.out.print("�л��� �̸��� �Է��� �ּ���: ");
		scan.nextLine();
		String name = scan.nextLine();
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getName().equals(name)) {
				System.out.println("�Է��Ͻ� �л��� ������ : " + studentArray[i].toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(name + " �л��� ���� ���� �ʽ��ϴ�.");
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
