package com.hb.cm;

// �������̽��� ��ӹ޾� ����
// �Ϲ�, �߻� Ŭ������ �������̽��� ��ӹ��� ���� implements ���� ����Ѵ�.

// �Ϲ� Ŭ������ ��� �������̵��� �ؾ� �Ѵ�.
class Ex02 implements Ex01 {

	@Override
	public void sub() {
		
	}

	@Override
	public void mul() {
		
	}
	
}

// �߻� Ŭ������ ��� : Ŭ���� �տ� abstract
abstract class Ex03 implements Ex01 {
	public abstract void div();
}

// �������̽��� �������̽��� ��ӹ��� ���� extends ���� ����Ѵ�.
interface Ex04 extends Ex01 {
	public void add();
}

// ���� Ŭ������ �� 3���� �޼ҵ带 �������̵� �ؾ� �Ѵ�. (Ex04�� ��üȭ���� ���� �ͱ��� ��� ��üȭ�ؾ� �Ѵ�)
class Ex05 implements Ex04{

	@Override
	public void sub() {
		
	}

	@Override
	public void mul() {
		
	}

	@Override
	public void add() {
		
	}
	
}