package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputOuputStream {

	public static void main(String[] args) {
		//ObjectInputStream , ObjectOuputStream
		//Object 타입의 데이터를 사용해서 입출력(I/O)
		//Object 타입의 데이터를 파일에 쓰고, 읽어오기
		//StudentVO 타입의 데이터 사용 
		
		File file = new File("file/object_io.txt");
		
		//파일에 쓰기 위한 용도
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		//파일에서 읽기 위한 용도
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		//파일에 저장할 데이터 준비
		StudentVO stu1 = new StudentVO("20111","김부신",20,30,50);
		StudentVO stu2 = new StudentVO("20222","김로젠",78,50,50);
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println("====================");
		

		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			System.out.println(">>>> 파일에 쓰기");
			oos.writeObject(stu2);
			oos.writeObject(stu1); //StudentVo타입 객체가 파일에 저장
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(oos != null) {
				try {
					oos.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		//파일로 부터 읽기
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			System.out.println();
//			Object obj = ois.readObject();
//			StudentVO stuIn1 = null;
//			if(obj instanceof StudentVO) {
//				stuIn1 = (StudentVO)obj;
//			}
			StudentVO stuIn1 = (StudentVO) ois.readObject();
			StudentVO stuIn2 = (StudentVO) ois.readObject();
			System.out.println("stuIn1 : " + stuIn1);
			System.out.println("stuIn2 : " + stuIn2);
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(ois !=null) {
					ois.close();
				}
			}catch (IOException e) {
				
				e.printStackTrace();
			}
		}
	} // emd of main()

}//end of class
