package com.hb.fm;

//추상 클래스를 상속받은 자식 클래스는 아래 두 경우가 있다.
//1. 일반 클래스인 경우 : 부모가 가지는 추상 메소드를 오버라이딩해서 반드시 구체화해야 한다.
//2. 추상 클래스인 경우 : 오버라이딩을 하지 않은 경우엔 추상 클래스가 된다. 

// 일반 클래스
class Ex02 extends Ex01{
	@Override
	public void prn3() {
	}
}

// 추상 클래스
abstract class Ex03 extends Ex01{
}

// 추상 클래스를 상속받고 또 추상 메소드를 만든 경우
abstract class Ex04 extends Ex03{
	public abstract void prn4();
}

class Ex05 extends Ex04{
	@Override
	public void prn4() {
	}

	@Override
	public void prn3() {
	}
}

// 추상 메소드를 이용해 다형성을 구현할 수 있다.
// 같은 메소드를 상속받아도 실행 형태는 각 클래스마다 다르게 할 수 있는 것이다.