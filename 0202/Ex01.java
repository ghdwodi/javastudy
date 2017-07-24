class Ex01{
	public static void main(String[] args){
	// 프로모션 : 자동 형 변환. 작은 자료형을 큰 자료형으로 변환. 오류, 정보손실 없음.
			
		long su1 = 10;
		int num1 = 20;
		su1 = num1; // long형 = int형 프로모션
		System.out.println(su1);

		char ch = 'a';
		num1 = ch; // char형 = int형 프로모션 (int > char)
		System.out.println(num1);

		float su2 = su1;
		System.out.println(su2);

	// 디모션 : 강제 형 변환(캐스팅).
	// 큰 자료형을 작은 자료형으로 변환할 때의 오류를 없애는 강제 변환. 정보 손실 가능성 존재.

		int su3 = 129;
		// byte num2 = su3; <- int를 byte에 집어넣을 수 없음.
		// 자료형 변수명 = (왼쪽자료형)(데이터);
		byte num2 = (byte)(su3);
		System.out.println(num2);
		// su3 = 129이므로 float의 범위를 초과. 값이 한 바퀴 돌아서 오류 발생.

		int num3 = 65;
		// char ch2 = num3; <- int > char 이므로 오류 발생.
		char ch2 = (char)(num3);
		System.out.println(ch2); // ASCII code 65 = 'A' 가 출력.
	}
}