package com.mystudy.ex03_inputstreemreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReader_Exam {

	public static void main(String[] args) {
		//	InputStream	-> Reader
		//	byte 처리 계열 -> 문자(Character) 처리 계열 전환
		//	데이터를 byte 계열로 읽어 들이고, 최종적으로 문자단위 처리
		File file = new File("file/test_isr.txt");
		FileInputStream fis =null;		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			fis = new FileInputStream(file);
			
//			int readByte = fis.read();
//			System.out.println((char) readByte );
//			readByte = fis.read();
//			System.out.println((char) readByte ); //한글 깨짐
			
			isr = new InputStreamReader(fis);
			int readIsr = isr.read();
			System.out.println((char)readIsr);
			readIsr = isr.read();
			System.out.println((char)readIsr);
			
			//버퍼기능 사용해서 읽기(라인단위)
			br = new BufferedReader(isr);
			String str = br.readLine();
			
			while(str !=null) {
				System.out.println(str);
				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		//	OuputStreamWriter : OuterStream - > Writer 전환
		

	}

}
