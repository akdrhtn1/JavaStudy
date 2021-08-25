package com.mystudy.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentManager_Select {

//    JDBC 이용한 DB 연동 프로그래밍 작성 절차
//0. JDBC 라이브러리 개발환경 설정(빌드경로에 등록)

	public static void main(String[] args) {
		
		//1. JDBC 드라이버 로딩
		Connection conn = null;
		Statement stmt=null;
		ResultSet rs = null;
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println(">> 드라이버 로딩 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("[예외발생]>> 드라이버 로딩 실패!!!");
			e.printStackTrace();
		}
		
		//2. DB연결 -Connection 객체 생성 <- DriverManager
		try {
			 conn = DriverManager.getConnection(
					 "jdbc:oracle:thin:@localhost:1521:xe", 
					 "mystudy", "mystudypw");
			 System.out.println(">> DB연결 성공");
		} catch (SQLException e) {
			System.out.println("[예외] DB연결 실패!!!");
			e.printStackTrace();
		}
		
		//3. Statement 문 실행(SQL 문 실행)
		try {
			//Connection 객체로부터 Statement 객체 생성
			stmt = conn.createStatement();
			String sql = "" + //합쳐지기 떄문에 한칸씩 띄어져야함 SELECT 끝 FROM 끝
						"SELECT ID, NAME, KOR, ENG, MATH, TOT, AVG "
					  + "FROM STUDENT "
					  +	"ORDER BY NAME";
			rs =stmt.executeQuery(sql);
			
			//4. SQL 실행 결과에 대한 처리
			System.out.println(">>> SELECT 결과 처리 -----");
			while(rs.next()) {
				String str = "";
				str += rs.getString(1) + "  ";  //id숫자로가능
				str += rs.getString("NAME") + "\t"; //db의 컬럼명으로도 가능
				str += rs.getInt("KOR") + "\t";
				str += rs.getInt("ENG") + "\t";
				str += rs.getInt("MATH") + "\t";
				str += rs.getInt("TOT") + "\t";
				str += rs.getDouble("AVG");
				System.out.println(str);
			}
			//sql 문장이 와야함 String Builder 써보자 !!! str 말고
		} catch (SQLException e1) {
			
			e1.printStackTrace();
		}

		//- SELECT : 조회(검색) 데이터 결과 값에 대한 처리 
		//- INSERT, UPDATE, DELETE : int 값(건수) 처리
		//5. 클로징 처리에 의한 자원 반납
		
		if(rs != null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		if(stmt != null){
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
