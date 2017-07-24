package com.hb.am;

// 2. Local 내부 클래스 : 외부 클래스 메소드 안에 내부 클래스가 존재하는 경우를 말한다.
//					  외부 클래스의 지역변수처럼 사용한다. 외부 클래스의 메소드가 실행될 때 생성된다.
// 형식 : 외부 클래스{멤버, 멤버, 메소드(){내부 클래스{}},...}
public class Ex03 {
	int su1 = 100;
	public Ex03() {
		System.out.println("외부 클래스 생성자 : "+this);
	}
	
	public void prn(){
		int s1 = 10;
		System.out.println("외부 클래스 메소드");
		System.out.println(su1+s1);
	}
	
	public void prn2(){
		int num1 = 1000;		
		int num2 = 2000;
		
		// 내부 클래스
		class Ex03_1{
			int number1 = 1;
//			static int number2 = 2;
			// 내부 클래스는 static을 사용할 수 없다.
			// 사용하려면 내부 클래스도 static이어야 한다.
			static final int number3 = 3;
			final int number4 = 4;
			
			public void in_prn(){
				// 외부 클래스의 변수와 메소드 사용 가능
				System.out.println(su1);
//				System.out.println(s1);		// 외부 메소드의 지역변수이므로 사용 불가
				System.out.println(num1);
				System.out.println(num2);
				prn();
			}	// 내부 메소드 끝
			
		}	// 내부 클래스 끝
		Ex03_1 t = new Ex03_1();
		System.out.println("::내부 클래스의 변수::");
		System.out.println(t.number1);
		System.out.println(t.number3);
		System.out.println(t.number4);
		System.out.println("::내부 클래스의 메소드:;");
		t.in_prn();
		System.out.println(":;외부 클래스의 변수::");
		System.out.println(su1);
		System.out.println("::외부 클래스의 메소드::");
		prn();
		
//		System.out.println(prn.s);	// 다른 지역의 변수는 사용 불가
		System.out.println(num1);	// 소속된 지역의 변수는 사용 가능
	}	// 외부 메소드 끝
	
}	// 외부 클래스 끝
