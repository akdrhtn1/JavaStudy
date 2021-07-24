package com.mystudy.stringbuilder;

import java.util.StringTokenizer;

public class Ex03_StringTokenizer {

	public static void main(String[] args) {
		//	String split() vs StringTokenizer
		System.out.println("----- String split() ----");
		String str = "사과,배,복숭아,,포도";
		System.out.println("str : " + str);
		
		String[] strSplit = str.split(","); // 스플릿은 배열로 만들어 주는데 빈 문자열도 유의미한 문자열로 만들어준다.
		
			System.out.println(strSplit.length);
		
		for(int i =0 ; i <strSplit.length; i++) {
			//System.out.println(strSplit[i] );
			System.out.println(i + " : -" + strSplit[i] +"-");
			
		}
		System.out.println("--개선된 for문 형태로--");
		for(String str2 : strSplit) {
			System.out.println("-" + str2 +"-");
		}
		System.out.println("-----------");
		
		int idx = 0;
		for(String str2 : strSplit) {
			System.out.println(idx++ + ": -" + str2 + "-");
		}

		System.out.println("=========================");
		
		System.out.println("------- StringTokenizer 사용 -------");
		
		
		str = "사과,배,복숭아,,포도";
		StringTokenizer strToken = new StringTokenizer(str, ","); //문자열을 나눠주는데 빈 문자열은 버려준다.
		
		System.out.println("strToken.countTokens() :" + strToken.countTokens());   // -> 문자열 length()랑 같은 효과
		
		while(strToken.hasMoreTokens())  { //토큰이 있냐?   <빈문자를 토크닝 하지 않는다>
			String token = strToken.nextToken();  // 토큰을 한개씩 끄낸다
			System.out.println("-" + token + "-");
			
		}
		System.out.println("저장된 토큰갯수 : " + strToken.countTokens()); //
		
		//======================================
		System.out.println("---- for 문 사용 토큰값 조회 ---");
		strToken = new StringTokenizer(str, ",");
		System.out.println("저장된 토큰갯수 : " + strToken.countTokens()); //
		
		
		
		//for문 쓰면 countTokens 개수가 점점 줄어들기 떄문에 올바르지 않은 결과가 나옴
		int Tokencnt =  strToken.countTokens();
		//그래서 값을 담아둘 곳이 필요함
		for(int i=0; i < Tokencnt; i++) {
			String token = strToken.nextToken();  // 토큰을 한개씩 끄낸다
			System.out.println("-" + token + "-");
		}
		
		System.out.println("저장된 토큰갯수 : " + strToken.countTokens()); //
		
		
		
		
	}

}
