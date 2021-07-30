package com.mystudy.list1_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//ArrayList : Array(배열)의 속성을 가진 List(목록)
		ArrayList list = new ArrayList();   // - --<Integer>로 제너릭 했을경우 int타입만 가능하고 지정을 안할 경우 Object 타입만 가능  
		System.out.println(list.size());
		
		//입력 : 맨뒤에 추가
		list.add(new Integer(5));
		list.add(32);  // int -> Integer 타입으로 자동 형변환
		list.add(5);
		list.add(7);
	
		
		list.add(0,100); // 인덱스 위치에 데이터 추가(삽입)
		System.out.println("0번 인덱스 100 추가 후 " + list.toString());


		//수정 : 지정된 위치에 데이터를 변경
		
		list.set(0, 999);
		System.out.println("0번 인덱스 999 변경 후 " + list.toString());
		//삭제 : 특정 위치에 데이터 삭제
		list.remove(0); //인덱스 위치 데이터 삭제
		System.out.println("0번 인덱스 삭제 후 " + list.toString());
		
		//검색,조회(R) : 특정 위치에 데이터 읽기(조회, 검색, 확인)
		Object obj  = list.get(0);
		System.out.println(" list.get(0) : " + obj); 
		
		Collections.reverse(list); //Collections 클래스에서 reverse를 가지고 와 list를 역순으로 만듬
		System.out.println("reverse 후" + list.toString());
		
		System.out.println("list.subList(1, 4) : " + list.subList(1, 4)); // list중에 일부만 취함
		
	
		ArrayList list2 = new ArrayList(list.subList(1, 4)); //일부데이터만 쓸려고 갖고옴
		
		System.out.println("--- Collections.sort() ---");
		System.out.println("list : " + list);
		
		Collections.sort(list);  // 오름차순 정렬
		System.out.println("list : " + list);
		
		System.out.println("--- Collections.sort() ---");
		Collections.reverse(list); //---->오름차순 되어있는 값을 reverse 함으로써 내림차순을함
		System.out.println("list : " + list);
		
		System.out.println("========================");
		System.out.println("list : " + list);
		System.out.println("list2 : " + list2);
		
		list2.add("BB");
		list2.add("TEST");
		System.out.println("list : " + list2);
		System.out.println("첫 데이터 : " + list2.get(0));
		
		System.out.println("마지막 데이터 " + list2.get(list2.size()-1));
		System.out.println("list2 : " + list2);
		
		for(int i =0 ; i<list.size(); i++) {
			System.out.println(i + " : " +  list.get(i));
		}
		printData(list2);
		printData("list2",list2);
		printData("list3",new ArrayList()); // 새로운 객체만 전달
		ArrayList list4 = null;
		printData("list4",list4); // null 값 반환
		
		
		// 데이터가 있는 지 여부 확인
		System.out.println("list2.contains(5) : " + list2.contains(5));
		
		System.out.println("--- list2의 데이터를 전체 삭제");
		printData("list2 삭제전 : ", list2);
		
		int temp = list2.size();
		System.out.println("temp :" + temp);
//		for(int i=0; i < temp; i++) {
//			list2.remove(0);
//		}

		// 역순으로 삭제
		// 맨 뒤쪽에 있는 데이터를 삭제 밑에 있는 것보다 더 효율적size()를 호출 안해도 되니까.

//		for(int i=list2.size()-1; i >= 0; i--) {
//			list2.remove(i);
//		}

//		//항상 마지막 인데스 삭제
//		temp = list2.size();
//		for(int i = 0 ; i< temp ; i++) {
//			list2.remove(list2.size()-1);
//		}
		
		
		
		for(int i=0; i<= list2.size(); i++) {
			
//			System.out.print(list2.size() + " : ");
//			System.out.print(i);			
			if(i >= list2.size()-1) {
				i=0;
			}						
			list2.remove(i); 
			
			System.out.println(list2);
						
		}
		
		printData("list2 삭제후 : ", list2);
				
		
	}
	
	static void printData(List list) {//-->인터페이스 list 데이터 타입으로 받으면 이 list를 구현해 놓은 list들이 다 쓸 수 있음
		if(list == null || list.size() < 1 ) return;
		
		System.out.print(list.get(0));
		
		for(int i =1 ; i<list.size(); i++) {
			System.out.print(" , " +  list.get(i));
		}
		System.out.println();
	}
	
	
	static void printData(String title, List list) {//-->인터페이스 list 데이터 타입으로 받으면 이 list를 구현해 놓은 list들이 다 쓸 수 있음
		//if(list == null || list.size() < 1 ) return;
		if(list == null) {
			System.out.println(title  + "- null");
			return;
		}
		if(list.size() < 1) {
			System.out.println(title  + "- 데이터건수 0");
			return;
		}
		
		System.out.print(title + ":" + list.get(0));
		
		for(int i =1 ; i<list.size(); i++) {
			System.out.print(" , " +  list.get(i));
		}
		System.out.println();
	}
	
	
}
