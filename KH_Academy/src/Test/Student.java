package Test;

import java.util.Objects;

public class Student implements Comparable<Student>{
	public static final int SUB = 3;
	private int no;
	private String name;
	private int kor, eng, math;

	public Student(int no, String name, int kor, int eng, int math) {
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
		return sum() / (double) SUB;
	}

	@Override
	public String toString() {
		return "[" + no + ", " + name + ", " + kor + ", " + eng + ", " + math + ", " + sum() + ", " + avg() + "]";
	}

	@Override
	public int compareTo(Student student) {
		return (int) this.avg() - (int) student.avg();
	}

	@Override
	public int hashCode() {
		return Objects.hash(no, name);
	}

	@Override
	public boolean equals(Object obj) {
		Student stu = null;
		if (!(obj instanceof Student)) {
			System.out.println("객체비교 불가");
			return false;
		}
		stu = (Student) obj;
		if (no == stu.no && name.equals(stu.name)) {
			return true;
		}
		return false;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return (Student)super.clone();
	}

}
