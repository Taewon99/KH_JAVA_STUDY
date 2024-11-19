package chapter04;

public class Student {
	private String school, studentNum, name;
	private int age, grade;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public String getStudentNum() {
		return studentNum;
	}

	public void setStudentNum(String studentNum) {
		this.studentNum = studentNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	// 생성자 함수
	public Student(String school, String studentNum, String name, int age, int grade) {
		this.school = school;
		this.studentNum = studentNum;
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	public Student() {

	}

	// 함수
	public String getAll() {
		return school + " " + studentNum + " " + name + " " + age + " " + grade;
	}


}
