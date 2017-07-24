package com.hb.bm;

public class Ex03 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while(true){
			i++;
			System.out.println("111111111 : "+Thread.currentThread().getName()+" : "+i);
			if (i==20) break;
		}
	}
}
