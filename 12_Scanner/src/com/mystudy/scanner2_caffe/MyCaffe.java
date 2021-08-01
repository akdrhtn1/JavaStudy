package com.mystudy.scanner2_caffe;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/* 카페만들기
음료의 종류 
while(true){
1.아메리카노(3000) 2.카페라떼(3500) 3. 카페모카(4000) 4. 과일주스(5000)
 >>입력값 : 메뉴번호, 주문수량, 입금액(고객이 낸 돈)
 //출력값 : 입금액, 판매액(단가*수량), 잔액(입금액 - 판매액)
 >메뉴를 선택하세요(1~4) : 1
 >주문수량 : 3
 >입금액 : 10000
 ========
 입금액 : 10000
 판매액 : 9000
 잔돈 : 1000원
 }
 *
 */
public class MyCaffe {
	Scanner scan = new Scanner(System.in);
	
	Map<Integer, String[]> map = new HashMap<>();
	String value[][] = {{"아메리카노","3000"},
						{"카페라뗴","3500"},
						{"카페모카","4000"},
						{"과일주스","5000"}};
		
	private int inMoney; // 받은 금액
	private int ea; // 수량
	private int change; // 거스름돈
	private int totMoney; // 판매액(선택메뉴단가 * 수량)
	private int income; // 매출 총액
	private boolean isCheck; 
	

	public void caffeOpen() {
		System.out.println(">>>카페 가게를 오픈합니다.");
//		map.put(1, 3000);
//		map.put(2, 3500);
//		map.put(3, 4000);
//		map.put(4, 5000);
		for(int i = 0; i<value.length;i++) {
			map.put(i+1, value[i]);
		}
		showMenu();
		
	}

	private void showMenu() {
		while (true) {
			System.out.println("1.아메리카노(3000) 2.카페라떼(3500) 3. 카페모카(4000) 4. 과일주스(5000)");
			System.out.print("메뉴를 선택하세요(1~4) : ");
			int userChoice = scan.nextInt();
			if (userChoice >= 1 && userChoice <= 4) {
				order(userChoice);
			} else {
				System.out.println("프로그램을 종료하겠습니다.");
				break;
			}
		}
	}

	private void order(int choice) {
		System.out.print("주문 수량 : ");
		ea = scan.nextInt();
		System.out.print("입금액 : ");
		inMoney = scan.nextInt();
		System.out.println("================");

		totMoney = Integer.parseInt(map.get(choice)[1]) * ea;
		
		change = inMoney - totMoney;

		if (change >= 0) {
			
		} else {
			income += inMoney;	
			isCheck=true;
			while (!(change == 0)) {
				
				System.out.println(change + " 만큼 금액이 모자랍니다!!");
				System.out.println("추가 지불할 금액을 입력해주세요");//-8000
				int sumMoney = scan.nextInt(); //20000  ->12000
				change += sumMoney;
				inMoney += sumMoney;
				if(change<=0) {
					income += sumMoney;
				}
				System.out.println("매출총액 : " + income);
				if(change>0) {
					income += sumMoney - change;
					break;
				}	
			}
		}
		print(choice);
	}

	private void print(int choice) {
		System.out.println("===== :: 결제 내역 :: =====");
		System.out.println("--주문--");
		System.out.println("입금액 : " + inMoney);
		System.out.println("판매액 : " + totMoney);
		System.out.println("거스름돈 : " + change);
		System.out.println("====================");
		if(!isCheck) {
			income += totMoney;
		}
		System.out.println("주문메뉴 : " +map.get(choice)[0]);
		System.out.println("판매액 : " + totMoney);
		System.out.println("거스름돈 : " + change);
		System.out.println("====================");
		System.out.println("매출총액 : " + income);
		
	}

}
