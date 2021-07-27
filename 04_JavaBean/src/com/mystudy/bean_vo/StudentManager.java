package com.mystudy.bean_vo;

import com.mystudy.bean_vo.StudentVO;

public class StudentManager {

	public static void main(String[] args) {
		StudentVO stuVO = new StudentVO("나123",20,20,10);
		StudentVO stuVO2 = new StudentVO("누구니",20,20,10);
		StudentVO stuVO3 = new StudentVO("형123",20,20,10);
		
		StudentVO[] stu = {stuVO, stuVO2, stuVO3};
		
		printData(stu);

	}
	static void printData(StudentVO[] students) {
		for(StudentVO s : students) {
			s.printInfo();
		}
	}

}
