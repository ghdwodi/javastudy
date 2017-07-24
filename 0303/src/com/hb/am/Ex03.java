package com.hb.am;

public class Ex03 extends Thread {
	public void prn(){
		while(true) {
			System.out.println("숫자 : "+Thread.currentThread().getName());
		}
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			System.out.println("숫자1 : "+Thread.currentThread().getName());
		}
	}
}
