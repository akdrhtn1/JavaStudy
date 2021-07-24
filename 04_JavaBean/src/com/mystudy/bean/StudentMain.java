package com.mystudy.bean;

public class StudentMain {

	public static void main(String[] args) {
		Student stu = new Student();
		
		stu.setName("홍길동");
		System.out.println(stu.getName());

		stu.setKor(100);
		stu.setEng(90);
		stu.setMath(81);
		
		System.out.println(stu.getTot());
		
		double avg =stu.getTot() * 100 /3 / 100.0;
		System.out.println(stu.getAvg());
		

		System.out.println(stu.toString());
		
		
		Student stu2 = new Student("김유신", 100, 90, 82);
		System.out.println(stu2);
		
		stu2.setKor(150);
		System.out.println(stu2);
		
	}

}
