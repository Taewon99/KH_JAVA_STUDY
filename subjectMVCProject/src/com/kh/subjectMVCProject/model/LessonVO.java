package com.kh.subjectMVCProject.model;

public class LessonVO {
	private int num;			// pk, seq
    private String abbre;		// 과목요약
    private String name;		// 과목이름
    
	public LessonVO() {}

	public LessonVO(int num, String abbre, String name) {
		super();
		this.num = num;
		this.abbre = abbre;
		this.name = name;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getAbbre() {
		return abbre;
	}

	public void setAbbre(String abbre) {
		this.abbre = abbre;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "[num=" + num + ", abbre=" + abbre + ", name=" + name + "]";
	}
    
}
