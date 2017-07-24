package com.hb.bm;

public class Ex02 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while(true){
			i++;
			System.out.println("가가가가가가가가가 : "+Thread.currentThread().getName()+" : "+i);
			if (i==20) break;
		}
	}
}
