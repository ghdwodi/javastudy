class Ex04{
	public static void main(String[] args){
	// 다중 if문
	// if(조건식 1) {
	// 	조건식 1이 참이면 실행하는 문장
	// } else if(조건식 2){
	// 	조건식 1은 거짓이고 조건식 2가 참이면 실행하는 문장
	// } else if(조건식 3){
	// 	조건식 1~2는 거짓이고 조건식 3이 참이면 실행하는 문장
	// } else{
	// 	조건식 1~3이 모두 거짓이면 실행하는 문장
	// }


	// 어떤 사람의 평균점수가 90 이상이면 A학점, 80 이상이면 B학점, 70 이상이면 C학점, 나머지는 F학점

		double avg;
		boolean grA, grB, grC, grF;
		String res1;
		avg = 85;
		grA = (avg>=90 && avg<=100);
		grB = (avg<90 && avg>=80);
		grC = (avg<80 && avg>=70);
		grF = (avg<70 && avg>=0);

		if (grA){
			res1 = "A학점";
		} else if (grB){
			res1 = "B학점";
		} else if (grC){
			res1 = "C학점";
		} else if (grF){
			res1 = "F학점";
		} else{
			res1 = "입력오류";
		}
		System.out.println(res1);

	// char ch가 A, a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국

		char ch;
		String res2;
		ch = 66;

		if (ch=='A' || ch=='a'){
			res2 = "아프리카";
		} else if (ch=='B' || ch=='b'){
			res2 = "브라질";
		} else if (ch=='C' || ch=='c'){
			res2 = "캐나다";
		} else{
			res2 = "한국";
		}
		System.out.println(res2);

	// char ch2의 대문자, 숫자, 소문자 여부 판별

		char ch2;
		String res3;

		ch2 = '!';

		if (ch2>='a' && ch2<='z'){
			res3 = "소문자";
		} else if (ch2>='A' && ch2<='Z'){
			res3 = "대문자";
		} else if (ch2>='0' && ch2<='9'){
			res3 = "숫자";
		} else{
			res3 = "그 외";
		}
		System.out.println(res3);
		

	// 메뉴 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500
	// 지불한 돈은 10000
	// 친구와 두 잔 먹었을 때 잔돈은 얼마를 받아야 하는가?(부가세 10%)

		int menu, price, num, pay, totalPrice, change;
		double taxRate;
		String name = "";
		String res4 = "";

		menu = 2;
		price = 0;
		num = 2;
		pay = 10000;
		taxRate = 0.1;
		if (menu>=1 && menu <= 4){
			if (menu==1){
				price = 3500;
				name = "카페모카";
			} else if (menu==2){
				price = 4000;
				name = "카페라떼";
			} else if (menu==3){
				price = 3000;
				name = "아메리카노";
			} else{
				price = 3500;
				name = "과일쥬스";
			}
		totalPrice = (int)Math.round(price*num*(1+taxRate));
		change = pay - totalPrice;
		res4 = (name+" "+num+"잔\n지불액 "+pay+
		"원\n결제액 "+totalPrice+"원\n거스름돈 "+(int)change+"원");
		} else {
		res4 = "입력오류";
		}
		System.out.println(res4);
	}
}