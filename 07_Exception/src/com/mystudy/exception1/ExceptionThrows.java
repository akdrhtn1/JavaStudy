package com.mystudy.exception1;

public class ExceptionThrows {

	public static void main(String[] args) {
		// thorws: 예외를 던질 때(위임, 전가) 사용
		// 예외가 발생한 곳에서 처리하지 않고 예외를 던져서 다른 곳에서
		// 처리하도록 한다.
		// 호출한 곳에서 처리하도록 에외를 던짐
		System.out.println("---main 시작---");
		int num1 = 100;
		int num2 = 20;
		int result = 0;

		num2 = 0;
		result = div(num1, num2);

		result = 0;

		try {
			result = divThorws(num1, num2);
		} catch (MyException e) {

			System.out.println(e.getMessage());
		}
		System.out.println("---main 끝---");

	}

	static int div(int num1, int num2) {
		System.out.println("---> div()시작");
		int result = -9999;
		// 예외를 잡아서 직접 처리
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			System.out.println("[div 예외발생]" + e.getMessage());
		}
		System.out.println("---> div() 끝");

		return result;
	}
	// thorws: 요청한 곳으로 예외를 던져(전달)

	static int divThorws(int num1, int num2) throws MyException {
		System.out.println("---> divThrows() 시작");
		int result = -1;
		try {
			result = num1 / num2;
		} catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			throw new MyException(); //내가 만든 Exception은 RuntimeException 계열 아님
		}

		System.out.println("---> divThrows() 끝");
		return result;
	}
}

	class MyException extends Exception {
		public MyException() {
			super(">>[예외발생] 0으로 나누려고 했습니다. 값을 확인하세요~");
		}
	}


