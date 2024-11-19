package chapter14;

import java.io.Serializable;

public class Student implements Comparable<Student>, Serializable{
	private int num;
	private String name;
	private int score;

	public Student() {
		this(0, null, 0);
	}

	public Student(int num, String name, int score) {
		super();
		this.num = num;
		this.name = name;
		this.score = score;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Student [" + num + ", " + name + ", " + score + "]";
	}

	@Override
	public int hashCode() {
		return num;
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Student stu)) {
			return false;
		}
		return this.num == stu.num;
	}

	@Override
	public int compareTo(Student stu) {
		return num - stu.num;
	}

}
