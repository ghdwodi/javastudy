package com.hb.am;

public class Ex03_main {
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		new Thread(test, "��Ӵ�").start();
		new Thread(test, "�Ƶ�").start();
		new Thread(test, "�ٵ���").start();
		new Thread(test, "�߿���").start();
		new Thread(test, "ȣ����").start();
	}
}
