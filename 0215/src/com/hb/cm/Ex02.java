package com.hb.cm;

// 인터페이스를 상속받아 보자
// 일반, 추상 클래스가 인터페이스를 상속받을 때는 implements 예약어를 사용한다.

// 일반 클래스의 경우 오버라이딩을 해야 한다.
class Ex02 implements Ex01 {

	@Override
	public void sub() {
		
	}

	@Override
	public void mul() {
		
	}
	
}

// 추상 클래스의 경우 : 클래스 앞에 abstract
abstract class Ex03 implements Ex01 {
	public abstract void div();
}

// 인터페이스가 인터페이스를 상속받을 때는 extends 예약어를 사용한다.
interface Ex04 extends Ex01 {
	public void add();
}

// 이하 클래스는 총 3개의 메소드를 오버라이딩 해야 한다. (Ex04가 구체화하지 않은 것까지 모두 구체화해야 한다)
class Ex05 implements Ex04{

	@Override
	public void sub() {
		
	}

	@Override
	public void mul() {
		
	}

	@Override
	public void add() {
		
	}
	
}