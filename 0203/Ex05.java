class Ex05{
	public static void main(String[] args){
	// switch문 : 인자값과 동일한 조건값을 순서에 관계없이 찾아내 명령을 수행한다.
	// switch (인자값){
	// 	case 조건값1 :	// 세미콜론(;)이 아닌 콜론(:)임에 주의할 것
	//	수행문; break;	// break는 각 조건마다 넣어 주어야 한다
	// 	case 조건값2 :	// break를 생략하면 다음 break문을 만날 때까지 계속 실행한다.
	//	수행문; break;
	// 	case 조건값3 :
	//	수행문; break;
	//	default :	// <- 어떤 조건도 충족하지 않으면 수행하는 기본값
	//	수행문;
	// }

	// 인자값,조건값에는 long을 제외한 정수형, 문자형, String만 들어갈 수 있다.
	// (비교연산, 논리연산, boolean형은 들어갈 수 없다)

	// char ch가 A, a이면 아프리카, B,b이면 브라질, C,c이면 캐나다, 나머지는 한국

		char ch = 'C';
		String res1 = "";
		switch (ch){
			/*case 'a': res1 = "아프리카"; break;
			case 'A': res1 = "아프리카"; break;
			case 'b': res1 = "브라질"; break;
			case 'B': res1 = "브라질"; break;
			case 'c': res1 = "캐나다"; break;
			case 'C': res1 = "캐나다"; break;
			default : res1 = "한국";*/

			case 'a': 
			case 'A': System.out.println("아프리카"); break;
			case 'b': 
			case 'B': System.out.println("브라질"); break;
			case 'c': 
			case 'C': System.out.println("캐나다"); break;
			default : System.out.println("한국");
			// 붙어 있는 조건끼리 break 하나로 묶어서 OR처럼 처리할 수도 있다.
		}
		// System.out.println(res1);
	
	// month가 3,4,5면 "봄", 6,7,8이면 "여름", 9,10,11이면 "가을", 12,1,2이면 "겨울"

		int month = 3;
		switch(month){
			case 3:
			case 4:
			case 5: System.out.println("봄"); break;
			case 6:
			case 7:
			case 8: System.out.println("여름"); break;
			case 9:
			case 10:
			case 11: System.out.println("가을"); break;
			case 12:
			case 1:
			case 2: System.out.println("겨울"); break;
			default : System.out.println("??");
		}

	// 평균이 90 이상이면 A학점, 80 이상이면 B학점, 70 이상이면 C학점, 나머지는 F학점

		int avg = 71;
		String res2 = "";
		switch((int)(avg/10)){
			case 10:
			case 9: res2 = "A학점"; break;
			case 8: res2 = "B학점"; break;
			case 7: res2 = "C학점"; break;
			default : res2 = "F학점";
		}
		System.out.println(res2);

	// 메뉴 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일쥬스 3500
	// 지불한 돈은 10000
	// 친구와 두 잔 먹었을 때 잔돈은 얼마를 받아야 하는가?(부가세 10%)

		int menu, price, num, pay;
		double taxRate;
		String res3 = "";

		menu = 1;
		num = 2;
		pay = 10000;
		taxRate = 0.1;

		switch(menu){
			case 1: res3 = (pay - (int)Math.round(3500*num*(1+taxRate)))+"원"; break;
			case 2: res3 = (pay - (int)Math.round(4000*num*(1+taxRate)))+"원"; break;
			case 3: res3 = (pay - (int)Math.round(3000*num*(1+taxRate)))+"원"; break;
			case 4: res3 = (pay - (int)Math.round(3500*num*(1+taxRate)))+"원"; break;
			default: res3 = "입력오류";
		}
		System.out.println(res3);
	}
}