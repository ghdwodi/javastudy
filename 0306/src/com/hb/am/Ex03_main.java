package com.hb.am;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		new Thread(test, "¾î¸Ó´Ï").start();
		new Thread(test, "¾Æµé").start();
		new Thread(test, "¹ÙµÏÀÌ").start();
		new Thread(test, "¾ß¿ËÀÌ").start();
		new Thread(test, "È£·©ÀÌ").start();
	}
}
