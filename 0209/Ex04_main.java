import java.util.*;

class Ex04_main 
{
	public static void main(String[] args) // 파란색은 예약어, 빨간색은 클래스
	{
		Scanner scan = new Scanner(System.in); // static inputStream인 System.in을 입력받음
		Ex04 test = new Ex04();
		System.out.print("첫번째 수 : ");
		int su1 = scan.nextInt();
		System.out.print("두번째 수 : ");
//		int su2 = scan.nextInt();
		String su2 = scan.next();
		
		int res = test.add(su1, su2);

		System.out.println("결과 : "+res);
	}
}
