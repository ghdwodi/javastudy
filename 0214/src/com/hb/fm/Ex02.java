package com.hb.fm;

//�߻� Ŭ������ ��ӹ��� �ڽ� Ŭ������ �Ʒ� �� ��찡 �ִ�.
//1. �Ϲ� Ŭ������ ��� : �θ� ������ �߻� �޼ҵ带 �������̵��ؼ� �ݵ�� ��üȭ�ؾ� �Ѵ�.
//2. �߻� Ŭ������ ��� : �������̵��� ���� ���� ��쿣 �߻� Ŭ������ �ȴ�. 

// �Ϲ� Ŭ����
class Ex02 extends Ex01{
	@Override
	public void prn3() {
	}
}

// �߻� Ŭ����
abstract class Ex03 extends Ex01{
}

// �߻� Ŭ������ ��ӹް� �� �߻� �޼ҵ带 ���� ���
abstract class Ex04 extends Ex03{
	public abstract void prn4();
}

class Ex05 extends Ex04{
	@Override
	public void prn4() {
	}

	@Override
	public void prn3() {
	}
}

// �߻� �޼ҵ带 �̿��� �������� ������ �� �ִ�.
// ���� �޼ҵ带 ��ӹ޾Ƶ� ���� ���´� �� Ŭ�������� �ٸ��� �� �� �ִ� ���̴�.