package chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentListMain {
	public static final int INPUT = 1, SEARCH = 2, PRINT = 3, DELETE = 4, UPDATE_SCORE = 5, RANK = 6, DONE = 7;
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<StudentList> studentArray = new ArrayList<StudentList>();
		boolean endFlag = false;

		while (endFlag == false) {
			printInstruction();
			int userIns = scan.nextInt();
			switch (userIns) {
			case INPUT:
				inputStudent(studentArray);
				break;
			case SEARCH:
				searchStudent(studentArray);
				break;
			case PRINT:
				printStudents(studentArray);
				break;
			case DELETE:
				deletScore(studentArray);
				break;
			case UPDATE_SCORE:
				updateScore(studentArray);
				break;
			case RANK:
				rank(studentArray);
				break;

			case DONE:
				System.out.println("����Ǿ����ϴ�.");
				endFlag = true;
				break;
			}
		}
	}

	public static void printInstruction() {
		System.out.println("==========================");
		System.out.println("1. �л����� ���\n2. �л������˻�\n3. ��� �л����� ���\n4. �л����� ����\n5. �л����� ����\n6. ���� ��������\n7. ����");
		System.out.println("==========================");
		System.out.print("��ȣ�� �Է��Ͻÿ�: ");
	}

//	studentNumber, String name, int korScore, int engScore, int mathScore
	public static void inputStudent(ArrayList<StudentList> studentArray) {
		int studentNumber = (int) (Math.random() * (20000 - 10000 + 1) + 10000);
		String name = randomHangulName();
		int kor = (int) (Math.random() * (100));
		int eng = (int) (Math.random() * (100));
		int math = (int) (Math.random() * (100));

		StudentList student = new StudentList(studentNumber, name, kor, eng, math);
		studentArray.add(student);
		System.out.println(studentArray.get(studentArray.lastIndexOf(student)).toString());
	}

	public static void searchStudent(ArrayList<StudentList> studentArray) {
		boolean findFlag = false;
		System.out.print("�л��� �й��� �Է��� �ּ���: ");
		scan.nextLine();
		int no = scan.nextInt();
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				System.out.println("�Է��Ͻ� �л��� ������ : " + studentArray.get(i).toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(no + "�й��� �л��� ���� ���� �ʽ��ϴ�.");
		}

	}

	public static void printStudents(ArrayList<StudentList> studentArray) {
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i) == null) {
				break;
			}
			System.out.println(studentArray.get(i).toString());
		}
	}

	public static void deletScore(ArrayList<StudentList> studentArray) {
		System.out.print("�й��� �Է��Ͻÿ� : ");
		int no = scan.nextInt();
		scan.nextLine();
		boolean findFlag = false;
		for (int i = 0; i < studentArray.size(); i++) {
			if (no == studentArray.get(i).getNo()) {
				studentArray.remove(i);
				System.out.println("�����͸� �����߽��ϴ�");
				findFlag = true;
			}
		}
		if (findFlag == false) {
			System.out.println(no + "�й��� �л��� ���� ���� �ʽ��ϴ�.");
		}
	}

	public static void updateScore(ArrayList<StudentList> studentArray) {
		System.out.print("�й��� �Է��Ͻÿ� : ");
		int no = scan.nextInt();
		scan.nextLine();
		boolean findFlag = false;
		for (int i = 0; i < studentArray.size(); i++) {
			if (no == studentArray.get(i).getNo()) {
				System.out.print("���������� �����մϴ�. : ");
				int kor = scan.nextInt();
				System.out.print("���������� �����մϴ�. : ");
				int eng = scan.nextInt();
				System.out.print("���������� �����մϴ�. : ");
				int math = scan.nextInt();
				studentArray.get(i).setKor(kor);
				studentArray.get(i).setEng(eng);
				studentArray.get(i).setMath(math);
				findFlag = true;
				System.out.println("������ �Ϸ��߽��ϴ�.");
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(no + "�й��� �л��� ���� ���� �ʽ��ϴ�.");
		}
	}

	public static void rank(ArrayList<StudentList> studentArray) {
		Collections.sort(studentArray);
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i) == null) {
				break;
			}
			System.out.println(studentArray.get(i).toString());
		}
	}

	public static String randomHangulName() {
		List<String> firstName = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "Ȳ", "��", "��", "��", "��", "ȫ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "ä", "��", "õ", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"ǥ", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��",
				"��", "��");
		List<String> lastName = Arrays.asList("��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "â", "ä", "õ", "ö", "��", "��", "��", "ġ", "Ž", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "ȣ", "ȫ", "ȭ", "ȯ", "ȸ", "ȿ", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "ȥ", "Ȳ", "��", "��", "��", "��", "��", "��", "��", "Ź", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "Ÿ", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��", "��",
				"��", "��", "��", "��", "��", "��", "��", "��", "��");
		Collections.shuffle(firstName);
		Collections.shuffle(lastName);
		return firstName.get(0) + lastName.get(0) + lastName.get(1);
	}

}
