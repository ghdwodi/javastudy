class Ex13{
	public static void main(String[] args){
	// 배열 : 같은 자료형 데이터를 한 곳에 모은 묶음
	// 배열을 생성할 때는 반드시 크기를 지정해야 하며, 같은 자료형끼리만 배열로 만들 수 있다.
	// 배열의 크기는 불변이다.(배열 복사를 이용해서 변경할 수는 있다)
	// 순서 : 선언 => 생성 => 초기값

	// 1. 선언 : 자료형[] 이름; 또는 자료형 이름[];
	// ex) int[] su; int su2[];
	// 2. 생성 : 이름 = new 자료형[n]; <= 크기는 반드시 입력해야 하며 변경도 불가능
	// ex) su = new int[4]; su2 = new int [4];
	// 3. 초기값 입력 : 배열이름[index] = 저장 데이터;
	// ex) su[0]=10;su[1]=20;su[2]=30;su[3]=40;
	// for (int i=0;i<4;i++){su2[i]=10;} <= for문을 이용해 입력하는 것도 가능

	// 선언과 동시에 생성해보자
		int[] su3 = new int[4];
	// 값 입력까지 한번에
		int[] su4 = {10,20,30,40};

	// 배열 su4가 가지고 있는 메모리 주소를 알아보자.
		System.out.println(su4);
		System.out.println(su4.toString());

	// 3번째 값을 알려면
		System.out.println(su4[2]);

	// 모든 값을 확인해 보자
		for (int i=0;i<su4.length;i++){	// 배열.length <= 배열의 크기를 구하는 메소드
			int k = su4[i];
			System.out.print("["+(k+100)+"] ");
		}

	}
}