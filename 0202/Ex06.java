class Ex06{
	public static void main(String[] args){
	// 논리 연산자 &&, ||(OR, 논리합, 합집합), !(NOT, 부정)
	// !(not)은 1순위, 나머지 둘은 6순위
	// 결과는 boolean형으로 저장

	// &&(AND, 논리곱, 교집합) : false를 만나면 결과는 false. 뒤 조건은 계산하지 않음을 주의.
	// 숫자 >= && <= 숫자 <- 범위 지정

		int su1 = 10;
		int su2 = 7;
		boolean res = (su1 >= 7) && (su2 >= 5);
		System.out.println("결과 : "+res);
		res = (su1 <= 7) && (su2 >= 5);
		System.out.println("결과 : "+res);
		res = (su1 >= 7) && (su2 <= 5);
		System.out.println("결과 : "+res);
		res = (su1 <= 7) && (su2 <= 5);
		System.out.println("결과 : "+res);

		int num1 = 10;
		int num2 = 20;
		res = ((num1 = num1+12) > num2) && (num1 == (num2 = num2+2));
		System.out.println("res : "+res);
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);

		int num3 = 10;
		int num4 = 20;
		res = ((num3 = num3+12) < num4) && (num3 == (num4 = num4+2));
		System.out.println("res : "+res);
		System.out.println("num3 : "+num3);
		System.out.println("num4 : "+num4); // 앞 조건이 false였으므로 뒤 연산은 수행하지 않았다.

	// ||(OR, 논리합, 합집합) : true를 만나면 결과는 true. 뒤 조건은 계산하지 않음을 주의.

		int su3 = 10;
		int su4 = 7;
		res = (su3 >= 7) || (su4 >= 5);
		System.out.println("결과 : "+res);
		res = (su3 <= 7) || (su4 >= 5);
		System.out.println("결과 : "+res);
		res = (su3 >= 7) || (su4 <= 5);
		System.out.println("결과 : "+res);
		res = (su3 <= 7) || (su4 <= 5);
		System.out.println("결과 : "+res);

		int num5 = 10;
		int num6 = 20;
		res = ((num5 = num5+12) > num6) || (num5 == (num6 = num6+2));
		System.out.println("res : "+res);
		System.out.println("num5 : "+num5);
		System.out.println("num6 : "+num6); // 앞 조건이 true였으므로 뒤 연산은 수행하지 않았다.

		int num7 = 10;
		int num8 = 20;
		res = ((num7 = num7+12) < num8) || (num7 == (num8 = num8+2));
		System.out.println("res : "+res);
		System.out.println("num7 : "+num7);
		System.out.println("num8 : "+num8);
	}
}