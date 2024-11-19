package chapter06;

public class Student {

	private String name;
	private int studentNumber, korScore, engScore, mathScore;

	public Student(int studentNumber, String name, int korScore, int engScore, int mathScore) {
		super();
		this.studentNumber = studentNumber;
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public int getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(int studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", studentNumber=" + studentNumber + ", korScore=" + korScore + ", engScore="
				+ engScore + ", mathScore=" + mathScore + ", sum()=" + sum() + ", avg()=" + avg() + "]";
	}

	public int sum() {
		return korScore + engScore + mathScore;
	}

	public double avg() {
		return sum() / 3.0;
	}

}
