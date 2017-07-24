package com.hb.em;

// 자식 클래스
public class Ex02 extends Ex01 {
	@Override
	public void prn() {
		System.out.println("자식 prn()");
	}
	
	// prn2()는 부모 클래스를 가져와도 오버라이딩 할 수 없다.
	// static메소드는 오버라이딩이란 개념이 없다.
	
	public static void prn2(){
		// static 메소드는 static 변수만 사용 가능
		// 지역변수도 사용할 수 있다		
		int k = 10;
		System.out.println("자식 static prn2()");
//		System.out.println(su1);	// instance 변수를 static 메소드에서 사용했으므로 오류 발생
		System.out.println(su2);
//		System.out.println(su3);
		System.out.println(su4);
		System.out.println(k);		// 지역변수이므로 사용 가능
	}

	
	// 부모 클래스의 prn3() 메소드가 final이므로 오버라이딩 할 수 없다.
	// 이 경우엔 아예 가지고 올 수도 없다.
	
/*	public final void prn3(){
		System.out.println("부모 prn3()");
		su1 = su1 + 2;
		su2 = su2 + 2;
//		su3 = su3 + 2;	// 상수는 값 변경을 할 수 없으므로 오류 발생.
//		su4 = su4 + 2;		
	}
*/
}
