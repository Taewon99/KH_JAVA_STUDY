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
				System.out.println("종료되었습니다.");
				endFlag = true;
				break;
			}
		}
	}

	public static void printInstruction() {
		System.out.println("==========================");
		System.out.println("1. 학생정보 등록\n2. 학생정보검색\n3. 모든 학생정보 출력\n4. 학생정보 삭제\n5. 학생성적 수정\n6. 성적 순위보기\n7. 종료");
		System.out.println("==========================");
		System.out.print("번호를 입력하시오: ");
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
		System.out.print("학생의 학번을 입력해 주세요: ");
		scan.nextLine();
		int no = scan.nextInt();
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				System.out.println("입력하신 학생의 정보는 : " + studentArray.get(i).toString());
				findFlag = true;
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(no + "학번의 학생은 존재 하지 않습니다.");
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
		System.out.print("학번을 입력하시오 : ");
		int no = scan.nextInt();
		scan.nextLine();
		boolean findFlag = false;
		for (int i = 0; i < studentArray.size(); i++) {
			if (no == studentArray.get(i).getNo()) {
				studentArray.remove(i);
				System.out.println("데이터를 삭제했습니다");
				findFlag = true;
			}
		}
		if (findFlag == false) {
			System.out.println(no + "학번의 학생은 존재 하지 않습니다.");
		}
	}

	public static void updateScore(ArrayList<StudentList> studentArray) {
		System.out.print("학번을 입력하시오 : ");
		int no = scan.nextInt();
		scan.nextLine();
		boolean findFlag = false;
		for (int i = 0; i < studentArray.size(); i++) {
			if (no == studentArray.get(i).getNo()) {
				System.out.print("국어점수를 변경합니다. : ");
				int kor = scan.nextInt();
				System.out.print("영어점수를 변경합니다. : ");
				int eng = scan.nextInt();
				System.out.print("수학점수를 변경합니다. : ");
				int math = scan.nextInt();
				studentArray.get(i).setKor(kor);
				studentArray.get(i).setEng(eng);
				studentArray.get(i).setMath(math);
				findFlag = true;
				System.out.println("변경을 완료했습니다.");
				break;
			}
		}
		if (findFlag == false) {
			System.out.println(no + "학번의 학생은 존재 하지 않습니다.");
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

}
