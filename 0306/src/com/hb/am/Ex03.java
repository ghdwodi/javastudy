package com.hb.am;

public class Ex03 implements Runnable {
	private int depositeMondy = 20000;	// ��ġ�� 2��

	public int getDepositeMondy() {
		return depositeMondy;
	}

	public void setDepositeMondy(int depositeMondy) {
		this.depositeMondy = depositeMondy;
	}
	public synchronized void widthDraw(int su){
		if (getDepositeMondy()>=0){
			depositeMondy -= su;
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("�ܾ� : "+getDepositeMondy());
		} else {
			System.out.print(Thread.currentThread().getName()+", ");
			System.out.println("�ܾ� ����");
		}
	}

	@Override
	public void run() {
		for (int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (getDepositeMondy()<=0) break;
			widthDraw(100);
		}
	}
}
