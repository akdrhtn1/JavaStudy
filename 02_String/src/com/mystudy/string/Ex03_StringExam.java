package com.mystudy.string;

import java.util.Scanner;

public class Ex03_StringExam {

	public static void main(String[] args) {
		/*
		 * String str = "900108-11234567 주민번호 1. 정확히 입력된 데이터 여부 확인 (전체자리수 : 14, '-' :
		 * 7번쨰 확인) 2. 생년월일 출력(1-2번쨰 : 년도, 3-4번쨰 :월 , 5-6번쨰 : 일) 3. 성별확인하고 출력(1,3:남성,
		 * 2,4:여성) 4. 데이터의 값 검증(월:1~12, 일: 1~31) (참고) : int num = "12";
		 */
		Scanner scan = new Scanner(System.in);

		// String str = scan.nextLine();
		String str = "900108-11234567";
		// 1. 정확히 입력된 데이터 여부 확인(체자리수: 14, '-': 7번쨰 확인)

		int strLen = str.length();
		if (strLen == 14) {
			System.out.println("[정상] 전체길이 14자리");
		} else {
			System.out.println("[비정상] 전체길이 " + strLen);
		}

		System.out.println(str.substring(6, 7));
		if (str.substring(6, 7).equals("-")) {
			System.out.println("[정상] '-' 문자위치 7번째");
		} else {
			System.out.println("[비정상] '-' 문자위치 7번째 아님");
		}

		System.out.println("str.indexOf(\"-\")" + str.indexOf("-"));
		if (str.indexOf("-") != 6) {
			System.out.println("[비정상] '-' 문자위치가 7번쨰가 아님");
		}
		if (str.charAt(6) != '-') {

		}
		System.out.println("================");
		// 2. 생년월일 출력(1-2번쨰 : 년도, 3-4번쨰 :월 , 5-6번쨰 : 일)

		String yymmdd = str.substring(0, 6);
		System.out.println("yymmmdd : " + yymmdd);

		String yy = yymmdd.substring(0, 2);
		String mm = yymmdd.substring(2, 4);
		String dd = yymmdd.substring(4, 6);
		String flag = str.substring(7, 8);

		String yyyy = "";
		if (flag.equals("1") || flag.equals("2")) {
			yyyy = "19" + yy;
		} else if (flag.equals("3") || flag.equals("4")) {
			yyyy = "20" + yy;

		}
		System.out.println("생년월일 : " + yyyy + "년 " + mm + "월 " + dd +"일");

		System.out.println("======= main 끝 ========");
		
		//String str = "900108-1234567";
		String gender = str.substring(7,8);
		if(gender.equals("1") || gender.equals("3")) {
			System.out.println("주민번호뒷자리(첫글자) : " + gender + "(남성)");
		}else if(gender.equals("2") || gender.equals("4")) {
			System.out.println("주민번호뒷자리(첫글자) : " + gender + "(여성)");
		}
		
		switch (gender) {
		case "1" : case "3" : 
			System.out.println("주민번호뒷자리(첫글자) : " + gender + "(남성)");
			break;
		case "2" : case "4" :
			System.out.println("주민번호뒷자리(첫글자) : " + gender + "(여성)");
			break;
		}
		
		//--------- charAt() ----------
		char gender2 = str.charAt(7);
		
		switch (gender2) {
		case '1' : case '3' : 
			System.out.println("주민번호뒷자리(첫글자) : " + gender + "(남성)");
			break;
		case '2' : case '4' :
			System.out.println("주민번호뒷자리(첫글자) : " + gender + "(여성)");
			break;
		default:
			System.out.println("외국인 입니다.");
			break;
		}
		System.out.println("=======================");
		//4. 데이터의 값 검증(월: 1~12, 일: 1~31)
		//	 String str = "900108-1234567";
		
		String sMonth = str.substring(2, 4);
		int month = Integer.parseInt(sMonth);
		if(month >= 1 && month <= 12) {
			System.out.println("[정상] 월 데이터가 정상(1~12)");
		}else {
			System.out.println("[비정상] 월 데이터가 정상(1~12)을 벗어남");
		}
		
		if(month < 1 || month > 12) {
			System.out.println("[비정상] 월 데이터가 정상(1~12)을 벗어남");
		}
		
		//	일자 데이터 (1~31 범위내에 있는 지)
		int date = Integer.parseInt(str.substring(4,6)); // "08"-> 8
		if(date >=1 && date<=31) {
			System.out.println("[정상] 일 데이터가 정상(1~31)");
		}else {
			System.out.println("[비정상] 일 데이터가 정상(1~31)이 아님");
		}
			
		System.out.println("======= main 끝 ========");
		
		
		
		/*
		 * if(str.length() ==14 && str.substring(6,7).equals("-")) {
		 * System.out.println(str.substring(0,2)+"년 "+
		 * str.substring(2,4)+"월 "+str.substring(4,6)+"일생 입니다.");
		 * 
		 * if(str.substring(7,8).equals("1") || str.substring(7,8).equals("3")) {
		 * System.out.println("남성 입니다.");
		 * 
		 * }else if(str.substring(7,8).equals("2") || str.substring(7,8).equals("4")) {
		 * System.out.println("여성 입니다."); }
		 * 
		 * 
		 * if((Integer.parseInt(str.substring(2,4)) >=1)&&
		 * (Integer.parseInt(str.substring(2,4)) <= 12)){
		 * if((Integer.parseInt(str.substring(4,6)) >=1)&&
		 * (Integer.parseInt(str.substring(4,6)) <= 31)) { System.out.println(str);
		 * }else System.out.println("올바르지 않은 일 형식입니다.");
		 * 
		 * }else { System.out.println("올바르지 않은 월 형식입니다."); }
		 * 
		 * 
		 * }else { System.out.println("틀린 주민등록번호 형식 입니다."); }
		 * 
		 */

	}

}
