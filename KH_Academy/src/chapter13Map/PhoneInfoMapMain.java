package chapter13Map;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PhoneInfoMapMain implements Menu {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<String, PhoneInfo> list = new HashMap<String, PhoneInfo>();
		boolean exitFlag = false;
		int inputNumber = 1;

		while (!exitFlag) {
			showMenu();
			int menu = sc.nextInt();
			sc.nextLine();
			switch (menu) {
			case INPUT:
				inputNumber = inputData();
				insertData(list, inputNumber);
				break;
			case SEARCH:
				System.out.print("ã������� ��ȭ��ȣ�� �Է��ϼ���. ");
				String phoneNumber = sc.nextLine();
				PhoneInfo pi = searchData(list, phoneNumber);
				if (pi != null) {
					System.out.println(pi);
				} else {
					System.out.println("ã�� ��ȣ�� �����ϴ�.");
				}
				break;
			case DELETE:
				System.out.print("������ ����� ��ȭ��ȣ�� �Է��ϼ���. ");
				String phoneNumber1 = sc.nextLine();
				boolean deleteFlag = deleteData(list, phoneNumber1);
				System.out.println((deleteFlag == true) ? "��������" : "�������� ��ȭ��ȣ �Է� ����");
				break;
			case PRINT:
				printData(list);
				break;
			case EXIT:
				System.out.println("����");
				exitFlag = true;
				break;
			default:
				break;
			}
		} // end of for
		System.out.println("The end");
	}// end of main

	public static void showMenu() {
		System.out.println("�����ϼ���");
		System.out.println("1. �������Է�");
		System.out.println("2. ������ �˻�");
		System.out.println("3. ������ ����");
		System.out.println("4. ������ ���");
		System.out.println("5. ���α׷� ����");
		System.out.print("���� : ");
	}

	private static int inputData() {
		System.out.println("�����ϼ���");
		System.out.print("1. �Ϲ� ");
		System.out.print("2. ���� ");
		System.out.println("3. ȸ��");
		System.out.print("���� : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static void insertData(HashMap<String, PhoneInfo> list, int inputNumber) {
		String name = randomHangulName();
		String phoneNumber = null;
		PhoneInfo pi = null;
		boolean duplicateFlag = false;
		do {
			phoneNumber =makeNumber();
			switch (inputNumber) {
			case 1:
				String birthday = makeBirth();
				pi = new PhoneInfo(name, phoneNumber, birthday);
				if (list.put(phoneNumber, pi) != null) {
					System.out.println("�� ��ȣ�� �����ϴ� ��ȣ�Դϴ�.");
					duplicateFlag = true;
				}else {
					duplicateFlag = false;
				}
				break;
			case 2:
				System.out.println("������ �Է��ϼ���");
				String major = sc.nextLine();
				int year = (int) (Math.random() * (4) + 1);
				pi = new PhoneUnivInfo(name, phoneNumber, major, year);
				if (list.put(phoneNumber, pi) != null) {
					System.out.println("�� ��ȣ�� �����ϴ� ��ȣ�Դϴ�.");
					duplicateFlag = true;
				}else {
					duplicateFlag = false;
				}
				break;
			case 3:
				System.out.println("ȸ����� �Է��ϼ���");
				String company = sc.nextLine();
				pi = new PhoneCompanyInfo(name, phoneNumber, company);
				if (list.put(phoneNumber, pi) != null) {
					System.out.println("�� ��ȣ�� �����ϴ� ��ȣ�Դϴ�.");
					duplicateFlag = true;
				}else {
					duplicateFlag = false;
				}
				break;
			}
			System.out.println("�Էµ� ���� ���...\n" + pi);
		} while (duplicateFlag == true);

	}

	public static PhoneInfo searchData(HashMap<String, PhoneInfo> list, String phoneNumber) {
		PhoneInfo pi = null;
		Set<String> set = list.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String phone = it.next();
			if (phone.equals(phoneNumber)) {
				pi = list.get(phone);
				break;
			}
		}
		return pi;
	}

	public static boolean deleteData(HashMap<String, PhoneInfo> list, String phoneNumber) {
		boolean deleteFlag = false;
		PhoneInfo pi = null;
		Set<String> set = list.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next();
			if (key.equals(phoneNumber)) {
				list.remove(key);
				deleteFlag = true;
				break;
			}
		}
		return deleteFlag;
	}

	private static void printData(HashMap<String, PhoneInfo> list) {
		Set<String> set = list.keySet();
		Iterator<String> it = set.iterator();

		while (it.hasNext()) {
			String key = it.next();
			System.out.println(list.get(key));
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

	public static String makeNumber() {
		List<String> no0 = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
		StringBuffer sb = new StringBuffer("010-");
		for (int i = 0; i < 7; i++) {
			Collections.shuffle(no0);
			sb.append(no0.get(0));
			if (i == 2) {
				sb.append("-");
			}
		}
		return sb.toString();
	}

	public static String makeBirth() {
		int year = (int) (Math.random() * (2024 - 1920 + 1) + 1920);
		int month = (int) (Math.random() * (12 - 1 + 1) + 1);
		int day = (int) (Math.random() * (31 - 1 + 1) + 1);
		// ������ ����1900~2024+"�� "+���� 1~12+" "+���� 1~31+"��"
		return "" + year + "/" + month + "/" + day;
	}

}