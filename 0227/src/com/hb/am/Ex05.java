package com.hb.am;

// 4. Anonymous : 익명 내부 클래스. 한 번 쓰고 버려지는 클래스로 여러 번 호출할 수 없다.
//				  대부분 인터페이스나 추상 메소드에서 활용한다.

// 일반적인 인터페이스
interface TestInner{
	int DATA = 100;
	public void prnData();
}

public class Ex05 implements TestInner{

	@Override
	public void prnData() {
		System.out.println("인터페이스 사용법1");
		System.out.println(TestInner.DATA);
	}
}

// 익명 내부 클래스를 사용하는 방법
class Ex05_1{
	// 메소드 안에 인터페이스를 상속받은 클래스 생성
	public void prn(){
		new TestInner() {
			@Override
			public void prnData() {
				// TODO Auto-generated method stub
				System.out.println("인터페이스 사용법2");
				System.out.println(TestInner.DATA);
			}
		};
	}
	
	// 인터페이스를 인자로 가지고 있는 메소드 생성
	public void prn2(TestInner ti){
		
	}
}