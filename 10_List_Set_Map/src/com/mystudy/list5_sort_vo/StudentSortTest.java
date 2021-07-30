package com.mystudy.list5_sort_vo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class StudentSortTest {

	public static void main(String[] args) {
		StudentVO s1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO s2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO s3 = new StudentVO("김유신", 90, 87, 77);
		
		List<StudentVO> list = new ArrayList<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		
		
		System.out.println("------Sort 진행 전 -----" );
		printData(list);
		Collections.sort(list);
		System.out.println("------Sort 진행 후 -----" );
		printData(list);
	}
	
	
	
	
	static void printData(List<StudentVO> list) {
		System.out.println("성명   국어  영어  수학  총점  평균");
		System.out.println("===============================");
		
		for(StudentVO vo : list) {
			vo.printInfo();
		}
	}
	

}
