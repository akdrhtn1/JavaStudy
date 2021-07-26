package com.mystudy.poly4_Interface1;

//	인터페이스(기본적으로 모두가 추상체)
//	단, default, static 메소드는 구현체
public interface InterfaceTest {
	//상수화된 변수 : 인터페이스에 선언되는 변수는 모두 public static final
	public static final Boolean SUCCESS = true;
	boolean FAIL = true; // public static final 이 생략됨
	public abstract void eat(); // 추상메소드
	abstract String sleep(); //추상메소드 (public 생략됨)
	void sound(); // 추상메소드(public abstract 생략됨)
	
	//default,static 메소드는 반드시 구현이되어야 한다.
	//default 메소드
	default String defalultMethod() {
		return null;                     
	}
	
	//static 메소드 : 인터페이스명.메소드명으로 사용 가능
	static void staticMethod() {
		System.out.println(">>> 인터페이스에 선언된 스태틱 메소드~~");
	}
	
}
