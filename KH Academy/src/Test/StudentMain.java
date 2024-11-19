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
				System.out.println("종료");
				doneFlag = true;
				break;
			}
		}
	}

	public static void userIns() {
		System.out.println("===============");
		System.out.println(
				"원하는 번호를 선택 하세요:\n1. 학생정보 입력\n2. 학생정보 검색\n3. 전체 학생정보 출력\n4. 학생정보 삭제\n5. 학생성적 수정\n6. 성적순 정렬\n7. 종료");
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
		System.out.print("학생의 학번을 입력해주세요: ");
		int no = scan.nextInt();
		boolean searchFlag = false;
		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				System.out.println(studentArray.get(i).toString());
				searchFlag = true;
			}
		}
		if (searchFlag == false) {
			System.out.println(no + " 학번의 학생이 존재하지 않습니다.");
		}
	}

	public static void printStudents() {
		for (int i = 0; i < studentArray.size(); i++) {
			System.out.println(studentArray.get(i).toString());
		}
	}

	public static void deleteStudent() {
		System.out.print("학생의 학번을 입력해주세요: ");
		int no = scan.nextInt();
		boolean searchFlag = false;

		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				studentArray.remove(i);
				searchFlag = true;
			}
		}
		if (searchFlag == false) {
			System.out.println(no + " 학번의 학생이 존재하지 않습니다.");
		}
	}

	public static void updateStudentScore() {
		System.out.print("학생의 학번을 입력해주세요: ");
		int no = scan.nextInt();
		boolean searchFlag = false;

		for (int i = 0; i < studentArray.size(); i++) {
			if (studentArray.get(i).getNo() == no) {
				System.out.print("국어 성적을 입력해 주세요: ");
				int kor = scan.nextInt();
				System.out.print("영어 성적을 입력해 주세요: ");
				int eng = scan.nextInt();
				System.out.print("수학 성적을 입력해 주세요: ");
				int math = scan.nextInt();
				studentArray.get(i).setKor(kor);
				studentArray.get(i).setEng(eng);
				studentArray.get(i).setMath(math);
				System.out.println(no + " 학번의 학생 성적수정이 완료 되었습니다.");
				searchFlag = true;
			}
		}
		if (searchFlag == false) {
			System.out.println(no + " 학번의 학생이 존재하지 않습니다.");
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
