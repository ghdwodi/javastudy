package com.hb.am;

// ���� Ŭ���� : Ŭ���� �ȿ� �����ϴ� Ŭ������ ���Ѵ�.
// 			 �ܺ� Ŭ������ ������ �� ���� Ŭ������ ������ �� �ִ�.(�� static�� ����)
//			 �ܺ� Ŭ������ ������� ������� ��� �����ϴ�. ��� ���迡���� ��� �Ұ����� private ����� ����� �� �ִ�.
//			 �������� �� $�� �ٴ´�.

// ���� Ŭ������ ���� : Member, Local, static, Anonymous
// 1. Member : �ܺ� Ŭ����{..���� Ŭ����..}

public class Ex02 {
	int su1 = 10;
	final int su2 = 20;
	static int su3 = 30;
	static final int su4 = 40;
	private int su5 = 50;
	
	// ������
	public Ex02(){
		System.out.println("����� �ܺ� Ŭ���� : "+this);
	}
	
	// �Ϲ� �޼ҵ�
	public void prn(){
		int num1 = 100;
		final int num2 = 20;
//		static int num3 = 30;		// static�� ���������� ����� �� ����.
//		static final int num4 = 40;
//		private int num5 = 50;		// private�� �ܺ� �޼ҵ��� ���� ������ �� �� ����.
		System.out.println("����� �ܺ� �޼ҵ�");
	}
	

	class Ex02_1{
		int s1 = 10;
		final int s2 = 20;
//		static int s3 = 30;
		// ���� Ŭ������ static�� ����� �� ����.
		// ����Ϸ��� ���� Ŭ������ static�̾�� �Ѵ�.
		static final int s4 = 40;
		// static final�� ����� �� �ִ�. ����̹Ƿ� static�� �ٸ� �޸𸮸� ����ϱ� �����̴�.
		private int s5 = 50;
		
		// ���� Ŭ���� ������
		Ex02_1(){
			System.out.println("���� Ŭ���� ������ : "+this);
		}
		
		// ���� Ŭ���� �޼ҵ�
		public void in_prn(){
			int su11 = 10;
			final int su12 = 20;
//			static int su13 = 30;
//			static final int su14 = 40;
//			private int su15 = 50;		// static, private ��� �Ұ�. �Ϲ� �޼ҵ�� ����.
			
			// ���� Ŭ������ �ܺ� Ŭ������ ����� ���� ����� �� �ִ�.
			// �ܺ� Ŭ������ �޼ҵ嵵 ����� �� �ִ�.
			System.out.println("���� Ŭ���� �޼ҵ�");
			System.out.println(su1);
			System.out.println(su2);
			System.out.println(su3);
			System.out.println(su4);
			// su5�� private�ӿ��� �ұ��ϰ� ����� �� �ִ�. ���� Ŭ������ Ư¡.
			System.out.println(su5);
			System.out.println("::::::::::::::::::::::::::::");
			prn();
			
		}
	}	
}
