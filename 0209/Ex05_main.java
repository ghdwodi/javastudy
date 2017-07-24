import java.util.*;

class Ex05_main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Ex05 test = new Ex05();
		Ex05_2 test2 = new Ex05_2();
		// 이름, 국어, 영어, 수학 입력받음
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		// 합계 메소드 호출
		int sum = test.sumM(kor, eng, math);
		// 평균 메소드 호출
		double avg = test.avgM(sum);
		// 학점 메소드 호출
		String grade = test.gradeM(avg);
		// 출력 메소드 호출
		test.printM(name, sum, avg, grade);

		/////////////////////////////////////////

		test2.sumM(kor,eng,math);
		test2.printM(name);
	}
}
