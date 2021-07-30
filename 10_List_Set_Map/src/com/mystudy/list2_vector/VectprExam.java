package com.mystudy.list2_vector;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class VectprExam {

	public static void main(String[] args) {
		//	Vector클래스 : List 계열
		Vector<String> v = new Vector<String>(5); //용량(Capacity) 5
		v.add("1");
		v.add("2");
		v.add("3");
		System.out.println(v);
		System.out.println("v.size():" + v.size());
		System.out.println("v.capacity():" + v.capacity()); //기본 사이즈 내에서 처리할 수 있으면 쓰고 아니면 증가 
		//StringBuffer랑 비슷
		
		String temp = v.toString();
		System.out.println(temp);
		
		v.remove(2);
		System.out.println(v);
		System.out.println("v.size():" + v.size());
		System.out.println("v.capacity():" + v.capacity()); 
		
		System.out.println("--- trimTosize() 실행 후 ---");
		v.trimToSize();
		System.out.println(v);
		System.out.println("v.size():" + v.size());
		System.out.println("v.capacity():" + v.capacity()); 
		
		v.addElement("4");
		System.out.println(v);
		System.out.println("v.size():" + v.size());
		System.out.println("v.capacity():" + v.capacity()); 
		
		v.add("AA"); //추가입력(맨뒤에 insert)
		System.out.println(v);
		v.add(2,"BB"); //삽입, 특정위치에 입력(insert)
		System.out.println(v);
		v.add(2,"CCC"); //추가입력(맨뒤에 insert)
		System.out.println(v);
		
		System.out.println("---- clone() 실행후 ----");
		Vector<String> v2 = (Vector)v.clone();
		System.out.println("v : " + v);
		System.out.println("v2: " + v2);
		
		System.out.println("--- v2.clear 실행후 ---");
		v2.clear();
		System.out.println("v : " + v);
		System.out.println("v2: " + v2);
		System.out.println("==== Enumeration 객체 사용 조회 ====");
		Enumeration<String> enu = v.elements(); //객체에 데이터를 enumeration에 전달
		while(enu.hasMoreElements()) { //데이터가 있냐? 이것도 stringtokenizer랑 비슷함
			System.out.print(enu.nextElement()+","); //있으면 가지고 와서 사용하는데 하나씩 꺼내면서 줄어듬
		}
		System.out.println();
		
		System.out.println("==== Iterator 활용 조회 ====");
		Iterator<String> ite = v.iterator(); //스트링 타입을 선언했기 떄문에 스트링 타입으로 이것도 enumeration같이 1회성
		while(ite.hasNext()) { //다음 데이터가 있냐
			System.out.println("ite.next() : " + ite.next()); //이것도 하나씩 읽고 사라짐
		}
		
	}
}
