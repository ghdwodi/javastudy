package com.hb.am;
class Ex03_test 
{
	public static void main(String[] args) 
	{
		// 객체 생성
		Ex03 test = new Ex03("임꺽정");		// 생성자 Ex03(String n) 호출

		// 멤버변수값 확인
		String name = test.getName();
		int age = test.getAge();
		String addr = test.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test2 = new Ex03(5,"둘리");	// 생성자 Ex03(int k, String n) 호출

		name = test2.getName();
		age = test2.getAge();
		addr = test2.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test3 = new Ex03("장길산",6);	// 생성자 Ex03(String n, int k) 호출

		name = test3.getName();
		age = test3.getAge();
		addr = test3.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test4 = new Ex03("태권브이",6,"경기도");	// 생성자 Ex03(String n,int k, String a) 호출
		name = test4.getName();
		age = test4.getAge();
		addr = test4.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

	}
}
