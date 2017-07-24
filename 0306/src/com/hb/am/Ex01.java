package com.hb.am;

public class Ex01 extends Thread {
	@Override
	public void run() {
		System.out.println("Run : "+Thread.currentThread().getName());
		first();
	}
	
	/*public void start() {
		System.out.println("Start : "+Thread.currentThread().getName());
		first();
	}*/
	
	public void first(){
		System.out.println("First : "+Thread.currentThread().getName());
		second();
	}
	public void second(){
		System.out.println("Second : "+Thread.currentThread().getName());
	}
}
