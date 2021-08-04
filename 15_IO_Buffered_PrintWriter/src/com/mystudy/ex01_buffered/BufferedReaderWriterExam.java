package com.mystudy.ex01_buffered;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedReaderWriterExam {

	public static void main(String[] args) {
		//	버퍼(buffer) 기능이 구현되어 있는 클래스
		//	BufferedReader, BufferedWriter
		//	File -> FileReader -> BufferedReader
		
		FileReader fr = null;
		FileWriter fw = null;
		
		BufferedReader br =null;
		BufferedWriter bw = null;
		
		try {
			//	파일로 부터 읽기 위한 객체(인스턴스) 생성
			File inFile = new File("file/test_buf_rw_in.txt");
			fr = new FileReader(inFile);
			br = new BufferedReader(fr); //버퍼 사용+파일읽기
			
			//	파일에 쓰기 위한 객체 생성 ----------------------
			File outFile = new File("file/test_buf_rw_out.txt");
			fw = new FileWriter(outFile);
			bw = new BufferedWriter(fw); //버퍼 사용 + 파일쓰기 기능
			
			//	읽고, 쓰기
			String str = br.readLine();
			while(str != null) {
				bw.write(str);
				bw.newLine();
				str = br.readLine();			
			}
	

			
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			//최종 담아서 사용한 br,bw만 close처리 해주면 됨
			try {
				bw.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
