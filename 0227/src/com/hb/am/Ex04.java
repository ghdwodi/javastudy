package com.hb.am;

// 3. static 내부 클래스
public class Ex04 {
	String name = "홍길동";
	int age = 14;
	
	// 멤버 내부 클래스에서 내부 클래스 변수가 어쩔 수 없이 static인 경우에는
	// 내부 클래스를 static으로 만들어야 오류가 발생하지 않는다.
	static class Ex04_1{
		String str = "임꺽정";
		int age = 123;
		static double pi = 3.14;
		static final double pi2 = 3.14159;
	}
}
