package com.mystudy.jdbc3_prepared;

import java.sql.*;

public class StudentManager_Update {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstm = null;
		StringBuilder sb = new StringBuilder();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", 
					"mystudy", "mystudypw");
			sb.append("UPDATE STUDENT ");
			sb.append("SET NAME = ? ");
			sb.append("    ,KOR = ? ");
			sb.append("    ,ENG = ? ");
			sb.append("    ,MATH = ? ");
			sb.append("WHERE ID =? ");
			
			pstm = conn.prepareStatement(sb.toString());
			
			pstm.setString(1, "홍짜");
			pstm.setInt(2, 60);
			pstm.setInt(3, 70);
			pstm.setInt(4, 80);
			pstm.setString(5, "2021006");
			
			int result = pstm.executeUpdate();
			System.out.println(">> 업데이트 완료" + result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
