package com.mystudy.reader_writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExam {

	public static void main(String[] args) {
		//	FileWriter : 파일에 문자단위 쓰기
		File file  = new File("file/test_cha_out.txt");
		FileWriter fw = null;
		try {
			//	사용할 객체 생성
			fw = new FileWriter(file);
			
			//	객체 사용
			fw.write('대');
			fw.write("한민국");
			//fw.flush(); //버퍼에 있는 데이터를 강제로 Output처리 fw.flush 나 fw.close안하면 데이터가 안들어감
			
			fw.write("Hello Java!!!!");
		} catch (IOException e) {
			e.printStackTrace();
		}
			
			finally {
			try {
				fw.close(); // close처리를 안하면 버퍼에 있는 데이터는 소실이됨
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
