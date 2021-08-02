package com.mystudy.scanner4_bank;

import java.util.Scanner;

public class BankATM {

	private int money; // 통장 계좌(금액)
	private Scanner scan = new Scanner(System.in);

	public void startBank() {
		System.out.println(">> ATM 기계를 사용합니다.");

		showMenu();
	}

	private void showMenu() {
		while (true) {
			System.out.println("1.입금 2.출금 3.통장확인 0.종료");
			System.out.print(">> 작업선택 : ");
			int userChoice = scan.nextInt();

			if (userChoice == 0) {
				System.out.println("프로그램을 종료하겠습니다.");
				scan.close();
				break;
			}
			switch (userChoice) {
			case 1:
				deposit();
				break;
			case 2:
				withdraw();
				break;
			case 3:
				printOne();
				break;
			default:
				System.out.println("숫자를 다시 입력해주세요 ");
				break;
			}
			if (userChoice >= 1 && userChoice <= 3) {
				System.out.println(":: 통장금액 : " + money);
			}
		}
	}

	private void deposit() {
		System.out.print(">> 입금액 : ");
		int uDeposit = scan.nextInt();
		money += uDeposit;
	}

	private void withdraw() {
		System.out.print(">> 출금액 : ");
		int uWithdraw = scan.nextInt();
		if (!(money < uWithdraw)) {
			money -= uWithdraw;
		} else {
			System.out.println("계좌에 잔액이 부족합니다.");
		}
	}

	private void printOne() {
		System.out.println("=======통장=======");
	}
}
