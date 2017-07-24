package com.hb.am;

public class Ex01 extends Thread {
	public void prn(){
		while(true) {
			System.out.println("a : "+Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("a1 : "+Thread.currentThread().getName());
		}
	}
}
