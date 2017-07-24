package com.hb.am;

// 내부 클래스 : 클래스 안에 정의하는 클래스를 말한다.
// 			 외부 클래스를 생성한 후 내부 클래스를 생성할 수 있다.(단 static은 제외)
//			 외부 클래스의 멤버들을 마음대로 사용 가능하다. 상속 관계에서도 사용 불가능한 private 멤버도 사용할 수 있다.
//			 컴파일한 후 $가 붙는다.

// 내부 클래스의 종류 : Member, Local, static, Anonymous
// 1. Member : 외부 클래스{..내부 클래스..}

public class Ex02 {
	int su1 = 10;
	final int su2 = 20;
	static int su3 = 30;
	static final int su4 = 40;
	private int su5 = 50;
	
	// 생성자
	public Ex02(){
		System.out.println("여기는 외부 클래스 : "+this);
	}
	
	// 일반 메소드
	public void prn(){
		int num1 = 100;
		final int num2 = 20;
//		static int num3 = 30;		// static은 지역변수로 사용할 수 없다.
//		static final int num4 = 40;
//		private int num5 = 50;		// private도 외부 메소드의 지역 변수가 될 수 없다.
		System.out.println("여기는 외부 메소드");
	}
	

	class Ex02_1{
		int s1 = 10;
		final int s2 = 20;
//		static int s3 = 30;
		// 내부 클래스는 static을 사용할 수 없다.
		// 사용하려면 내부 클래스도 static이어야 한다.
		static final int s4 = 40;
		// static final은 사용할 수 있다. 상수이므로 static과 다른 메모리를 사용하기 때문이다.
		private int s5 = 50;
		
		// 내부 클래스 생성자
		Ex02_1(){
			System.out.println("내부 클래스 생성자 : "+this);
		}
		
		// 내부 클래스 메소드
		public void in_prn(){
			int su11 = 10;
			final int su12 = 20;
//			static int su13 = 30;
//			static final int su14 = 40;
//			private int su15 = 50;		// static, private 사용 불가. 일반 메소드와 같다.
			
			// 내부 클래스는 외부 클래스의 멤버를 전부 사용할 수 있다.
			// 외부 클래스의 메소드도 사용할 수 있다.
			System.out.println("내부 클래스 메소드");
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			// su5는 private임에도 불구하고 사용할 수 있다. 내부 클래스의 특징.
			System.out.println(su5);
			System.out.println("::::::::::::::::::::::::::::");
			prn();
			
		}
	}	
}
