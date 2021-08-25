package com.mystudy.jdbc3_prepared;

import java.sql.*;

public class StudentManager_Delete {

	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		StringBuilder sb = new StringBuilder();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			
			sb.append("DELETE FROM STUDENT WHERE ID = ?");
			pstmt = conn.prepareStatement(sb.toString());
			
			pstmt.setString(1, "2021022");
			
			int result = pstmt.executeUpdate();
			System.out.println(">>처리결과 : " + result +"건");
			
			sb.setLength(0);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
				try {
					if(pstmt != null) {
						pstmt.close();
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				try {
					if(conn != null) {
						conn.close();
					}
				}catch (SQLException e) {
					e.printStackTrace();
				}
		}

	}

}
