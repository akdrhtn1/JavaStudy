package com.mystudy.interface2;

// 전화기 기본기능 + 음악플레이 + 웹서치기능
public interface I_WebPhone extends I_Phone,I_Mp3Phone{
	//interface 는 여러개랑 같이 확장할 수 있음 
	// 확장된 두개의 기능도 구현 해야함

	//웹서치기능
	void webSearch();
}
