package com.kh.subjectMVCProject.controller;

import java.sql.Connection;

public class Test {

	public static void main(String[] args) {
		Connection con = DBUtility.dbCon();
		if(con != null) {
			System.out.println("db 접속 성공");
		}else {
			System.out.println("db 접속 실패");
		}
	}

}
