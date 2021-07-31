package com.mystudy.random;

import java.util.Calendar;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class RandomExam2 {

	public static void main(String[] args) {
		//(실습) 오늘 당신의 행운지수 알아보기 ( 0~100 ) 
		//Math.random(), Random 사용해서 행운지수 값을 만들기
		Random rand = new Random();
		Calendar calendar = Calendar.getInstance();
		
		int year =calendar.get(Calendar.YEAR);
		int month =calendar.get(Calendar.MONTH)+1; // 0~11까지의 값으로 월을 쓰고있음
		int date = calendar.get(Calendar.DATE);
		

		int result = rand.nextInt(101); // 0~100 범위의 정수타입 난수 생성
		//방법1 - Random nextInt(숫자)
		System.out.println(year+ "년 "+month+"월 "+ date + "일 당신의 행운지수(0~100)는 "+ result + "입니다");
		System.out.println("--------------");
		//랜덤값 테스트용
		Set<Integer> set = new TreeSet<>();
		for(int i =0; i<101; i++) {
			set.add(rand.nextInt(101));
		}
		System.out.println(set);
		System.out.println(set.size());
		
		//방법2 - Math.random()
		System.out.println("---- Math.random ----");
		result = (int)(Math.random()*101); //여러가지 랜덤클래스 사용하지 않을 경우 Math 사용
		System.out.println(year+ "년 "+month+"월 "+ date + "일 당신의 행운지수(0~100)는 "+ result + "입니다");
		

		}

}
