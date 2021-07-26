package com.mystudy.extends1;

class PhoneTest {

	public static void main(String[] args) {
		//	Phone 객체 생성 후 기능 테스트
		System.out.println("======Phone=======");
		Phone phone = new Phone("010-1234-1234");
		phone.view();
		phone.call();
		phone.receiveCall();
		
		Phone phone2 = new Phone("삼성갤럭시", "010-2313-2133");
		phone2.view();
		phone2.call();
		phone2.receiveCall();
		System.out.println(phone2.toString());
		
		System.out.println("=====mp3 Phone========");
		Mp3Phone mp3ph = new Mp3Phone("010-3333-3333");
		mp3ph.view();
		mp3ph.call();
		mp3ph.receiveCall();
		mp3ph.playMusic();

	}

}
