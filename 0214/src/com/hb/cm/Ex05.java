package com.hb.cm;

public class Ex05 extends Ex04{
	String name = "ȫ�Ѹ�";
	
	// �������̵� : �θ� Ŭ������ �޼ҵ带 ������ �ͼ�
	//			�ڱ� ������� �����ϴ� ��
	// �������̵��� �ݴ� : final method(�������̵� �Ұ����� �޼ҵ�)
	//				 �θ� Ŭ������ �޼ҵ带 ������ �ͼ� ��븸 �� �� �ִ�.
	//				 �׷��� �� ������ ������ ���� ����.

	public void add(){
		age = age + 10;
		System.out.println(age);
	}
	
	@Override
	// @Override : �ּ� ó���� ���ÿ� �θ��� �޼ҵ带 ����ȭ�Ѵ�.
	// @ <= ����� ���� �ּ�
	public void sub() {
		age = age - 15;
		System.out.println(age);
	}
}