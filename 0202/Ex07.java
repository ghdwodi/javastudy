class Ex07{
	public static void main(String[] agrs){
	// 대입 연산자 : 특정한 상수값이나 변수값, 객체를 변수에 전달하여 기억시킬 때 사용
	// a = b <- 변수 a에 데이터 b를 저장
	// a += 10 <- 변수 a에 10을 더한 뒤 a에 저장
	// a -= 10 <- 변수 a에 10을 뺀 뒤 a에 저장

	int su = 10;
	su += 10; // su = su + 10
	System.out.println("su = "+su);
	su %= 7; // su = su % 7
	System.out.println("su = "+su);

	// su를 1씩 증가하는 방법
	// ++su, su++, su += 1, su = su + 1
	}
}