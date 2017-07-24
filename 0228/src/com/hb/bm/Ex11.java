package com.hb.bm;

// 인터페이스
interface Ex11 {
	public void add(int a, int b);
	public void sub(int a, int b);
	public void mul(int a, int b);
	public void div(int a, int b);
}

// 인터페이스를 상속받은 클래스 <= 어댑터에 해당
// 어댑터 : 리스너를 상속받아서 빈 메소드로 만든다.

class Ex12 implements Ex11{

	@Override
	public void add(int a, int b) {}

	@Override
	public void sub(int a, int b) {}

	@Override
	public void mul(int a, int b) {}

	@Override
	public void div(int a, int b) {}
	
}

class Ex13 extends Ex12 {
	@Override
	public void add(int a, int b) {
	}
}