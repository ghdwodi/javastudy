class Ex09{
	public static void main(String[] args){
	// continue문 : 현재반복문에서 continue문 아래 실행문을 skip한 뒤 다음 루프로 점프
	// for문의 경우 다음 증감식으로 점프
	// while문의 경우 다음 조건식으로 점프 <- 조건식 전에 증감식이 있어야 무한루프 방지

	// 0~10 출력
		for (int i=0;i<11;i++){
			System.out.print(i+" ");
		}
		System.out.println(":::::::::::::::::");

	// 0~10 출력 (i=3일 때 continue)
		for (int i=0;i<11;i++){
			if (i==3) continue;
			System.out.print(i+" ");
		}
		System.out.println(":::::::::::::::::");

	// while문의 경우
	// while문에서는 for문에 비해 continue를 쓰기 까다로울 때가 많다.
		int k=-1;
		while (k<10){
			k++;
			if (k==3) continue;
			System.out.print(k+" ");
		}
		System.out.println(":::::::::::::::::");

	// continue문을 이용한 짝수 출력
		for (int i=0;i<11;i++){
			if (i%2!=0) continue;
			System.out.print(i+" ");
		}
		System.out.println(":::::::::::::::::");

	// continue label문
	// 다중 for문의 continue문은 안쪽 for문의 증감식으로 이동한다.
	// continue label문은 label을 가진 외부 for문의 증감식으로 이동한다.
		con_label:
		for (int i=1;i<4;i++){
			for (int j=1;j<6;j++){
				if (j==2) continue con_label;
				// if (i==2) continue;
				System.out.print("(i="+i+",j="+j+") ");
			}
			System.out.println();
		}
	}
}