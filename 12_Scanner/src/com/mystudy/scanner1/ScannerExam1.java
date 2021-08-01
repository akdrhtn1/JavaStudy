package com.mystudy.scanner1;

import java.util.Scanner;

public class ScannerExam1 {

	public static void main(String[] args) {
		// Scanner : 특정위치에서 값을 읽어 들어 사용하기 위한 클래스
		// 입력 : 성명, 국어, 영어, 수학 점수를 입력 받아
		// 처리 : 총점, 평균 구하기
		// 출력 : 성적처리된 데이터 화면 출력
		/*
		 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 :");
		String name = scan.nextLine();
		String Rank;
		System.out.print("국어 : ");
		int kor = scan.nextInt();

		System.out.print("영어 : ");
		int eng = scan.nextInt();
		
		System.out.print("수학 : ");
		int math = scan.nextInt();
		
		int tot = kor + eng + math;
		double avg = tot *100 / 3 /100.0;
		
		System.out.println("-----------");
		System.out.println("총점 : "+ tot);
		System.out.println("평균 : " + avg);
	}

}
