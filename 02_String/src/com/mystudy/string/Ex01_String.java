package com.mystudy.string;

public class Ex01_String {

	public static void main(String[] args) {
		//	String 클래스 : 문자열 저장, 처리하기 위한 클래스
		//	사용형식 2가지 
		//	String str = "홍길동" ; // 기본 데이터 타입처럼 사용
		//	String str = new String("홍길동"); //객체(인스턴스) 생성 사용
		
		String str1 = "java";
		String str2 = "World";
		String strObj1 = new String("java");
		String strObj2 = new String("World");
		System.out.println("str1 : " + str1.toString()); // str1.toString() 메소드 호출 처리됨
		System.out.println("strObj1 : " + strObj1.toString());
		
		String str11 =  "java";
		// 참조형 데이터 비교 == : 객체비교(객체 주소값 비교)
		System.out.println("str1 == str11 : "+ (str1 == str11) );
		
		System.out.println("str1 == str11 : "+ (str1 == strObj1) );
		
		//	equals() : 저장되어 있는 데이터(값) 비교(문자열비교)
		System.out.println("=== 문자열 비교는 equals() 메소드 사용 ===");
		System.out.println("str1.equals(str11) : " + (str1.equals(str11)));
		System.out.println("str1.equals(strObj1) : " + (str1.equals(strObj1)));
		
		String str12 = "JAVA";
		System.out.println(str12.equals(strObj1));
		System.out.println(str12.equalsIgnoreCase(strObj1));
		
		//============================
		System.out.println("--------- concat() --------");
		String a = "Hello ";
		String b = "Java ";
		String c = "World ";
		System.out.println("a+b : " + a.concat(b));
		System.out.println("a+b+c : " + a.concat(b).concat(c));
		
		//	체이닝 기법(chainning)
		String result = a.concat(b).concat(c).concat("!!!");
		System.out.println("a.concat(b).concat(c).concat(\"!!!\") " 
					+ result);
		
		
		String str = "dwsdf";
		System.out.println(str.charAt(2));//몇번쨰 문자 반환하는지
		
		System.out.println(str.contains("w"));
		
		//	substring, toString , indexOF , lastindexOf , toCharArray()
		//	trim() => 좌우에 있는 빈 공백 없애줌
	}

}
