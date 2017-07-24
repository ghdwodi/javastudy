package com.hb.pm;

// 자식 클래스
public class Ex02 extends Ex01 { // 부모 클래스 Ex01과 연결
	String name = "마루치";
	public Ex02(){
		// 상속 관계가 되는 순간 자식 클래스의 생성자 첫 줄에는 부모 클래스의 생성자가 숨어 있다.
		// 부모 클래스의 생성자 : super();
		// 부모 클래스에 기본 생성자가 없는 경우 따로 만들어줘야 한다.
		// 상속 시의 편의를 위해 기본 생성자를 만들어 주라는 이유가 이것이다.
		super("둘리");
		System.out.println("자식 클래스 기본 생성자 : "+this);
	}
	
	public void namePrn(){
		String name = "태권브이";
		System.out.println("이름 : "+super.name);	// 자식 클래스에는 name 변수가 없으나 부모 클래스에 가지고 온다.
	}
	public void addrPrn(){
		System.out.println("나이 : "+age);
//		System.out.println("주소 : "+addr); // 상속 관계라 해도 private은 참조할 수 없다.
	}
}
