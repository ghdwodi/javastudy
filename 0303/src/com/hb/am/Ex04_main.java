package com.hb.am;

public class Ex04_main {
	public static void main(String[] args) {
		// �������� �Ϲ����� ����
		System.out.println("main : "+Thread.currentThread().getName());
		Ex01 test1 = new Ex01();
		Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
		/*test1.prn();
		test2.prn();
		test3.prn();*/
		
		test1.start();	// run �޼ҵ带 ã�� �� ������� �����Ѵ�.
		test2.start();	// �� ������� ���ôٹ������� ����ȴ�.
		test3.start();	// Ŭ������ start��� �̸��� �޼ҵ尡 �ִٸ� �װ��� �켱���� �����Ѵ�.
						// �� ��쿣 ��� main������� ����ǹǷ� ������� �����Ѵ�.
		
		System.out.println("main : "+Thread.currentThread().getName());
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
