package com.mystudy.random;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class RandomEx {

	public static void main(String[] args) {
		//랜덤 list값 추출
		List<String> list = new ArrayList<>();
		Random random = new Random();
		list.add("박1");
		list.add("박2");
		list.add("박3");
		list.add("박4");
		list.add("박5");
		list.add("박6");
		list.add("박7");
		list.add("박8");
		list.add("박9");
		list.add("박10");
		list.add("박11");
		
		for(int i=0; i<3; i++) {
			System.out.println(list.get(random.nextInt(list.size())));
		}
		System.out.println(list.indexOf("박2"));


	}

}
