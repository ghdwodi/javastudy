package com.hb.pm;

public class Ex02Main {
	public static void main(String[] args) {
		
		System.out.println(Ex01.su);
//		System.out.println(Ex10.su2);	// static�̶� private�� ���� �Ұ���.
		
		// �ڽ� Ŭ���� ��ü ����
		Ex02 test = new Ex02();
		// �θ� Ŭ������ ���� ���������, �� �� �ڽ� Ŭ������ ���������. �� Ŭ������ �ּҴ� ���ٴ� ���� �� �� �ִ�.
		// �ڽ� Ŭ������ ��ü�� ����� �θ� Ŭ���� ��ü�� ���� ���������.
		
		test.namePrn();
		// �켱���� : �ڽ� Ŭ������ �������� > �ڽ� Ŭ������ �������� > �θ� Ŭ������ ����
	}
}
