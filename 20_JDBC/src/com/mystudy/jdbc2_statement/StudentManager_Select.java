package com.mystudy.jdbc2_statement;

import java.sql.*;

public class StudentManager_Select {

//    JDBC 이용한 DB 연동 프로그래밍 작성 절차
//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");

			// 2. DB연결 - Connection 객체 생성
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "mystudy", "mystudypw");
			System.out.println(">> DB연결 성공");

			stmt = conn.createStatement();
			String id = "2021001";
			// 변수처리
			String sql = "" + // 합쳐지기 떄문에 한칸씩 띄어져야함 SELECT 끝 FROM 끝
					"SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG " + "FROM STUDENT ";
			//		"WHERE ID = '"+ id +  "'";

			rs = stmt.executeQuery(sql);

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
			System.out.println(">> 작업 정상 처리 완료");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 X");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB오류");
		} finally {

			try {
				if (rs != null)
					rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
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
