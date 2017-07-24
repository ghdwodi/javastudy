class Ex05{
	public static void main(String[] args){
	// 비교연산자는 왼쪽을 기준으로 한다.
	// ex) a < b : a는 b보다 작다(O), b는 a보다 크다(X)
	// 주의사항 : String은 ==로 비교할 수 없다.(오류 발생)
	// char는 코드값(숫자)로 저장되므로 == 연산자 사용 가능.
	// 결과는 무조건 boolean형으로 저장. 조건식에 많이 사용한다.

		int su1 = 20;
		int su2 = 30;
		boolean res1 = su1 > su2;

		System.out.println("결과 : "+res1);

		char ch1 = 'A';
		char ch2 = 'a';
		boolean res2 = ch1 > ch2;
		System.out.println("결과 : "+res2);

		// 대소문자 판별하기
		char k = 'P';
		boolean res3 = k >= 'A' && k <= 'Z'; // 대문자
		boolean res4 = k >= 'a' && k <= 'z'; // 소문자

		System.out.println(k+"는 대문자인가? : "+res3+"\n아니면 "+k+"는 소문자인가? : "+res4);
	}
}