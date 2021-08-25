package com.mystudy.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManger_Update {

	
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 try {
			conn = DriverManager.getConnection(
					 "jdbc:oracle:thin:@localhost:1521:xe", 
					 "mystudy", "mystudypw");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 Statement stmt =null;
		 
		 try {
			 //3-1 Connection 객체로 부터 Statement 객체 생성
			 StringBuilder sb = new StringBuilder();
			 stmt = conn.createStatement();
			// 수정처리 : 김유신(2021003)의 점수 수정
			// 국어: 95, 영어: 85, 수학: 75 으로 수정
			sb.append("UPDATE STUDENT");
			sb.append(" SET KOR = 95, ENG = 85, MATH = 75 ");
			sb.append("WHERE NAME = '홍길동'");
			//빼올꺼 이거 
			int result = stmt.executeUpdate(sb.toString());
			//홍길동 경우 2건이  처리됨
			System.out.println("처리건수 : " + result);
			sb.setLength(0);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		 
		 if(stmt != null) {
			 try {
				stmt.close();
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		 }
		 if(conn != null) {
			 try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		 }
	}

}
