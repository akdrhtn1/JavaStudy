package com.mystudy.list3_linkedlist;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedListExam {

	public static void main(String[] args) {
		// LinkedList : List 속성
		LinkedList<String> list = new LinkedList<>();
		list.add("홍길동");
		list.add("홍길동");
		list.add("김유신");

		System.out.println("list : " + list);
		System.out.println(list.get(0));

		String str = "홍길동,김유신1,강감찬,을지문덕,홍경래";
		String[] names = str.split(",");
		System.out.println("names의 내용 : " + Arrays.toString(names));

		// 배열에 있는 데이터를 리스트에 추가
		for (int i = 0; i < names.length; i++) {
			list.add(names[i]);
		}
		System.out.println("list : " + list);

		// ---------------
		// (실습) 리스트에 있는 데이터 변경하기
		// 김유신 삭제
		// (실습) 홍길동 -> 홍길동2
		System.out.println("========================김유신삭제======================");
		System.out.println("변경전 list : " + list);

		// 데이터 있으면 삭제 없으면 작업끝
		while (true) {
			if (list.contains("김유신")) { //있으면
				list.remove("김유신"); // 있으면 맨 앞쪽 데이터 1개 삭제
			} else {
				break;
			}
		}

		System.out.println("변경후 list:" + list);
		System.out.println("=========================홍길동변경=====================");

		System.out.println("변경전 list : " + list);

		while(true) {
			int index =  list.indexOf("홍길동");
			if(index==-1) {
				break;
			}
			list.set(index, "홍길동2");
		}

		System.out.println("변경후 list:" + list);
	}

}
