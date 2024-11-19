package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentMain {
	public static final int INPUT = 1, SEARCH = 2, PRINT = 3, DELETE = 4, UPDATE_SCORE = 5, RANK = 6, DONE = 7;

	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<Student> studentArray = new ArrayList<Student>();

	public static void main(String[] args) {

		boolean doneFlag = false;

		while (doneFlag == false) {
			userIns();
			int userAns = scan.nextInt();
			switch (userAns) {
			case INPUT:
				inputStudent();
				break;
			case SEARCH:
				searchStudent();
				break;
			case PRINT:
				printStudents();
				break;
			case DELETE:
				deleteStudent();
				break;
			case UPDATE_SCORE:
				updateStudentScore();
				break;
			case RANK:
				rankStudents();
				break;
			case DONE:
				System.out.println("����");
				doneFlag = true;
				break;
			}
		}
	}

	public static void userIns() {
		System.out.println("===============");
		System.out.println(
				"���ϴ� ��ȣ�� ���� �ϼ���:\n1. �л����� �Է�\n2. �л����� �˻�\n3. ��ü �л����� ���\n4. �л����� ����\n5. �л����� ����\n6. ������ ����\n7. ����");
		System.out.println("===============");
	}

	public static void inputStudent() {
		int no = (int) (Math.random() * (100) + 1);
		String name = randomHangulName();
		int kor = (int) (Math.random() * (100));
		int eng = (int) (Math.random() * (100));
		int math = (int) (Math.random() * (100));

		Student student = new Student(no, name, kor, eng, math);

		studentArray.add(student);
		System.out.println(student);
	}

	public static void searchStudent() {
		System.out.print("�л��� �й��� �Է����ּ���: ");
		int no = scan.nextInt();
		boolean searchFlag = false;
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				System.out.println(studentArray.get(i).toString());
				searchFlag = true;
			}
		}
		if (searchFlag == false) {
			System.out.println(no + " �й��� �л��� �������� �ʽ��ϴ�.");
		}
	}

	public static void printStudents() {
		for (int i = 0; i < studentArray.size(); i++) {
			System.out.println(studentArray.get(i).toString());
		}
	}

	public static void deleteStudent() {
		System.out.print("�л��� �й��� �Է����ּ���: ");
		int no = scan.nextInt();
		boolean searchFlag = false;

		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				studentArray.remove(i);
				searchFlag = true;
			}
		}
		if (searchFlag == false) {
			System.out.println(no + " �й��� �л��� �������� �ʽ��ϴ�.");
		}
	}

	public static void updateStudentScore() {
		System.out.print("�л��� �й��� �Է����ּ���: ");
		int no = scan.nextInt();
		boolean searchFlag = false;

		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				System.out.print("���� ������ �Է��� �ּ���: ");
				int kor = scan.nextInt();
				System.out.print("���� ������ �Է��� �ּ���: ");
				int eng = scan.nextInt();
				System.out.print("���� ������ �Է��� �ּ���: ");
				int math = scan.nextInt();
				studentArray.get(i).setKor(kor);
				studentArray.get(i).setEng(eng);
				studentArray.get(i).setMath(math);
				System.out.println(no + " �й��� �л� ���������� �Ϸ� �Ǿ����ϴ�.");
				searchFlag = true;
			}
		}
		if (searchFlag == false) {
			System.out.println(no + " �й��� �л��� �������� �ʽ��ϴ�.");
		}
	}

	public static void rankStudents() {
		Collections.reverse(studentArray);
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
