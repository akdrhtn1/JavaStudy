package com.mystudy.exception1;

public class ExceptionThrow {

	public static void main(String[] args) {
		//예외처리 throw : 예외를 발생시킬 때 사용
		//throw new ArithmethicException();
		//throw new ArithmethicException("예외 메시지 작성 전달");

		
		throw new ArrayIndexOutOfBoundsException("배열 범위 out");
	}

}
