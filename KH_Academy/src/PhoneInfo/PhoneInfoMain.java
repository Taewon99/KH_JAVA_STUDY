package PhoneInfo;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PhoneInfoMain implements Menu {

	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<PhoneInfo> list = new ArrayList<PhoneInfo>();
		boolean exitFlag = false;
		int inputNumber =1;

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
				System.out.print("찾을사람의 전화번호를 입력하세요. ");
				String phoneNumber = sc.nextLine();
				PhoneInfo pi = searchData(list, phoneNumber);
				if (pi != null) {
					System.out.println(pi);
				} else {
					System.out.println("찾는 번호가 없습니다.");
				}
				break;
			case DELETE:
				System.out.print("삭제할 사람의 전화번호를 입력하세요. ");
				String phoneNumber1 = sc.nextLine();
				boolean deleteFlag = deleteData(list, phoneNumber1);
				System.out.println((deleteFlag == true) ? "삭제성공" : "삭제실패 전화번호 입력 점검");
				break;
			case PRINT:
				printData(list);
				break;
			case EXIT:
				System.out.println("종료");
				exitFlag = true;
				break;
			default:
				break;
			}
		} // end of for
		System.out.println("The end");
	}// end of main

	public static void showMenu() {
		System.out.println("선택하세요");
		System.out.println("1. 데이터입력");
		System.out.println("2. 데이터 검색");
		System.out.println("3. 데이터 삭제");
		System.out.println("4. 데이터 출력");
		System.out.println("5. 프로그램 종료");
		System.out.print("선택 : ");
	}

	private static int inputData() {
		System.out.println("선택하세요");
		System.out.print("1. 일반 ");
		System.out.print("2. 대학 ");
		System.out.println("3. 회사");
		System.out.print("선택 : ");
		int num = sc.nextInt();
		sc.nextLine();
		return num;
	}

	public static void insertData(ArrayList<PhoneInfo> list, int inputNumber) {
		String name = randomHangulName();
		String phoneNumber = null;
		PhoneInfo pi = null;
		while (true) {
			phoneNumber = makeNumber();
			pi = searchData(list, phoneNumber);
			if (pi == null) {
				break;
			}
			System.out.println("이 번호는 존재하는 번호입니다.");
		}
		switch(inputNumber) {
		case 1:
			String birthday = makeBirth();
			pi = new PhoneInfo(name, phoneNumber, birthday);
			list.add(pi);
			break;
		case 2:
			System.out.println("전공을 입력하세요");
			String major = sc.nextLine();
			int year = (int)(Math.random()*(4)+1);
			pi = new PhoneUnivInfo(name, phoneNumber, major, year);
			list.add(pi);
			break;
		case 3:
			System.out.println("회사명을 입력하세요");
			String company = sc.nextLine();
			pi = new PhoneCompanyInfo(name, phoneNumber, company);
			list.add(pi);
			break;
		}
		System.out.println("입력된 정보 출력...\n" + pi);
	}

	public static PhoneInfo searchData(List<PhoneInfo> list, String phoneNumber) {
		PhoneInfo pi = null;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(phoneNumber)) {
				pi = list.get(i);
				break;
			}
		}
		return pi;
	}

	public static boolean deleteData(List<PhoneInfo> list, String phoneNumber) {
		boolean deleteFlag = false;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPhoneNumber().equals(phoneNumber)) {
				list.remove(i);
				deleteFlag = true;
				break;
			}
		}
		return deleteFlag;
	}

	private static void printData(ArrayList<PhoneInfo> list) {
		for (PhoneInfo data : list) {
			System.out.println(data);
		}
	}

	public static String randomHangulName() {
		List<String> firstName = Arrays.asList("김", "이", "박", "최", "정", "강", "조", "윤", "장", "임", "한", "오", "서", "신",
				"권", "황", "안", "송", "류", "전", "홍", "고", "문", "양", "손", "배", "조", "백", "허", "유", "남", "심", "노", "정", "하",
				"곽", "성", "차", "주", "우", "구", "신", "임", "나", "전", "민", "유", "진", "지", "엄", "채", "원", "천", "방", "공", "강",
				"현", "함", "변", "염", "양", "변", "여", "추", "노", "도", "소", "신", "석", "선", "설", "마", "길", "주", "연", "방", "위",
				"표", "명", "기", "반", "왕", "금", "옥", "육", "인", "맹", "제", "모", "장", "남", "탁", "국", "여", "진", "어", "은", "편",
				"구", "용");
		List<String> lastName = Arrays.asList("가", "강", "건", "경", "고", "관", "광", "구", "규", "근", "기", "길", "나", "남", "노",
				"누", "다", "단", "달", "담", "대", "덕", "도", "동", "두", "라", "래", "로", "루", "리", "마", "만", "명", "무", "문", "미",
				"민", "바", "박", "백", "범", "별", "병", "보", "빛", "사", "산", "상", "새", "서", "석", "선", "설", "섭", "성", "세", "소",
				"솔", "수", "숙", "순", "숭", "슬", "승", "시", "신", "아", "안", "애", "엄", "여", "연", "영", "예", "오", "옥", "완", "요",
				"용", "우", "원", "월", "위", "유", "윤", "율", "으", "은", "의", "이", "익", "인", "일", "잎", "자", "잔", "장", "재", "전",
				"정", "제", "조", "종", "주", "준", "중", "지", "진", "찬", "창", "채", "천", "철", "초", "춘", "충", "치", "탐", "태", "택",
				"판", "하", "한", "해", "혁", "현", "형", "혜", "호", "홍", "화", "환", "회", "효", "훈", "휘", "희", "운", "모", "배", "부",
				"림", "봉", "혼", "황", "량", "린", "을", "비", "솜", "공", "면", "탁", "온", "디", "항", "후", "려", "균", "묵", "송", "욱",
				"휴", "언", "령", "섬", "들", "견", "추", "걸", "삼", "열", "웅", "분", "변", "양", "출", "타", "흥", "겸", "곤", "번", "식",
				"란", "더", "손", "술", "훔", "반", "빈", "실", "직", "흠", "흔", "악", "람", "뜸", "권", "복", "심", "헌", "엽", "학", "개",
				"롱", "평", "늘", "늬", "랑", "얀", "향", "울", "련");
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
		// 최종본 랜덤1900~2024+"년 "+랜덤 1~12+" "+랜덤 1~31+"일"
		return "" + year + "/" + month + "/" + day;
	}

}