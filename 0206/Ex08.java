class Ex08{
	public static void main(String[] args){
	// break문 : 현재 반복문 탈출

	// 0~10까지 출력
		for (int i=0;i<11;i++){
			System.out.print(i+" ");
		}
		System.out.println();

	// 0~3까지만 출력
		for (int i=0;i<11;i++){
			if (i==4) break;
			System.out.print(i+" ");
		}
		System.out.println();

	// while문으로 0~10까지 출력

		int k=0;
		while(k<11){
			System.out.print(k+" ");
			k++;
		}
	// while문과 break로 0~10까지 출력

		System.out.println();
		int k2=0;
		while(k2<11){
			if (k2==4) break;
			System.out.print(k2+" ");
			k2++;
		}

		System.out.println(); // 조건식을 아예 true로 줘도 된다.
		int k3=0;
		while(true){
			if (k3==4) break;
			System.out.print(k3+" ");
			k3++;
		}
		System.out.println();

	// 다중 for문에서의 break label문
	// 다중 반복문을 하나의 label로 묶은 뒤 한 번에 빠져나온다.
		System.out.println("::::::::::::::break label 연습::::::::::::::");
		chk : // 레이블 설정
		for (int i=1;i<4;i++){
			for (int j=1;j<6;j++){
				if (j==4) break chk;
				System.out.print("i="+i+", j="+j+" ");
			}
			System.out.println();
		}
		System.out.println(":::::::::::::::::::"); // label 전체를 탈출했으므로 줄바꿈없음
	}
}