package com.hb.am;

// 2. Local ���� Ŭ���� : �ܺ� Ŭ���� �޼ҵ� �ȿ� ���� Ŭ������ �����ϴ� ��츦 ���Ѵ�.
//					  �ܺ� Ŭ������ ��������ó�� ����Ѵ�. �ܺ� Ŭ������ �޼ҵ尡 ����� �� �����ȴ�.
// ���� : �ܺ� Ŭ����{���, ���, �޼ҵ�(){���� Ŭ����{}},...}
public class Ex03 {
	int su1 = 100;
	public Ex03() {
		System.out.println("�ܺ� Ŭ���� ������ : "+this);
	}
	
	public void prn(){
		int s1 = 10;
		System.out.println("�ܺ� Ŭ���� �޼ҵ�");
		System.out.println(su1+s1);
	}
	
	public void prn2(){
		int num1 = 1000;		
		int num2 = 2000;
		
		// ���� Ŭ����
		class Ex03_1{
			int number1 = 1;
//			static int number2 = 2;
			// ���� Ŭ������ static�� ����� �� ����.
			// ����Ϸ��� ���� Ŭ������ static�̾�� �Ѵ�.
			static final int number3 = 3;
			final int number4 = 4;
			
			public void in_prn(){
				// �ܺ� Ŭ������ ������ �޼ҵ� ��� ����
				System.out.println(su1);
//				System.out.println(s1);		// �ܺ� �޼ҵ��� ���������̹Ƿ� ��� �Ұ�
				System.out.println(num1);
				System.out.println(num2);
				prn();
			}	// ���� �޼ҵ� ��
			
		}	// ���� Ŭ���� ��
		Ex03_1 t = new Ex03_1();
		System.out.println("::���� Ŭ������ ����::");
		System.out.println(t.number1);
		System.out.println(t.number3);
		System.out.println(t.number4);
		System.out.println("::���� Ŭ������ �޼ҵ�:;");
		t.in_prn();
		System.out.println(":;�ܺ� Ŭ������ ����::");
		System.out.println(su1);
		System.out.println("::�ܺ� Ŭ������ �޼ҵ�::");
		prn();
		
//		System.out.println(prn.s);	// �ٸ� ������ ������ ��� �Ұ�
		System.out.println(num1);	// �Ҽӵ� ������ ������ ��� ����
	}	// �ܺ� �޼ҵ� ��
	
}	// �ܺ� Ŭ���� ��
