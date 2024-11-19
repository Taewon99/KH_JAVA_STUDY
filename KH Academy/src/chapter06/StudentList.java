package chapter06;

public class StudentList implements Comparable<StudentList> {
	public static final int SUB_NUM = 3;
	private int no;
	private String name;
	private int kor, eng, math;

	public StudentList() {
		this(0, null, 0, 0, 0);
	}

	public StudentList(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int sum() {
		return kor + eng + math;
	}

	public double avg() {
		return sum() / (double) SUB_NUM;
	}

	@Override
	public String toString() {
		return "[" + no + ", " + name + ", " + kor + ", " + eng + ", " + math + ", " + sum() + ", " + avg() + "]";
	}

	@Override
	public int compareTo(StudentList studentList) {
		
		return (int)studentList.avg()-(int)this.avg();
	}
}
