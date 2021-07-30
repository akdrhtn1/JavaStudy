package com.mystudy.map2_vo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;



public class StudentMapManager {

	public static void main(String[] args) {
		//3명의 학생데이터 생성
		StudentVO s1 = new StudentVO("홍길동",100, 90, 81);
		StudentVO s2 = new StudentVO("이순신",95, 88, 92);
		StudentVO s3 = new StudentVO("김유신",90, 87, 77);
		

		Map<String, StudentVO> map = new HashMap<>();
		

		map.put(s1.getName(), s1);
		map.put(s2.getName(), s2);
		map.put(s3.getName(), s3);
		
		
		Set<String> keySet = map.keySet();
		
		
		//map에 있는 데이터를 사용해서 화면 출력
		//Collection<StudentVO> values = map.values();
		for(StudentVO student : map.values()) {
			student.printInfo();
		}
		System.out.println("------------------");
		
		// 저장된 map에 있는 김유신 학생의 국어 점수를
		StudentVO vo= map.get("김유신");
		
		vo.setKor(95);
		vo.printInfo();
		


		

	}

}
