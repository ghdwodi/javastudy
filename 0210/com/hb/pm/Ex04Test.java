package com.hb.pm;

public class Ex04Test {
	public static void main(String[] args) {
		Ex04 t1 = new Ex04();
		System.out.println(t1.a);	// Ex04 Ŭ������ ������� a(=0)�� 1�� ���Ѵ�.
		System.out.println(t1.b);	// Ex04 Ŭ������ static int b�� 1�� ���Ѵ�.
		
		Ex04 t2 = new Ex04();
		System.out.println(t2.a);	// Ex04 Ŭ������ �� ��ü�� �ҷ��� a(=0)�� 1�� ���Ѵ�.
		System.out.println(t2.b);	// static int b�� �ּҿ��� �̹� 1�� ������ �����Ƿ� �� 1�� ���ϸ� 2�� �ȴ�.
		
		Ex04 t3 = new Ex04();
		System.out.println(t3.a);	// Ex04 Ŭ������ �� ��ü�� �ҷ��� a(=0)�� 1�� ���Ѵ�.
		System.out.println(t3.b);	// static int b�� �ּҿ��� �̹� 1�� ������ �����Ƿ� �� 1�� ���ϸ� 3�� �ȴ�.
	}
}
