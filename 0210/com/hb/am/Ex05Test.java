package com.hb.am;

public class Ex05Test {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		String name = test.getName();
		int age = test.getAge();
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		
		Ex05 test2 = new Ex05("�±Ǻ���");
		name = test2.getName();
		age = test2.getAge();
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
