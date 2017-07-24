import java.util.*;

class Ex04{
	public static void main(String[] args){
	// 랜덤에는 두 가지가 있다

	// 1. Math 클래스의 random 메소드 : 0.0 이상 1.0 미만의 double형 난수 생성

		for (int i=0;i<10;i++){
			double res1 = Math.random();
			System.out.print(res1+" ");
		}
		System.out.println("\n:::::::::::::::::::::::::::::");

	// Math.random() 범위 지정하기 : (int)(Math.random()*n) <= 0~n 전까지의 난수 생성

		for (int i=0;i<10;i++){
			int res1 = (int)(Math.random()*10+1);
			System.out.print(res1+" ");
		}
		System.out.println("\n:::::::::::::::::::::::::::::");

	// 2. Random 클래스 : Math.random()을 응용한 API

		Random ran = new Random();		// Random 클래스 ran 선언, new 예약어로 생성
		System.out.println("ran의 주소 : "+ran);	// ran의 주소값 출력

	// 각 자료형 별로 Random 추출이 가능 : nextXXX(자료형)
	// nextBoolean() : true/false값 무작위 생성
	// nextDouble(), nextFloat(), nextInt(), nextLong() : 각 자료형 크기만큼의 범위 내 난수 생성

		System.out.println("난수 : "+ran.nextBoolean());
		System.out.println("난수 : "+ran.nextDouble());
		System.out.println("난수 : "+ran.nextFloat());
		System.out.println("난수 : "+ran.nextInt());
		System.out.println("난수 : "+ran.nextLong());

	// nextInt(n) : 0~(n-1)까지의 정수 난수 생성

		System.out.println("난수 : "+ran.nextInt(7));
	}
}