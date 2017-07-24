package com.hb.am;

public class Ex03_main {
	// 내부 클래스만으로는 개체를 생성할 수 없다.
	// 항상 외부 클래스를 통해 만들어야 한다.
	public static void main(String[] args) {
		Ex03 test = new Ex03();
//		Ex03_1 test = new Ex03_1();
//		Ex03.Ex03_1 test = new Ex03().new Ex03_1();
		// Local 내부 클래스는 위 방법도 쓸 수 없다.
		// Ex03_1 클래스는 prn2메소드의 지역변수이므로 prn2메소드가 먼저 실행되어야 한다.
		// 내부 클래스가 끝나는 지점과 외부 메소드가 끝나는 지점 사이에서 Local 내부 클래스를 생성해야 한다.
		
		test.prn2();
	}
}
