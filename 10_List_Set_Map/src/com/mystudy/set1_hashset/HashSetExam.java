package com.mystudy.set1_hashset;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExam {

	public static void main(String[] args) {
		//	HashSet : Set 인터페이스를 구현한 구현체(클래스)
		//	순서가 없고, 중복데이터 허용안함(동일데이터는 하나만 저장)
		//	Set 에서 다른 동일데이터 여부 확인은 hashCode(), equals() 값 확인으로 처리한다.
		//	1.해시코드 값 확인 : hashCode()
		//	2.equals() 메소드 모두 일치하면 동일데이터
		//--------------------------------------
		
		HashSet<String> set = new HashSet<>();
		set.add("홍길동");
		set.add("홍길동");
		set.add("김유신");
		
		set.add(new String("홍길동"));
		
		System.out.println("홍길동 해시코드 : " + "홍길동".hashCode());
		System.out.println("new String(\"홍길동\") 해시코드 : " + new String("홍길동").hashCode());
		System.out.println(set);
		
		System.out.println(set.size());
		System.out.println(set.contains("김유신"));
		
		set.add("을지문덕");
		set.add("홍경래");
		System.out.println(set); //순서가 x 중복데이터 1개 저장
		
		System.out.println("---- Set 전체 데이터 조회(Iterator) ----");
		Iterator<String> iter =set.iterator();
		
		while(iter.hasNext()) { //재 사용이 안됨 그래서 set은 하나씩 꺼내보기에는 iterator가 적합함
			System.out.println(iter.next());
		}
		System.out.println("---------");
		for(String name : set) { // 이렇게 사용해도 됨
			System.out.println(name);
		}
		//-----------------
		
		
		if(set.contains("김유신")) {
			set.remove("김유신");
			System.out.println(">> 김유신 데이터가 삭제되었습니다");
			set.add("강감찬");
		}else {
			System.out.println(">> 김유신 데이터가 없습니다.");
		}
		

		System.out.println(set);

	}

}
