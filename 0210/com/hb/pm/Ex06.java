package com.hb.pm;

public class Ex06 {
	// static �ʱ�ȭ : Ŭ���� �ȿ����� �ʱ�ȭ��ų �� �����Ƿ� ���� ������ �Ѵ�.
	// ����) static {�ʱ�ȭ}
	
	int a = 10;
	static int b = 20;		// ���� �ٿ��� �ʱⰪ�� �����ϸ鼭 �ǹ̰� �������� ��
	static {
		b = 100;
		c = 1000;			// �ʱⰪ ����
	}
	static int c = 2000;	// �ʱⰪ�� ������ �� �ٽ� ���� �������Ƿ� 2000�� ��µȴ�.
	
	public void add(){
		System.out.println(a);
	}
	public static void main(String[] args) {
		int k1 = 10;
		// main �޼ҵ�� static�̹Ƿ� Ex06Ŭ������ �������(instance) int a�� ����� �� ����.
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(k1);
	}
}
