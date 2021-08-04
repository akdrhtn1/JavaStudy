package com.mystudy.reader_writercopy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopyCharacterExam {

	public static void main(String[] args) {
		// FileReader, FileWriter 사용해서 파일 복사
		// 원본파일 : file/test_char.txt
		// 대상파일 : file/text_char_copy.txt
		// 처리 : 원본파일을 읽어서 대상파일에 쓰기/저장(문자처리 단위)
		File file = new File("file/test_char.txt");
		File file2 = new File("file/test_char_copy.txt");
		FileReader fr = null;
		FileWriter fw = null;

		try {
			fr = new FileReader(file);
			fw = new FileWriter(file2);

			int readChar = fr.read();

			while (readChar != -1) {
				fw.write(readChar);
				readChar = fr.read();
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println(">> 읽을 파일이 없습니다~~~");
		} catch (IOException e) {
			e.printStackTrace();
		} finally { 
			if (fw != null) {
				try {	
						fw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (fr != null) {
				try {	
						fr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			
		}

	}

}
