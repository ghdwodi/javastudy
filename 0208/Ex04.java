import java.util.*;

class Ex04{
	public static void main(String[] args){
	// �������� �� ������ �ִ�

	// 1. Math Ŭ������ random �޼ҵ� : 0.0 �̻� 1.0 �̸��� double�� ���� ����

		for (int i=0;i<10;i++){
			double res1 = Math.random();
			System.out.print(res1+" ");
		}
		System.out.println("\n:::::::::::::::::::::::::::::");

	// Math.random() ���� �����ϱ� : (int)(Math.random()*n) <= 0~n �������� ���� ����

		for (int i=0;i<10;i++){
			int res1 = (int)(Math.random()*10+1);
			System.out.print(res1+" ");
		}
		System.out.println("\n:::::::::::::::::::::::::::::");

	// 2. Random Ŭ���� : Math.random()�� ������ API

		Random ran = new Random();		// Random Ŭ���� ran ����, new ������ ����
		System.out.println("ran�� �ּ� : "+ran);	// ran�� �ּҰ� ���

	// �� �ڷ��� ���� Random ������ ���� : nextXXX(�ڷ���)
	// nextBoolean() : true/false�� ������ ����
	// nextDouble(), nextFloat(), nextInt(), nextLong() : �� �ڷ��� ũ�⸸ŭ�� ���� �� ���� ����

		System.out.println("���� : "+ran.nextBoolean());
		System.out.println("���� : "+ran.nextDouble());
		System.out.println("���� : "+ran.nextFloat());
		System.out.println("���� : "+ran.nextInt());
		System.out.println("���� : "+ran.nextLong());

	// nextInt(n) : 0~(n-1)������ ���� ���� ����

		System.out.println("���� : "+ran.nextInt(7));
	}
}