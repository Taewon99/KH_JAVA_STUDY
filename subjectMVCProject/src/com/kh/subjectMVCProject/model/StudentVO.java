package com.kh.subjectMVCProject.model;

import java.sql.Date;

public class StudentVO {
	private int no;				// pk, seq
	private String num;			// 학번(년도학과번호)
	private String name;		// 이름
	private String id;			// 아이디
	private	String password;	// 패스워드
	private	String s_num;		// 학과번호(fk)
	private String birthday;	// 생년월일 
	private	String phone;		// 전화번호
	private	String address;		// 주소
	private	String email;		// 이메일
	private Date date;			// 등록일
	
	public StudentVO() {}

	public StudentVO(int no, String num, String name, String id, String password, String s_num, String birthday,
			String phone, String address, String email, Date date) {
		super();
		this.no = no;
		this.num = num;
		this.name = name;
		this.id = id;
		this.password = password;
		this.s_num = s_num;
		this.birthday = birthday;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.date = date;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getS_num() {
		return s_num;
	}

	public void setS_num(String s_num) {
		this.s_num = s_num;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "[no=" + no + ", num=" + num + ", name=" + name + ", id=" + id + ", password=" + password
				+ ", s_num=" + s_num + ", birthday=" + birthday + ", phone=" + phone + ", address=" + address
				+ ", email=" + email + ", date=" + date + "]";
	}

}
