package com.hb.pm;

public class Ex02Main {
	public static void main(String[] args) {
		
		System.out.println(Ex01.su);
//		System.out.println(Ex10.su2);	// static이라도 private은 접근 불가능.
		
		// 자식 클래스 객체 생성
		Ex02 test = new Ex02();
		// 부모 클래스가 먼저 만들어지고, 그 뒤 자식 클래스가 만들어진다. 두 클래스의 주소는 같다는 것을 알 수 있다.
		// 자식 클래스를 객체로 만들면 부모 클래스 객체가 먼저 만들어진다.
		
		test.namePrn();
		// 우선순위 : 자식 클래스의 지역변수 > 자식 클래스의 전역변수 > 부모 클래스의 변수
	}
}
