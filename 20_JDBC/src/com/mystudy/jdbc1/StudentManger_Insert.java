package com.mystudy.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManger_Insert {

	
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
			 StringBuilder sb = new StringBuilder();
			 stmt = conn.createStatement();
			
			sb.append("INSERT INTO STUDENT");
			sb.append(" (ID ,NAME ,KOR ,ENG ,MATH ,TOT ,AVG) ");
			sb.append("VALUES ('2021003', '김유신', 100, 90, 80, 0, 0)");
			//빼올꺼 이거 
			int result = stmt.executeUpdate(sb.toString());
			
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
