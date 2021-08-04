package com.mystudy.ex04_printwriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_Exam {

	public static void main(String[] args) {
		//	File -> FileWriter -> (BufferedWriter) -> PrintWriter
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		
		try {
			fw = new FileWriter(new File("file/pw_out.txt"));
			//bw = new BufferedWriter(fw);
			//pw = new PrintWriter(bw);
			
			pw = new PrintWriter(new BufferedWriter(fw));
			
			pw.write("안녕하세요");
			pw.write("오늘은 뭐합니까?");
			
			pw.print("오늘은 Programming");
			pw.println("당연히 Java죠?");
			pw.println("맞지 오늘도 힘내자");
			pw.printf("%d %d",123,412);
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			pw.close();
		}
	}

}
