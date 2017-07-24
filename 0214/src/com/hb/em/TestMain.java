package com.hb.em;

public class TestMain {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		Ex01.prn2();
		Ex02.prn2();
		
		System.out.println(":::::::::::::::::::::::::::");
		
		test.prn();
		test.prn2();
		test.prn3();	// final이므로 Ex01의 부모 클래스까지 올라간다.
	}
}
