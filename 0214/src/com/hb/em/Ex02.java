package com.hb.em;

// �ڽ� Ŭ����
public class Ex02 extends Ex01 {
	@Override
	public void prn() {
		System.out.println("�ڽ� prn()");
	}
	
	// prn2()�� �θ� Ŭ������ �����͵� �������̵� �� �� ����.
	// static�޼ҵ�� �������̵��̶� ������ ����.
	
	public static void prn2(){
		// static �޼ҵ�� static ������ ��� ����
		// ���������� ����� �� �ִ�		
		int k = 10;
		System.out.println("�ڽ� static prn2()");
//		System.out.println(su1);	// instance ������ static �޼ҵ忡�� ��������Ƿ� ���� �߻�
		System.out.println(su2);
//		System.out.println(su3);
		System.out.println(su4);
		System.out.println(k);		// ���������̹Ƿ� ��� ����
	}

	
	// �θ� Ŭ������ prn3() �޼ҵ尡 final�̹Ƿ� �������̵� �� �� ����.
	// �� ��쿣 �ƿ� ������ �� ���� ����.
	
/*	public final void prn3(){
		System.out.println("�θ� prn3()");
		su1 = su1 + 2;
		su2 = su2 + 2;
//		su3 = su3 + 2;	// ����� �� ������ �� �� �����Ƿ� ���� �߻�.
//		su4 = su4 + 2;		
	}
*/
}
