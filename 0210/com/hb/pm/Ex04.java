package com.hb.pm;

public class Ex04 {
	// static : ��ü ������ �����ϰ� ���� �����ȴ�. ������ ���� �����ϴ�.(����)
	// 			������ static �޸𸮿� ���������.
	//			���������� Ŭ�������� ������ �� ����.(�� ����Ŭ���������� ���������� ����)
	//			static �޼ҵ�� �Ϲ� ������ ������ �� ����.(�Ϲ� ������ ��ü ���� �� ��������Ƿ� ���� ���迡 ���)

	int a = 0;
	static int b = 0;
	public Ex04(){
		a++;
		b++;
	}

	public void sum(int k1, int k2){
		System.out.println("��� : "+(k1+k2));
		double PI = 3.14;
//		double static PI2 = 3.14;	// ���������� static���� ������ �� ����. ���� �߻�.
	}
	
	public static void sub(int k){
//		int res = k - a;			// static �޼ҵ�� �Ϲ� ���� a(�������)�� ������ �� ����.
		int res2 = k - b;
	}
}
