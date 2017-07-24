class Ex07{
	public static void main(String[] args){
	// do-while문 -> while문과는 달리 일단 한 번 수행한 뒤 조건을 따져본다.
	// 그게 다다. 사실 while문을 쓰면 그만이다.
	// 초기식;
	// do{
	//	실행문;
	//	증감식;
	// } while (조건식); <- ;를 붙여야 한다는 점에 주의할 것

	// 0~10 출력

		int i=0;
		do{
			System.out.print(i+" ");
			i++;
		} while(i<11);

	// 0~10 짝수 출력

		System.out.println("\n짝수");
		int j=0;
		do{
			if (j%2==0){
				System.out.print(j+" ");
			}
			j++;
		} while(j<11);

	// 구구단 5단

		System.out.println("\n<5단>");
		int su1=1;
		do{
			System.out.print("5 X "+su1+"= "+su1*5+"\n");
			su1++;
		} while(su1<6);

	// a~z 출력

		System.out.println("\n<알파벳>");
		int ch1='a';
		do{
			System.out.print((char) ch1+" ");
			ch1++;
		} while(ch1<('z'+1));

	// 0~10 누적합

		int su2=0;
		int res=0;
		do{
			res = res + su2;
			su2++;
		} while(su2<11);
		System.out.println("\n<누적합> : "+res);

	// 7!

		int su3=1;
		int resfac=1;
		do{
			resfac = resfac*su3;
			su3++;
		} while(su3<8);
		System.out.println("\n7! = "+resfac);

	// 0~10 홀수합, 짝수합

		int su4=1;
		int res_odd=0;
		int res_eve=0;
		do{
			if (su4%2==0){
				res_eve = res_eve + su4;
			} else{
				res_odd = res_odd + su4;
			}
			su4++;
		} while(su4<11);
		System.out.println("짝수합 = "+res_eve+" 홀수합 = "+res_odd);
	}
}