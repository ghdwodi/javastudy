package com.hb.am;

// 4. Anonymous : �͸� ���� Ŭ����. �� �� ���� �������� Ŭ������ ���� �� ȣ���� �� ����.
//				  ��κ� �������̽��� �߻� �޼ҵ忡�� Ȱ���Ѵ�.

// �Ϲ����� �������̽�
interface TestInner{
	int DATA = 100;
	public void prnData();
}

public class Ex05 implements TestInner{

	@Override
	public void prnData() {
		System.out.println("�������̽� ����1");
		System.out.println(TestInner.DATA);
	}
}

// �͸� ���� Ŭ������ ����ϴ� ���
class Ex05_1{
	// �޼ҵ� �ȿ� �������̽��� ��ӹ��� Ŭ���� ����
	public void prn(){
		new TestInner() {
			@Override
			public void prnData() {
				// TODO Auto-generated method stub
				System.out.println("�������̽� ����2");
				System.out.println(TestInner.DATA);
			}
		};
	}
	
	// �������̽��� ���ڷ� ������ �ִ� �޼ҵ� ����
	public void prn2(TestInner ti){
		
	}
}