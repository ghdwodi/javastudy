package com.hb.bm;

public class Ex04_main {
	public static void main(String[] args) {
		Ex01 test1 = new Ex01();
		Ex02 test2 = new Ex02();
		Ex03 test3 = new Ex03();
		
		// Thread�� ��ӹ��� Ŭ������ �ٷ� start() �޼ҵ带 ����� �� �ִ�.
//		test1.start();	// Ex01 Ŭ������ Runnable �������̽��� ��ӹ޾��� ���̹Ƿ� �Ұ����ϴ�.
		
		// �������̽��� ��ӹ��� Ŭ������ Ÿ������ ������� �Ʒ��� ���� �Ѵ�.
		// start()�� �����ϸ� Ÿ���� test1�� rus()�� ����ȴ�.
		Thread t1 = new Thread(test1);
		t1.start();
		
		// �͸� ������
		new Thread(new Ex02()).start();
		new Thread(new Ex03()).start();
		
		// �͸� ���� Ŭ���� <= �ȵ���̵忡�� ���� ����ϴ� ���
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				int i = 0;
				while(true){
					i++;
					System.out.println("�� �� �� �� �� �� �� �� ��  : "+Thread.currentThread().getName()+" : "+i);
					if (i==20) break;
				}				
			}
		}).start();
		
	}
}
