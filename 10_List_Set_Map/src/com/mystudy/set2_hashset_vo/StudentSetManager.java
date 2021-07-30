package com.mystudy.set2_hashset_vo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class StudentSetManager {

	public static void main(String[] args) {
		StudentVO s1 = new StudentVO("홍길동", 100, 90, 81);
		StudentVO s2 = new StudentVO("이순신", 95, 88, 92);
		StudentVO s3 = new StudentVO("김유신", 90, 87, 77);
		
		StudentVO[] stu1 = {s1,s2,s3};
		Set<StudentVO> set = new HashSet<>();
		
//		set.add(s3);
//		set.add(s2);
//		set.add(s1);
		for(StudentVO i : stu1) {
			set.add(i);
		}
		
		System.out.println("성명   국어  영어 수학 총점 평균");
		
		Iterator<StudentVO> iter =set.iterator();
		
		while(iter.hasNext()) { //재 사용이 안됨 그래서 set은 하나씩 꺼내보기에는 iterator가 적합함
			StudentVO stu = iter.next();
			stu.printInfo();
		}
		
		System.out.println("---- 김유신 점수 출력 ----");
		
		iter =set.iterator();
		while(iter.hasNext()) {
			StudentVO s = iter.next();
			if("김유신".equals(s.getName())) {
				s.setKor(95);
				s.printInfo();
			}
			
		}
			
	}

}
