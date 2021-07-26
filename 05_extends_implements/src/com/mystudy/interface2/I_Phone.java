package com.mystudy.interface2;

public interface I_Phone {
	//{} 없음 : 추상메소드(abstract 메소드 = 구현부 없음)
	//인터페이스에 정의되는 메소드는 기본적으로 public abstract 입니다.
	public abstract void view();
	// public void call() {}; interface라서 추상화로 해야함 = 에러
	void receiveCall();//public abstract 임 기본이 =>public abstract
	void sendSms(); //public 생략됨
	void receiveSms();
	public void call();
	
}
