package com.hb.pm;

public class Ex06 {
	// static 초기화 : 클래스 안에서는 초기화시킬 수 없으므로 따로 만들어야 한다.
	// 형식) static {초기화}
	
	int a = 10;
	static int b = 20;		// 다음 줄에서 초기값을 선언하면서 의미가 없어지는 값
	static {
		b = 100;
		c = 1000;			// 초기값 선언
	}
	static int c = 2000;	// 초기값을 선언한 뒤 다시 값을 정했으므로 2000이 출력된다.
	
	public void add(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		int k1 = 10;
		// main 메소드는 static이므로 Ex06클래스의 멤버변수(instance) int a를 사용할 수 없다.
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(k1);
	}
}
