package com.mystudy.set1_hashset;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetLotoo {

	public static void main(String[] args) {
		//	Set 을 이용한 로또 만들기 : 1 ~ 45 랜덤숫자 6개를 set에 저장
		
		//	TreeSet : 데이터를 정렬해서 저장 되므로 정렬이 불필요
		Set<Integer> set = new TreeSet<>();

		while(set.size()<6) {
			set.add((int)(Math.random()*45+1));
		}
		System.out.println();
		
		
		
		System.out.println("set의 로또번호 : " + set);


	}

}
