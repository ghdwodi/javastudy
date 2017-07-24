package com.hb.pm;

public class Ex04 {
	// static : 객체 생성과 무관하게 먼저 생성된다. 누구나 접근 가능하다.(공용)
	// 			별도의 static 메모리에 만들어진다.
	//			지역변수나 클래스에는 정의할 수 없다.(단 내부클래스에서는 예외적으로 가능)
	//			static 메소드는 일반 변수를 참조할 수 없다.(일반 변수는 객체 생성 후 만들어지므로 선후 관계에 모순)

	int a = 0;
	static int b = 0;
	public Ex04(){
		a++;
		b++;
	}

	public void sum(int k1, int k2){
		System.out.println("결과 : "+(k1+k2));
		double PI = 3.14;
//		double static PI2 = 3.14;	// 지역변수는 static으로 정의할 수 없다. 오류 발생.
	}
	
	public static void sub(int k){
//		int res = k - a;			// static 메소드는 일반 변수 a(멤버변수)를 참조할 수 없다.
		int res2 = k - b;
	}
}
