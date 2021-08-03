package com.mystudy.io1_file;

import java.io.File;
import java.io.IOException;

public class FileExam2 {

	public static void main(String[] args) throws IOException {
		//	파일명 : temp.txt(파일명.확장자(명))
		File file1 = new File("temp.txt");

		
		//	File 객체생성은 파일의 존재여부와 관계없이 생성 가능
		System.out.println(file1);
		
		//	절대경로: root 디렉토리(폴더)로 부터 전체 경로를 표시해서 지정
		File file2 = new File("C:\\MyStudy\\temp\\aaa\\a1//temp.txt"); //절대 주소방식
		//	상대경로: (.: 현재위치, .. : 상위디렉토리(폴더))
		File file3 = new File("file/temp.txt");
		
		//파일 1의 절대 경로 위치
		System.out.println("파일 위치 :  " + file1.getAbsolutePath());
		System.out.println("파일 위치 :  " + file2.getAbsolutePath());
		System.out.println("파일 위치 :  " + file3.getAbsolutePath());
		
		System.out.println("----- File getCanonicalPath() ----");
		System.out.println("파일 위치 :  " + file1.getCanonicalPath());
		System.out.println("파일 위치 :  " + file2.getCanonicalPath());
		System.out.println("파일 위치 :  " + file3.getCanonicalPath());
		
		System.out.println("----- File exist----");
		System.out.println("있냐(file1) : " + file1.exists());
		System.out.println("있냐(file2) : " + file2.exists());
		System.out.println("있냐(file3) : " + file3.exists());
		
		System.out.println("----- File 속성정보----");
		System.out.println("file1.length : " + file1.length());
		//	파일 속성 정보
		
		System.out.println("----- File 경로----");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		
		
		System.out.println("----- File getName()----");
		System.out.println("file1.getName() : " + file1.getName());
		System.out.println("file1.getName() : " + file2.getName());
		System.out.println("file1.getName() : " + file3.getName());
		
		System.out.println("-----  File isDrictory(), isFile() ---");
		System.out.println("file1.isDirectory() : " +  file1.isDirectory());
		System.out.println("file1.isFile() : " +  file1.isFile());
		
		System.out.println("===============");
		File file4 = new File("file/temp4.txt");
		
		try {
			file4.createNewFile(); //IOException : 디렉토리 없을 떄도 발생
		} catch(IOException e) {
			e.printStackTrace();
		}
		//file4.delete();
		System.out.println();
		 
	}

}
