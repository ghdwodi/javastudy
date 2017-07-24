package com.hb.em;

// final : 중단(끝), 확장 불가, 변경 불가
// final 클래스 : 상속 불가(자식 클래스 생성 불가)
// final 메소드 : 상속관계에서 오버라이딩 불가. 즉 해당 메소드 내용 변경 불가
// final 변수 : 변수의 상수화(데이터 변경 불가)

// 부모 클래스
public class Ex01 {
	int su1 = 10;
	static int su2 = 20;
	final int su3 = 30;
	static final int su4 = 40;
	
	public void prn(){
		System.out.println("부모 prn()");
		su1 = su1 + 2;
		su2 = su2 + 2;
//		su3 = su3 + 2;	// 상수는 값 변경을 할 수 없으므로 오류 발생.
//		su4 = su4 + 2;
	}
	
	public static void prn2(){
		// static 메소드는 static 변수만 사용 가능
		// 지역변수도 사용할 수 있다		
		int k = 10;
		System.out.println("부모 static prn2()");
//		System.out.println(su1);	// instance 변수를 static 메소드에서 사용했으므로 오류 발생
		System.out.println(su2);
//		System.out.println(su3);
		System.out.println(su4);
		System.out.println(k);		// 지역변수이므로 사용 가능
	}
	
	public final void prn3(){
		System.out.println("부모 prn3()");
		su1 = su1 + 2;
		su2 = su2 + 2;
//		su3 = su3 + 2;	// 상수는 값 변경을 할 수 없으므로 오류 발생.
//		su4 = su4 + 2;		
	}
}
