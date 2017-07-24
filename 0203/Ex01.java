class Ex01{
	public static void main(String[] args){
	// 삼항 연산자 ?, :
	// 형식 -> 변수 = 조건식 ? 참일 때의 실행문 : 거짓일 때의 실행문
	// 주의사항 : 변수와 참값, 거짓값 모두의 자료형이 같아야 한다. 조건식은 항상 boolean형이다.
	// boolean형 -> 논리형(True, False), 비교연산(>,<,==,!=,etc...), 논리연산(&&,||,!)
	
	boolean s;
	s = 15==20;
	String res = s ? "안녕하세요?" : "Hello?";
	System.out.println(res);

	int res2 = false ? 100+10 : 'A';
	System.out.println(res2);

	// 어떤 수 k가 홀수인지 짝수인지 판별해보자.

	int k = 40;
	boolean st = (k % 2 == 0);
	String res3 = st ? "짝수" : "홀수";
	System.out.println(res3);

	// 어떤 문자 k2가 대문자인지 소문자인지 숫자인지 판별해보자.

	char k2;
	k2 = '!';
	boolean st2 = (k2>='A' && k2 <= 'Z');
	boolean st3 = (k2>='a' && k2 <= 'z');
	boolean st4 = (k2>='0' && k2 <= '9');
	String res4 = st2 ? "대문자" : (st3 ? "소문자" : (st4 ? "숫자" : "그 외"));
	System.out.println(res4);

	// 어떤 사람의 평균점수가 90 이상이면 A학점, 80 이상이면 B학점, 나머지는 F학점

	int avg; boolean grA, grB, grF; String res5;
	avg = 70;
	grA = (avg>=90 && avg<=100);
	grB = (avg<90 && avg>=80);
	grF = (avg<80 && avg>=0);
	res5 = grA ? "A학점" : (grB ? "B학점" : (grF ? "F학점" : "입력오류"));
	System.out.println(res5);

	// 성별이 1 또는 3이면 남성, 2 또는 4면 여성, 나머지는 외국인

	int gender; boolean male, female; String res6;
	gender = 4;
	male = (gender == 1 || gender == 3);
	female = (gender == 2 || gender == 4);
	res6 = male ? "남성" : (female ? "여성" : "외국인");
	System.out.println(res6);

	// 8시간까지는 시급 6,780원, 초과급은 1.5배 지급

	double time, basePay, exPayRate, pay; boolean base, ex; String res7;
	time = 10;
	basePay = 6780;
	exPayRate = 1.5;
	base = (time>=0 && time<=8);
	ex = (time>8);
	pay = base ? (time*basePay) : (8*basePay+(time-8)*basePay*exPayRate);
	res7 = "금 "+(int)pay+"원";
	System.out.println(res7);
	}
}