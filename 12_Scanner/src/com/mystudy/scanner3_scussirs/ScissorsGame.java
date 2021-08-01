package com.mystudy.scanner3_scussirs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
/*
 * 0. 컴퓨터가 가위 바위 보를 선택(Math.random())
 * 1. 가위 ,바위 ,보 선택 메뉴 출력
 * 2. 선택값 입력
 * 3. 결과 비교후 승자, 패자 결정
 * 
 */
public class ScissorsGame {

	
	Map<Integer, String> map = new HashMap<>();
	Scanner scan = new Scanner(System.in);
	
	public void startGame() {
		System.out.println("컴퓨터와 함께하는 가위(1), 바위(2), 보(3) 게임");
		map.put(1, "가위");
		map.put(2, "바위");
		map.put(3, "보");
		
		showMenu();
		
	}

	private void showMenu() {
		while (true) {
			System.out.println("가위(1),바위(2),보(3) 종료(0)");
			System.out.print(">");
			int user = scan.nextInt();
			int computer = (int) (Math.random()*3+1);

			int result = user-computer;
			
			if(user == 0) {
				System.out.println("게임을 종료하겠습니다.");
				break;
			}
			else if(!(user>=1 && user<=3)) {
				System.out.println("오류입니다. 숫자를 다시 입력해주세요");
				continue;
			}
			if(result==-2 || result == 1) {
				System.out.println("게임에서 승리하셨습니다.");
				
			}
			else if(result ==-1 || result == 2 ) {
				System.out.println("게임에서 패배하셨습니다.");
			}
			else if(result == 0) {
				System.out.println("무승부 입니다.");
			}
			System.out.println("사용자 : " + map.get(user));
			System.out.println("컴퓨터 : " + map.get(computer));
			
		}

	}

}