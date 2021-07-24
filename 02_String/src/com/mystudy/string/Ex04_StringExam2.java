package com.mystudy.string;

import java.util.Arrays;

public class Ex04_StringExam2 {

	public static void main(String[] args) {
		String[] names = new String[]{"홍길동","이순신","을지문덕","김유신","연개소문","이순신","Tom","TOM"};
		//2
		String a = ", ";
	         
		System.out.println("---- 2번 ----");
		for(int i=0; i<names.length; i++) {
			
			if(!(i==names.length-1))
				System.out.print(names[i].concat(a));
			else {
				System.out.println(names[i]);
			}
			

		}
		//------효율 2번------) 
		System.out.printf(names[0]);
		for(int i=1; i<names.length; i++) {
			System.out.printf("," + names[i]);
			}
			
		System.out.println();
		
		
		for(int i=0; i<names.length; i++) {
			System.out.print(names[i].charAt(0));

			if(!(i==names.length-1))
				System.out.printf(",");
			else {
				System.out.println();
			}
		}
		// 3.배열에 있는 데이터의 첫 글자만 출력 구분자 콤마(,) 사용하여 한 라인 출력
		
		// 4. names.length>=4 이런거만 해서 인덱스:이름
		for(int i=0; i<names.length; i++) {
			if(names[i].length()>=4) {
				System.out.printf(i + ":"+ names[i] +" ");
			}
			
		}
		System.out.println();
		
		
		// 하나씩 비교
		//arr[i] arr[j] 이랑 비교 대소문자 같아도 똑같은거
		// equaslignorecase 써야함
		for(int i=0; i<names.length; i++) {
			for(int j=i+1; j<names.length; j++) {
				if(names[i].equalsIgnoreCase(names[j])) {
					System.out.printf(i +  ":" +names[i]+"  = " + j +":" + names[j] );
					System.out.println();
					
				}
			}
		}

		

	}

}
