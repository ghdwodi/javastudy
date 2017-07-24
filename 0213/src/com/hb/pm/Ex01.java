package com.hb.pm;

// 부모 클래스 만들기
public class Ex01 {
	// 상속 : 클래스와 클래스 간의 관계(is a 관계)
	// 		자식 클래스가 부모 클래스의 멤버들을 아무런 제약 없이 사용
	// 		즉 자식 클래스의 능력 확장(예약어 extends 사용)을 말한다.
	
	String name = "홍길동";
	int age = 12;
	private String addr = "서울";
	static int su = 5;
	private static int su2 = 100;
	
	public Ex01(String name){
		System.out.println("부모 클래스 생성자 : "+this); // 클래스 내에서 자기 자신(참조 주소값)을 지칭
		this.name = name;
	}
	public void prn(){
		System.out.println("부모 클래스 메소드 : ");
	}
	public void prn2(){
		System.out.println("부모 클래스 static 메소드");
	}
}
