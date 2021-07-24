package com.mystudy.string;

import java.util.Arrays;

public class Ex02_String_method {

	public static void main(String[] args) {
		//	String 클래스의 메소드들
		//	charAt()
		
		System.out.println("----charAt()-----");
		String str = "Java World";
		System.out.println("str : " + str);
		char ch = str.charAt(0);
		System.out.println("str.charAt(0) : " + ch);
		
		//char[] ch2 = {str.charAt(0), str.charAt(1), str.charAt(2), str.charAt(3)};
		char[] ch2 = new char[4];
		for(int i=0; i<ch2.length; i++) {
			ch2[i] = str.charAt(i);
		}
		System.out.println("ch2 : " + Arrays.toString(ch2));
		
		System.out.println("----compareTo()-----");
		System.out.println("java vs java :"+"java".compareTo("java")); //같으면 0
		System.out.println("aaa vs bbb :" + "aaa".compareTo("bbb")); // 낮은게 앞에있으면 -1
		System.out.println("bbb vs aaa :" + "bbb".compareTo("aaa")); // 알파벳상 높으니까 1
		System.out.println("ccc vs aaa :" + "ccc".compareTo("aaa")); // 2단계 높으니까 2
		
		System.out.println("aba vs aaa :" + "aba".compareTo("aaa")); // b를 비교할떄와 같음
		
		System.out.println("--- copyValuOf() ---");
		char[] ch3 = {'a', 'b', 'c', 'd'};
		System.out.println("ch3 : " + Arrays.toString(ch3));
		
		String str3 = String.copyValueOf(ch3); //char배열을 string으로 전환	}
		
		System.out.println("String.copyValueOf(str3) : " + str3);
		System.out.println("String.copyValueOf(str3,0,2) : " + String.copyValueOf(ch3,0,2));
		
		System.out.println("---- starWith()---");
		String str4 = "Java world";
		System.out.println("str4.startsWith(\"java\") : : " + str4.startsWith("java")); //java로 시작하냐?
		
		System.out.println("---- indexOf() ---");
		System.out.println(str4.indexOf("a"));
		System.out.println(str4.lastIndexOf("a"));
		
		System.out.println("--- isEmpty() ----");
		System.out.println("str4.isEmpty() : " + str4.isEmpty() );
		
		
		System.out.println("-------replace()-------");
		System.out.println("str4 : " + str4);
		System.out.println("str4.replace('a', 'b') : "+ str4.replace('a', 'b'));
		System.out.println("str4 : " + str4);
		
		System.out.println("---- replaceAll() ----");
		//====================================
		str4 = "java java";
		System.out.println("str4 : " + str4);
		System.out.println("ja -> JA : " + str4.replace("ja","JA"));
		System.out.println("ja -> JA : " + str4.replaceAll("ja","JA"));
		
		System.out.println("ja -> JA : " + str4.replaceFirst("ja","JA"));
		
		System.out.println("----- substring() ------");
		str = "Java World";
		System.out.println("str : " + str);
		System.out.println("str.substring(5) : " +  str.substring(5));
		
		//	substring(beginInex,endIndex)
		//	beginIndex : 시작위치값 부터(포함)
		//	endIndex : end이전까지(불포함)
		System.out.println("str.substring(2,4) : " + str.substring(2,4));
		
		System.out.println(str.substring(0, str.length()));
		
		//뒤에서 2개 문자 제외하고 
		
		System.out.println(str.substring(0, str.length()-2));
		//===================================
		
		System.out.println();
		System.out.println("---- toCharArray() ----");
		char[] ch4 = str.toCharArray();
		System.out.println("ch4 : " + ch4);
		System.out.println(Arrays.toString(ch4));
		System.out.println(ch4[0]);
		System.out.println(ch4[1]);
		System.out.println("----------------");
		System.out.println("-----toUpperCase(), toLowerCase(), trim()");
		str="       java World     ";
		System.out.println("str : -" + str + "-");
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println("trim() : -" + str.trim() + "-");
		
		System.out.println("----- String.valueOf()  ------");
		int num = 100;
		System.out.println(num + 1); // 덧셈 연산
		System.out.println("" + num + 1 ); // 문자열 붙이기 //묵시적
		
		System.out.println(String.valueOf(num) + 1 ); // 문자열 붙이기  //명시적
		String snum = String.valueOf(100);
		//================================
		
	}

}
