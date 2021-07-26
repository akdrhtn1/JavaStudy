package com.mystudy.extends2;

//	클래스 상속(extends)
/*
webPhone 클래스 작성
Phone 클래스를 상속확장해서 작성 

생성자의 정의
   - 폰번호(phoneNo)만 받아서 객체(인스턴스) 생성 : 타입명 "WebPhone타입" 적용
기능 : 전화걸고 , 받고, 전화정보 보기, 웹검색 할 수 있는 전화기
웹 검색 기능  
   -WebSearch() : >> WebPhone -웹 검색" 메시지 출력
   
 */
public class WebPhone extends Mp3Phone{
	
	
	public WebPhone(String phoneNo) {
		super("WebPhone타입",phoneNo);
	}
	
	public WebPhone(String type, String phoneNo) {
		super(type, phoneNo);
	}
	

	
	public void webSearch() {
		System.out.println("WebPhone -웹 검색 ");
	}
	
	public void webSearch(String word) {
		System.out.println("WebPhone -웹 검색 " + word + "로 검색");
	}
	


}
