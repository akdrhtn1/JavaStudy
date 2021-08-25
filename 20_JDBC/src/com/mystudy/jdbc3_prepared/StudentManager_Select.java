package com.mystudy.jdbc3_prepared;

import java.sql.*;

public class StudentManager_Select {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 1. JDBC 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB연결 - Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			
			//conn.createStatement();
			// 3. Statement 문 실행(SQL 문 싱행)
			String sql = "";
			sql += "SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG FROM STUDENT ";
		//	sql += "WHERE ID = ?";
			// 3-1 Connection 객체로 부터 prepareStatement 객체 생성
			
			pstmt = conn.prepareStatement(sql);
			//3-2 ?(바인드변수) 위치에 값 대입
			String id = "2021001";
		//	pstmt.setString(1, id);
			//3-3 Statement(PreparedStatement) 실행
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String str = "";
				str += rs.getString(1) + "  "; // id숫자로가능
				str += rs.getString("NAME") + "\t"; // db의 컬럼명으로도 가능
				str += rs.getInt("KOR") + "\t";
				str += rs.getInt("ENG") + "\t";
				str += rs.getInt("MATH") + "\t";
				str += rs.getInt("TOT") + "\t";
				str += rs.getDouble("AVG");
				System.out.println(str);
			}
			
		} catch (ClassNotFoundException e) {
	
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

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
