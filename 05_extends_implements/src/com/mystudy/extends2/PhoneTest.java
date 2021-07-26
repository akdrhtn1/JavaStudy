package com.mystudy.extends2;

public class PhoneTest {

	
	public static void main(String args[]) {
		
		
		Mp3Phone mp3 = new Mp3Phone("0102334523");
		Phone p2 = new Phone();
		mp3.call();
		mp3.view();
		p2.view();
		mp3.playMusic();
		
		System.out.println(mp3.getPhoneNo());
	//	p2.playMusic();
		
		WebPhone wbp = new WebPhone("02013233");
		wbp.view();
		wbp.webSearch();
		
		
		wbp.webSearch("코로나");
		wbp.playMusic();
		
		
	}
}
