class Ex02_1 
{
	// 멤버 필드 : 변수와 상수
	int su1 = 10;					// 변수, 인스턴스
	static int su2 = 20;			// 변수, static
	static final int SU3 = 30;		// 일반적인 진짜 상수(static)
	final int SU4 = 40;				// 변수의 강제적인 상수화(instance)

	public void prn(){
		System.out.println("메소드 시작");
		su1 = su1 + 10;
		su2 = su2 + 10;
//		SU3 = SU3 + 10;				// 상수는 값을 변경할 수 없으므로 오류 발생
//		SU4 = SU4 + 10;
		System.out.println(su1);	// jvm이 호출할 메인 메소드가 존재하지 않음
		System.out.println(su2);
		System.out.println("메소드 끝");
	}
	public String prn2(){			// 반환형이 String이므로 반환값이 있어야 한다.
		System.out.println("메소드 시작");
		String msg = "점심을 먹자 ";
		System.out.println("메소드 끝");
		return msg;					// 반환할 String
	}
}
