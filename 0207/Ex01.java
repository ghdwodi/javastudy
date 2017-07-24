//import java.util.Scanner;
import java.util.*; // java.util의 모든 클래스를 불러온다(속도 차이가 있으나 대체로 의미없음)

class Ex01{
	public static void main(String[] args){
	// 키보드 I/O(인풋, 아웃풋)
	// 클래스 Scanner : java.lang에 존재하지 않으므로 import해야 한다.

	// 표준 입력장치(키보드)로 입력한 데이터를 scan에 저장
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : "); // 입력받을 자료에 대한 질문 출력
	// String name = scan.next();
	// 입력한 scan의 자료형을 결정, 분리해 저장(scan.nextXXX)
		String name2 = scan.nextLine() ;
	// 그냥 next는 띄어쓰기를 인식하지 못하므로 한 행의 끝까지 저장하는 메소드 nextLine을 사용.

		System.out.print("나이 : ");
		int age = scan.nextInt(); // scan변수에 계속 입력되므로 계속 다른 변수에 저장해준다.

		System.out.print("키 : ");
		double height = scan.nextDouble();

		System.out.print("진실입니까? : ");
		boolean res = scan.nextBoolean();

		if (res){
			System.out.println("이름 : "+name2);
			System.out.println("나이 : "+age);
			System.out.println("키 : "+height);
		} else{
			System.out.println("거짓말!");
		}

	
	}
}