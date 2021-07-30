package com.mystudy.set1_hashset;

import java.util.HashSet;
import java.util.Objects;

class Person{
	String name; // 이름
	int age; // 나이
	String jumin; // 주민번호
	public Person(String name, int age, String jumin) {
		super();
		this.name = name;
		this.age = age;
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", jumin=" + jumin + "]";
	}

	@Override
	public int hashCode() { //hashCode 와 equlas를 오버라이딩 해줘야 Hashset에 중복 데이터가 제거가 됨
		//System.out.println(">> hashCode() 실행"); //3번 실행 1-홍길동 2-김유신 3-홍길동 같으니까 equals 실행
		return Objects.hash(jumin); 
	}

	@Override
	public boolean equals(Object obj) {
	
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(jumin, other.jumin);
	}
	
	
}

public class HashSetExam2_equals {

	public static void main(String[] args) {
		//	Set : 중복데이터는 허용안함(하나만 저장)
		//	참조형 데이터의 동일 데이터 여부는 equals 메소드 기준
		//	equals() 메소드 오버라이딩 할 때는 hashCode()도 함꼐 재정의
		//	Set 의 동일데이터 확인
		//	1. 해시코드 값 확인 : hashCode()
		//	2. equals()메소드 결과값이 모두 일치하면 동일데이터
		Person p1 = new Person("홍길동",20,"901010-1234511");
		Person p2 = new Person("홍길동",20,"901010-1234511");
		
		System.out.println("p1 hash : " +p1.hashCode());
		System.out.println("p2 hash : " +p2.hashCode());
		System.out.println(p1.equals(p2));
		// ->원래 객체값에 대한 주소가 다르면 안되는데 그거에대해서 주민번호가 일치하면 
		// 동일 데이터로 오버라이딩 해놓았기 떄문에 같다고 처리가됨
		HashSet<Person> set = new HashSet<>();
		set.add(new Person("홍길동",20,"901010-1234511"));
		set.add(new Person("김유신",30,"881111-1752222"));
		set.add(new Person("홍길동",20,"901010-1234511"));
		set.add(new Person("홍경래",33,"901010-1234511")); //->위에서 equals 주민으로 처리해서 중복 제거됨
		set.add(new Person("홍길동",20,"900202-1233122")); //->주민번호가 달라서 다른데이터로 처리됨
		System.out.println(set);

	}

}
