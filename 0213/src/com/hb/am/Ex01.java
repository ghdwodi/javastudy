package com.hb.am;

public class Ex01 {
	public static void main(String[] args) {
		// 암시적 객체 생성
		String s1 = "korea";
		String s2 = "korea";
		// 명시적 객체 생성
		String s3 = new String("korea");
		String s4 = new String("korea");
		
		// 암시적 객체 생성과 명시적 객체 생성의 차이를 확인해 보자
		// 객체 == 객체 : 내용을 비교하는 것이 아니다. 참조 주소값을 비교한다.
		if (s1==s2){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		} // 같다고 나온다.
		  // 상수풀(Cinstant Pool)에서 s2를 생성할 때 s1이 이미 등록되어 있으므로 s1의 주소를 참조하기만 한다.
		  // 암시적 객체 생성을 할 때 이미 같은 문자열이 있다면 새로 생성하지 않고 기존의 참조 변수를 받아오기 때문이다.
		
		if (s3==s4){
			System.out.println("같다");
		}else{
			System.out.println("다르다");
		} // 다르다고 나온다. new라는 예약어를 사용하면 항상 heap메모리에 별도의 영역을 찾아 객체를 새로 생성하기 때문이다.
		
		// format => 형식을 지정하고 그 형식에 맞추어 생성하는 메소드
		String s5 = "hanbit";
		String s6 = "hanbit";
		String s7 = String.format("%20s, %s",s5,s6);	// 20자리, 0자리 순으로 채워진다.
		System.out.println("s7 = "+s7);	// s5는 총 6자이므로 14공백과 함께 20자 공간, s6는 6자만큼의 공간을 차지.
		
		// printf => 형식을 지정하고 그 형식에 맞추어 출력하는 메소드
		// s -> 문자열, d -> 정수, f -> 실수
		int su = 314;
		float su2 = 3.445f;
		double su3 = 3.5455;
		double su4 = 125.124;
		System.out.printf("%s, %d, %f, %f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %3d, %.1f, %.1f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %3d, %.2f, %.2f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s,%5d,%.2f,%.2f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %5d, %.0f, %.0f",s5,su,su2,su3);
		System.out.println();
		System.out.printf("%s, %5d, %.0f, %.0f, %.0f",s5,su,su2,su3,su4);
		
		// split("구분자") => 문자열을 배열로 쪼개는 메소드
		
		String s8 = "Happy day 2017 02 13";
		String[] s9 = s8.split(" ");	// => 띄어쓰기를 기준으로 스플릿
		
		// 배열 출력은 무조건 for문으로. 특히 개선된 for문을 사용하자.
		// 일단 그냥 for문은 아래와 같다		
		System.out.println();
		for (int i = 0; i < s9.length; i++) {
			System.out.println((i+1)+" : "+s9[i]);
		}
		System.out.println("::::::::개선된 for문::::::::");
		// 개선된 for문의 형식은 아래와 같다
		// for (배열의자료형 사용할변수 : 배열){}
		for (String k : s9) {	// 변수 k에 int i = 0 부터 배열 끝까지 반복하는 내용이 전부 들어간다.
			System.out.println(k);
		}
		
		// split("구분자", limit);
		System.out.println("::::::::::::::::::");
		String [] s10 = s8.split(" ", 3);
		for (String k : s10) {
			System.out.println(k);
		}
	} 
}
