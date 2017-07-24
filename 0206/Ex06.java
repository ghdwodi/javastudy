class Ex06{
	public static void main(String[] args){
	// while문 -> for문과 유사
	// 초기식;
	// while(조건식){
	//	// 조건식이 참이면 실행
	//	증감식;
	// }
	// 조건식을 무조건 참으로 두고 if문과 break로 처리하는 방식도 있다.

	// 0부터 10까지 출력하기
		int i = 0;
		while (i<11){
			System.out.print(i+" ");
			i++;
		}

	// 0부터 10까지 짝수 출력하기
		System.out.print("\n짝수\n");
		int j = 0;
		while (j<11){
			if (j%2==0){
				System.out.print(j+" ");
			}
			j++;
		}

	// 구구단 5단 출력하기
		System.out.println("\n\n<5단>");
		int k = 1;
		while (k<10){
			System.out.print("5 X "+k+" = "+(5*k)+"\n");
			k++;
		}
	// a~z까지 출력
		System.out.println("\n<알파벳>");
		int l = 'a';
		while (l<('z'+1)){
			System.out.print((char)l+" ");
			l++;
		}

	// 0~10까지의 누적합
		int su1 = 1;
		int res1 = 0;
		while (su1<11){
			res1 = res1 + su1;
			su1++;
		}
		System.out.println("\n<누적합> :"+res1);

	// 7!
		int su2 = 1;
		int res2 = 1;
		while (su2<8){
			res2 = res2*su2;
			su2++;
		}
		System.out.println("\n7! = "+res2);

	// 0~10까지 홀수의 합, 짝수의 합 구하기
		int su3 = 0;
		int res_o = 0;
		int res_e = 0;
		while (su3<11){
			if (su3%2==0){
				res_e = res_e + su3;
			} else{
				res_o = res_o + su3;
			}
			su3++;
		}
		System.out.println("\n<홀수합> :"+res_o);
		System.out.println("\n<짝수합> :"+res_e);
	}
}