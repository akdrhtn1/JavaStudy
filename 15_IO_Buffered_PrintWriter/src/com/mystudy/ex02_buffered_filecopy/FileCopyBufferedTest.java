package com.mystudy.ex02_buffered_filecopy;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyBufferedTest {

	public static void main(String[] args) {
		//	BufferedInputStream, BufferedOutputStream 적용
		//	2가지 방식으로 파일 복사해서 속도 비교
		//	방법1 : byte 단위 읽고, 쓰기
		//	방법2 : 버퍼기능 사용 복사
		
		File file = new File("file/img01.png");
		//	파일로 부터 byte 단위 읽어 객체를 저장할 변수 선언
		FileInputStream fis =null;
		FileOutputStream fos = null;
		
		//	버퍼사용을 위한 변수 선언
		BufferedInputStream bis =null;
		BufferedOutputStream bos =null;
		
		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream("file/img01_copy.png");
			
			//	시간체크
			long startTime = System.currentTimeMillis();
			
			//바이트 단위 파일 읽고, 쓰기 처리
			int readValue = fis.read();
			while(readValue != -1) {
				fos.write(readValue);
				readValue = fis.read();
			}
			
			long endTime = System.currentTimeMillis();
			System.out.println("byte 복사시간 : " + (endTime - startTime));
			
			fos.close();
			fis.close();
			//===============================
			//	버퍼(buffer) 사용 복사
			bis = new BufferedInputStream(new FileInputStream(file));
			bos = new BufferedOutputStream(
					new FileOutputStream("file/test_img.jpg"));
			
			//	읽고,쓰기
			startTime = System.currentTimeMillis();
			
			int readBuffer = bis.read();
			while(readBuffer != -1 ) {
				bos.write(readBuffer);
				readBuffer = bis.read();
			}
			
			
			endTime = System.currentTimeMillis();
			System.out.println("buffer 복사시간 : " + (endTime - startTime));
			
			bos.close();
			bis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
