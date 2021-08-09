package com.mystudy.thread02_runnable;


class ThreadParent{
	void print() {
		System.out.println("Thread 클래스의 부모");
	}
}

class RunnableImpl extends ThreadParent implements Runnable{
	
	@Override
	public void run() {
		System.out.println("본인 호출");
		super.print();

		
	}
	
}

public class RunnableImplThread {

	public static void main(String[] args) {
		System.out.println("----- main() 시작 -----");
		Thread thmain = Thread.currentThread();
		System.out.println(thmain.toString());
		

		RunnableImpl runnableImpl = new RunnableImpl();
		//runnableImpl.run();
		
		
		//다른 클래스를 상속받고 쓰레드로 동작시킬떄 implements Runnable
		//를 사용하면 쓰레드와 동일한 run메서드가 있다 하지만 start메소드가 없기때문에
		//스레드 객체로 선언해주면 start를 동작시킬수 있다.
		
		//Thread 생성자 사용방식으로 Runnable 인터페이스 구현체를 Thread로 만들기
		//생성자 Thread(Runnable) 사용
		Thread th = new Thread(runnableImpl);
		
		th.start();
		System.out.println("----- main() 끝 -----");
	}

}
