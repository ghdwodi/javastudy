class Ex5{
	public static void main(String[] args){

	// 정수형 : 기본은 int형
	// byte < short < int < long
	// byte : -128 ~ 127

	byte su = 127;
	// System.out.println(su+1); <- 변수 선언은 정상이므로 오류가 발생하지 않음.
	byte su2 = -128;
	// byte result = su+su2; <- byte끼리 더해도 '계산된 결과'는 항상 int이기 때문에 오류 발생
	int result = su+su2;
	System.out.println(result);

	// long형은 숫자 뒤에 L 또는 l 을 붙인다. (물론 생략가능)
	long num1 = 1234L;
	long num2 = 214; // int가 더 큰 자료형인 long으로 변환. 프로모션이라 한다.(p.64)
	long sum = num1+num2;
	System.out.println(sum);

	// 실수형 : 기본은 double형
	// flaot < double
	float pi = 3.14f; // long과는 달리 반드시 F나 f를 붙여 구분해야 한다.(생략불가)
	// long의 경우는 프로모션이 일어나지만 float는 double에 비해서 작으므로 일어나지 않는다.
	System.out.println(pi);
	}
}