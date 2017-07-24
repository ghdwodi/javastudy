package com.hb.am;

public class Ex04_main {
	public static void main(String[] args) {
		// 스레드의 일반적인 사용법
		System.out.println("main : "+Thread.currentThread().getName());
		Ex01 test1 = new Ex01();
		Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
		/*test1.prn();
		test2.prn();
		test3.prn();*/
		
		test1.start();	// run 메소드를 찾아 새 스레드로 실행한다.
		test2.start();	// 각 스레드는 동시다발적으로 진행된다.
		test3.start();	// 클래스에 start라는 이름의 메소드가 있다면 그것을 우선으로 실행한다.
						// 이 경우엔 모두 main스레드로 진행되므로 순서대로 실행한다.
		
		System.out.println("main : "+Thread.currentThread().getName());
		System.out.println("수고하셨습니다.");
	}
}
