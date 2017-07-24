package com.hb.am;

public class Ex05Test {
	public static void main(String[] args) {
		Ex05 test = new Ex05();
		String name = test.getName();
		int age = test.getAge();
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		
		Ex05 test2 = new Ex05("태권브이");
		name = test2.getName();
		age = test2.getAge();
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
}
