import java.util.*;

class Ex05_main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		Ex05 test = new Ex05();
		Ex05_2 test2 = new Ex05_2();
		// �̸�, ����, ����, ���� �Է¹���
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("���� : ");
		int kor = scan.nextInt();
		System.out.print("���� : ");
		int eng = scan.nextInt();
		System.out.print("���� : ");
		int math = scan.nextInt();
		// �հ� �޼ҵ� ȣ��
		int sum = test.sumM(kor, eng, math);
		// ��� �޼ҵ� ȣ��
		double avg = test.avgM(sum);
		// ���� �޼ҵ� ȣ��
		String grade = test.gradeM(avg);
		// ��� �޼ҵ� ȣ��
		test.printM(name, sum, avg, grade);

		/////////////////////////////////////////

		test2.sumM(kor,eng,math);
		test2.printM(name);
	}
}
