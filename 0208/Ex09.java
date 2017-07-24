class Ex09{
	public static void main(String[] args){
	// 다차원 배열 : 1차원 배열이 여러 개 모인 것. 고정길이와 가변길이가 있다.
	// 1. 고정길이

		int[][] su1; // <= 이차원 배열 선언 형식 : 자료형[][] 이름;
		su1 = new int[3][2]; // 고정길이를 가진다

		su1[0][0] = 10;
		su1[0][1] = 20;
		su1[1][0] = 100;
		su1[1][1] = 200;
		su1[2][0] = 1000;
		su1[2][1] = 2000;

	// 선언과 생성을 한 번에 할 수도 있다.

		int[][] su2 = new int[3][2];

	// 선언, 생성과 초기값 입력까지 한 번에 하기

		int[][] su3 = {{10,20},{100,200},{1000,2000}};
		System.out.println("주소 : "+su3);
		System.out.println("주소 : "+su3[2]);
		System.out.println(su3.length+","+su3[0].length);

	// 출력

		for (int i=0;i<su3.length;i++){
			for (int j=0;j<su3[i].length;j++){
				System.out.println(su3[i][j]);
			}
		}

		System.out.println("::::::::::::::::::::::::::");

	// 2. 가변길이

		int [][] num;
		num = new int[3][]; // 가변길이를 가진다(단 1차원 값(3)은 고정되어 있어야 한다)

		// 아래처럼 입력하면 런타임 오류 발생(컴파일 오류는 없으나 실행시 오류 발생)

		// num[0][0] = 10;
		// num[0][1] = 20;
		// num[1][0] = 100;
		// num[1][1] = 200;
		// num[2][0] = 1000;
		// num[2][1] = 2000;

		// 가변길이 2차원 배열을 입력하려면 각 1차원 배열에 들어갈 1차원배열을 별도로 만들어야 한다.

		int[] num1 = {10,20};
		int[] num2 = {100,200,300,400};
		int[] num3 = {1000,2000,3000};		

		num[0] = num1;
		num[1] = num2;
		num[2] = num3;

		for (int i=0;i<num.length;i++){
			for (int j=0;j<num[i].length;j++){
				System.out.print(num[i][j]+"\t");
			}
			System.out.println();
		}
	}
}