package com.mystudy.list4_vo;

import java.util.ArrayList;
import java.util.List;


public class StudentManager {

	public static void main(String[] args) {
		/*
		 * List를 사용한 성적 처리
		 */
		List<StudentVO> list = new ArrayList<>();

		
		StudentVO[] s = {new StudentVO("홍길동", 100, 90, 81), 
				new StudentVO("이순신", 95, 88, 92),
				new StudentVO("김유신", 90, 87, 77)};
			
		for(StudentVO stu : s) {
			list.add(stu);
		}
		

		printData(list);


	}
	static void printData(List<StudentVO> list) {
		System.out.println("  성명   국어  영어  수학  총점  평균");
		System.out.println("=====================================");
		
		for (StudentVO stu : list) {
			System.out.printf("  %s  %d  %d  %d   %d  %.2f\n", stu.getName(), stu.getKor(), stu.getEng(),
					stu.getMath(), stu.getTot(), stu.getAvg());
		}
	}
}
