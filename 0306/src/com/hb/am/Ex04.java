package com.hb.am;

// ����ȭ �� ������ ���߰� �ϴ� �޼ҵ� : wait()
// wait()�� ������� notify()�� ������� ������ �� �̻� �������� �ʴ´�.
// wait�� notify�� ����ȭ �߿��� ����� �� �ִ�.
public class Ex04 implements Runnable {
	int x;
	@Override
	public synchronized void run() {
		for (int i = 0; i < 100; i++) {
			++x;
			System.out.println(Thread.currentThread().getName()+" : "+x+", i : "+i);
			if (x==50 || x==100){
				try {
					wait();	// ���� ������� ��� ���¿� ����.
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			} else {
				notify();	// ��� ���¿� �ִ� �����尡 �ٽ� �غ� ���·� ����.
			}
		}
	}
}
