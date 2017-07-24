package com.hb.fm;

// 추상 클래스 : 추상 메소드를 하나 이상 가지고 있는 클래스를 말한다.
// 			 일반 클래스가 가지는 모든 멤버를 가질 수 있다.
// 추상 메소드 : body가 없는 메소드. 즉 구체화되지 않은 메소드를 말한다.
// 추상 클래스나 추상 메소드는 반드시 abstract 예약어를 사용해야 한다.

// 추상 클래스를 상속받은 자식 클래스는 아래 두 경우가 있다.
// 1. 일반 클래스인 경우 : 부모가 가지는 추상 메소드를 오버라이딩해서 반드시 구체화해야 한다.
// 2. 추상 클래스인 경우 : 오버라이딩을 하지 않은 경우엔 추상 클래스가 된다. 

// 추상 클래스에는 반드시 abstract 예약어를 사용해야 한다.
public abstract class Ex01 {
	int su1 = 0;
	static int su2 = 20;
	final int su3 = 30;
	final static int su4 = 40;
	
	public void prn(){
		su1++;
		su2++;
//		su3++;
//		su4++;
	}
	
	public static void prn2(){
		System.out.println(su2);
		System.out.println(su4);
	}
	
	// 추상 메소드. 반드시 abstract 예약어를 붙여 줘야 한다.
	public abstract void prn3();
}
