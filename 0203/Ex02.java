class Ex02{
	public static void main(String[] args){
	// 단순 if문 : 조건 제시, 참일 경우만 실행. 거짓일 때는 if문 자체를 무시.
	// 형식 : if(조건식) {실행문들} -> 실행문이 하나일 때는 중괄호 생략 가능.
	// 총점(sum)이 60 이상이면 합격
		int sum = 59;
		String res1 = "";
		if (sum>=60){
			res1 = "합격";
		}
		System.out.println(res1);
	// 총점(sum)이 60 이상이면 합격, 아니면 불합격

		String res2 = "불합격";
		if (sum>=60){
		res2 = "합격";
		}
		System.out.println(res2);

	// 어떤 수 k가 홀수인지 짝수인지 판별해보자.

		int k; String res3;
		k = 4;
		res3 = "홀수";
		if (k%2==0){
			res3 = "짝수";
		}
		System.out.println(res3);

	// 어떤 문자 k2가 대문자인지 소문자인지 숫자인지 판별해보자.

		char k2; String res4;
		k2 = 'A';
		res4 = "대문자아님";
		if (k2>='A' && k2<='Z'){
			res4 = "대문자";
		}
		System.out.println(res4);

	// 8시간까지는 시급 6,780원, 초과급은 1.5배 지급

		double time, basePay, exPayRate, pay;
		String res5;
		time = 0;
		basePay = 6780;
		exPayRate = 1.5;
		pay = 0;
		if (time<=8){
			pay = time*basePay;
		}
		if (time>8){
			pay = 8*basePay+(time-8)*basePay*exPayRate;
		}
		res5 = "금 "+(int)pay+"원";
		System.out.println(res5);
	}
}