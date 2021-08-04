package com.mystudy.ex06_object;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInputOutPutStream_List {
	public static void main(String[] args) {
		//StudentVO 객체들을 ArrayList에 담아서 파일에 저장
		//파일에서 읽어들인 ArrayList 객체에 담김 VO 정보를 화면에 출력
		File file = new File("file/object_to_list.data");
		List<StudentVO> list = new ArrayList<>();

		//ArrayList에 담기
		list.add(new StudentVO("20111","김부신",20,30,50));
		list.add(new StudentVO("20222","김로젠",78,50,50));
		
		//파일에 쓰기 위한 용도
		FileOutputStream fos = null;
		ObjectOutputStream oos =null;
		//파일에서 읽기 위한 용도
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			System.out.println(">>>> 파일에 쓰기");
			oos.writeObject(list);
			
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
		
		//	파일에 저장된 ArrayList객체를 읽어서 화면출력(Input)
		try {
			list = new ArrayList<>();
			
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			System.out.println();

			list = (List<StudentVO>) ois.readObject();
			


			for(StudentVO stu : list) {
				System.out.println("학번 : " + stu.getId() + "  " + "이름 : " + 
			stu.getName()+"  " + "수학점수: "+ stu.getKor()+ "  " + "영어점수 : " + stu.getEng() 
			+ "  "+"수학점수 : " + stu.getKor() + "  " + "총점 :"+ stu.getTot()+"  "+ "평균 : " + stu.getAvg());
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
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
	} 

}
