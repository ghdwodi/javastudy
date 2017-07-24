package com.hb.cm;

public class Ex05 extends Ex04{
	String name = "홍둘리";
	
	// 오버라이딩 : 부모 클래스의 메소드를 가지고 와서
	//			자기 마음대로 변경하는 것
	// 오버라이딩의 반대 : final method(오버라이딩 불가능한 메소드)
	//				 부모 클래스의 메소드를 가지고 와서 사용만 할 수 있다.
	//				 그러나 그 내용을 변경할 수는 없다.

	public void add(){
		age = age + 10;
		System.out.println(age);
	}
	
	@Override
	// @Override : 주석 처리와 동시에 부모의 메소드를 은닉화한다.
	// @ <= 기능을 가진 주석
	public void sub() {
		age = age - 15;
		System.out.println(age);
	}
}