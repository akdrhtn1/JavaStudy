package com.mystudy.jdbc3_prepared;

import java.sql.*;

public class StudentManager_Insert {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			//DB연결
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//PreparedStatement 객체 만들기
			String sql = "";
			sql += "INSERT INTO STUDENT ";
			sql += "        (ID, NAME, KOR, ENG, MATH) ";
			sql += "VALUES (?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			// 앞에 숫자의 위치는 상관 없지만 보기 편하기 위해 순서대로 작성
			pstmt.setString(1, "2021022");
			pstmt.setString(2, "테스트");
			pstmt.setInt(3, 100);
			pstmt.setInt(4, 95);
			pstmt.setInt(5, 85);
			
			// SQL문 실행
			int result = pstmt.executeUpdate();
			System.out.println(">> 실행횟수 : " + result);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (pstmt != null)
					pstmt.close();
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
