package com.mystudy.jdbc2_statement;

import java.sql.*;

public class StudentManager_Delete {

//    JDBC 이용한 DB 연동 프로그래밍 작성 절차
//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		
		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. DB연결 - Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			System.out.println(">> DB연결 성공");

			stmt = conn.createStatement();
			//수정 ID:2021007 사람의 데이터를 
			//이름 :홍기동, 국어:99,영어:88, 수학:77
			String id = "2021007";
			String name = "홍기동";
			int kor = 99;
			int eng = 88;
			int math = 77;
			// 변수처리
			
					String sql = "" ; // 합쳐지기 떄문에 한칸씩 띄어져야함 SELECT 끝 FROM 끝
			sql += "DELETE FROM STUDENT WHERE ID = '" + id +"' ";
			System.out.println("sql : " + sql);
			int result = stmt.executeUpdate(sql);

			
			System.out.println(">>처리건수 : " + result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 X");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB오류");
		} finally {

			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

			try {
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
