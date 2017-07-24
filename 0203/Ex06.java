class Ex06{
	public static void main(String[] args){
	// for문
	// for (초기식; 조건식; 증감식){실행문들;}
	// for문은 무한루프를 조심할 것
	// 초기식에서 만든 변수는 for문 내에서만 존재한다
	// 이런 변수를 지역변수라 한다(반의어 : 전역변수)

	// 0부터 10까지 출력해보자
		System.out.println("0부터 10까지");
		for (int i=0; i<=10; i=i+1){
			System.out.println("i = "+i);
		}
	// 0부터 10까지 짝수만 출력해보자
		System.out.println("\n0부터 10까지 짝수만");
		for (int i=0; i<=10; i=i+1){
			if(i%2==0){
				System.out.println("i = "+i);
			}
		}

	// 변수를 밖에서 선언하는 경우
		int j;

		System.out.println("\n전역변수 j의 값은");
		for (j=0; j<=10;j++){
		}			// 내부는 비어 있지만 j는 계속 연산 진행
		System.out.println("j = "+j);

	// 구구단 5단
		System.out.println("\n구구단 5단");
		for (int i=1;i<=9;i++){
			if (i==1 || i==3 || i==6 || i==7 || i==8){
				System.out.println("5 곱하기 "+i+"은 "+(5*i));
			} else{
				System.out.println("5 곱하기 "+i+"는 "+(5*i));
			}
		}

	// a~z까지 출력하기
		System.out.println("\n알파벳");
		for (char i='a';i<='z';i++){
			System.out.print(i+" ");
		}

	// a~z까지 출력하기 (int)
		System.out.println("\n\n알파벳(int로 저장)");
		for (int i='A';i<='Z';i=i+1){
			System.out.print((char)i+" ");
		}

	// 0 ~ 10 까지 누적합 구하기
		System.out.println("\n\n누적합");
		int res = 0;
		for (int i=0;i<=10;i++){
			res = res+i;
		}
		System.out.println("합계 : "+res);

	// 1 ~ 10 까지 홀수의 합과 짝수의 합을 따로 구하기
		System.out.println("\n홀짝 합");
		int res2 = 0;
		int res3 = 0;
		for (int i=1;i<=10;i++){
			if (i%2==0){
				res2 = res2 + i;
			} else{
				res3 = res3 + i;
			}
		}
		System.out.println("짝수합 : "+res2+"\n홀수합 : "+res3);
	// 7!
		int input = 7;
		int res4 = 1;
		for (int i=1;i<=input;i=i+1){
			res4 = res4*i;
		}
		System.out.println("\n"+input+"! = "+res4);
	}
}