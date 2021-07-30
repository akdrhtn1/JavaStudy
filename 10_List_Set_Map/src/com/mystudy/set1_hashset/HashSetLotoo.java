package com.mystudy.set1_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetLotoo {

	public static void main(String[] args) {
		//	Set 을 이용한 로또 만들기 : 1 ~ 45 랜덤숫자 6개를 set에 저장
		
		Set<Integer> set = new HashSet<>();
		System.out.println(set.size());
		while(set.size()<6) {
			set.add((int)(Math.random()*45+1));
		}
		
		List<Integer> setList = new ArrayList<>(set);
		Collections.sort(setList);
		
		System.out.print("금주의 로또번호 : "+ setList);

	}

}
