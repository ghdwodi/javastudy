package com.hb.am;

public class Ex02_main {
	// ���� Ŭ���������δ� ��ü�� ������ �� ����.
	// �׻� �ܺ� Ŭ������ ���� ������ �Ѵ�.
	public static void main(String[] args) {
//		Ex02_1 test = new Ex02_1;	// <= �Ұ���
		
		// ���� �ܺ� Ŭ������ ��üȭ�Ѵ�.
		Ex02 test = new Ex02();
		System.out.println(":::::::::::::::::::::::::");
		
		// ��� 1
		Ex02.Ex02_1 test1 = new Ex02().new Ex02_1();
		System.out.println(":::::::::::::::::::::::::");
		
		// ��� 2
		Ex02.Ex02_1 test2 = test.new Ex02_1();
		System.out.println(":::::::::::::::::::::::::");
		
		// �ܺ� Ŭ������ �����ϱ�
		System.out.println(test.su1);
		System.out.println(test.su2);
		System.out.println(test.su3);
		System.out.println(test.su4);
//		System.out.println(test.su5);	// private�̹Ƿ� ���� �Ұ�
		test.prn();
		System.out.println(":::::::::::::::::::::::::");
		
		// ���� Ŭ������ �����ϱ�
		System.out.println(test2.s1);
		System.out.println(test2.s2);
		System.out.println(test2.s4);
//		System.out.println(test2.s5);	// private�̹Ƿ� ���� �Ұ�
		
		test2.in_prn();	// ���� Ŭ������ �޼ҵ带 �̿��ϸ� �ٸ� Ŭ���������� private ����� ������ �� �ִ�.
		
		
	}

}
