package com.hb.fm;

// �߻� Ŭ���� : �߻� �޼ҵ带 �ϳ� �̻� ������ �ִ� Ŭ������ ���Ѵ�.
// 			 �Ϲ� Ŭ������ ������ ��� ����� ���� �� �ִ�.
// �߻� �޼ҵ� : body�� ���� �޼ҵ�. �� ��üȭ���� ���� �޼ҵ带 ���Ѵ�.
// �߻� Ŭ������ �߻� �޼ҵ�� �ݵ�� abstract ���� ����ؾ� �Ѵ�.

// �߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �Ʒ� �� ��찡 �ִ�.
// 1. �Ϲ� Ŭ������ ��� : �θ� ������ �߻� �޼ҵ带 �������̵��ؼ� �ݵ�� ��üȭ�ؾ� �Ѵ�.
// 2. �߻� Ŭ������ ��� : �������̵��� ���� ���� ��쿣 �߻� Ŭ������ �ȴ�. 

// �߻� Ŭ�������� �ݵ�� abstract ���� ����ؾ� �Ѵ�.
public abstract class Ex01 {
	int su1 = 0;
	static int su2 = 20;
	final int su3 = 30;
	final static int su4 = 40;
	
	public void prn(){
		su1++;
		su2++;
//		su3++;
//		su4++;
	}
	
	public static void prn2(){
		System.out.println(su2);
		System.out.println(su4);
	}
	
	// �߻� �޼ҵ�. �ݵ�� abstract ���� �ٿ� ��� �Ѵ�.
	public abstract void prn3();
}
