package com.hb.am;

// �Ӱ迵�� : ��Ƽ�����忡�� �������� ���Ǵ� ����
// ���� ���� ���� �����尡 ���İ��� �ٸ� �����忡�� ������� ���ѱ��.
// �̷��� ��� �ǽð� ó������ ������ �߻��� �� �ִ�.
// ����ȭ ó���� ���� �̸� �ذ��� �� �ִ�.
// synchronized ���� ����Ͽ� ����ȭ�� ����� �ϳ��� �����常 ������ �� �ִ�.
// �ش� �����尡 �Ӱ迵������ �۾��� ���� ������ �ٸ� ������� ������ ����ϰ� �ȴ�.

public class Ex02 implements Runnable {
	int x;
	@Override
	// �Ӱ� ����
	public synchronized void run() { // synchronized ������ �޼ҵ带 ����ȭ�Ѵ�.
		// TODO Auto-generated method stub
		for (int i=0; i<100; i++) {
			System.out.println(Thread.currentThread().getName()+" : "+x);
			++x;
			// ����ȭ���� ������ ���� �����尡 ���ôٹ������� �����Ƿ� x���� �ϰ������� ��������.
		}
	}
	
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		
		new Thread(test, "Dog").start();
		new Thread(test, "Cat").start();
		new Thread(test, "Tiger").start();
		new Thread(test, "Racoon").start();
		new Thread(test, "Penguin").start();
		new Thread(test, "Lion").start();
	}
}
