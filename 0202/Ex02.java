class Ex02{
	public static void main(String[] args){
		// String : class를 자료형으로 사용하는 대표적인 참조 자료형이다.
		// 거의 기본 자료형처럼 사용한다.
		String str = "방가방가";
		System.out.println(str);
		// String은 + 연산자를 사용할 수 있다. (문자연결자로 사용)
		String str2 = "10";
		int su1 = 10;
		System.out.println(str2+su1); // 결과는 문자열이므로 '1천1십'이 아니라 일공일공'.
		System.out.println("::::::::::::::::::::::::::::::::::::");
		System.out.println("결과 : "+str2+10);
		System.out.println("결과 : "+su1+100); // "결과 : " <- String이므로 프로모션 발생.
		System.out.println("결과 : "+(su1+100)); // 괄호의 중요성
		System.out.println(su1+100+"이 결과다."); // 왼쪽부터 연산하므로 int가 먼저 계산
	}
}