package com.hb.pm;

// �ڽ� Ŭ����
public class Ex02 extends Ex01 { // �θ� Ŭ���� Ex01�� ����
	String name = "����ġ";
	public Ex02(){
		// ��� ���谡 �Ǵ� ���� �ڽ� Ŭ������ ������ ù �ٿ��� �θ� Ŭ������ �����ڰ� ���� �ִ�.
		// �θ� Ŭ������ ������ : super();
		// �θ� Ŭ������ �⺻ �����ڰ� ���� ��� ���� �������� �Ѵ�.
		// ��� ���� ���Ǹ� ���� �⺻ �����ڸ� ����� �ֶ�� ������ �̰��̴�.
		super("�Ѹ�");
		System.out.println("�ڽ� Ŭ���� �⺻ ������ : "+this);
	}
	
	public void namePrn(){
		String name = "�±Ǻ���";
		System.out.println("�̸� : "+super.name);	// �ڽ� Ŭ�������� name ������ ������ �θ� Ŭ������ ������ �´�.
	}
	public void addrPrn(){
		System.out.println("���� : "+age);
//		System.out.println("�ּ� : "+addr); // ��� ����� �ص� private�� ������ �� ����.
	}
}
