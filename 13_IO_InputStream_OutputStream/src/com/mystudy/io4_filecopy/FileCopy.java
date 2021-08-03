package com.mystudy.io4_filecopy;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	//	파일복사 : 원본 파일에서 읽고, 대상 파일에 쓰기
	//	복사할 원본 파일 
	
	public static void main(String[] args) {
		//	파일 복사: 원본 파일에서 읽고, 대상 파일에 쓰기   그림 파일도 가능하다 이유는 byte단위 파일 이기때문
		//	복사할 원본 파일(읽을 파일 : AS-IS)
		File file = new File("src/com/mystudy/io4_filecopy/FileCopy.java");
		
		//	쓰기 위한 대상 파일(target file : TO-BE)
		File fileOut = new File("file/FileCopy.java_backup");
		
		//파일을 읽고 쓰기 위한 객체 저장할 변수 선언 
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			//1. 파일에 읽고, 쓸 객체 생성 
			fis = new FileInputStream(file); // byte 단위로 파일에서 읽기
			fos = new FileOutputStream(fileOut); // byte 단위로 파일에 출력
			
			//2. 1 byte 읽고, 1 byte 쓰기
			int value =0;
			while(true) {
				value = fis.read();
				if(value == -1) { //EOF 이면 반복을 종료
					break;
				}
				fos.write(value);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				fos.close();
				fis.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	}
	
}
