package com.hb.am;

public class Ex02 extends Thread {
	public void prn(){
		while(true) {
			System.out.println("°¡ : "+Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("°¡1 : "+Thread.currentThread().getName());
		}
	}
}
