package com.hb.bm;

public class Ex01 implements Runnable {
	@Override
	public void run() {
		int i = 0;
		while(true){
			i++;
			System.out.println("aaaaaaaaa : "+Thread.currentThread().getName()+" : "+i);
			if (i==20) break;
		}
	}
}
