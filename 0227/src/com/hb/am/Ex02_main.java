package com.hb.am;

public class Ex02_main {
	// 내부 클래스만으로는 개체를 생성할 수 없다.
	// 항상 외부 클래스를 통해 만들어야 한다.
	public static void main(String[] args) {
//		Ex02_1 test = new Ex02_1;	// <= 불가능
		
		// 먼저 외부 클래스를 객체화한다.
		Ex02 test = new Ex02();
		System.out.println(":::::::::::::::::::::::::");
		
		// 방법 1
		Ex02.Ex02_1 test1 = new Ex02().new Ex02_1();
		System.out.println(":::::::::::::::::::::::::");
		
		// 방법 2
		Ex02.Ex02_1 test2 = test.new Ex02_1();
		System.out.println(":::::::::::::::::::::::::");
		
		// 외부 클래스에 접근하기
		System.out.println(test.su1);
		System.out.println(test.su2);
		System.out.println(test.su3);
		System.out.println(test.su4);
//		System.out.println(test.su5);	// private이므로 접근 불가
		test.prn();
		System.out.println(":::::::::::::::::::::::::");
		
		// 내부 클래스에 접근하기
		System.out.println(test2.s1);
		System.out.println(test2.s2);
		System.out.println(test2.s4);
//		System.out.println(test2.s5);	// private이므로 접근 불가
		
		test2.in_prn();	// 내부 클래스의 메소드를 이용하면 다른 클래스에서도 private 멤버에 접근할 수 있다.
		
		
	}

}
