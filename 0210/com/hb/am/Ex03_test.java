package com.hb.am;
class Ex03_test 
{
	public static void main(String[] args) 
	{
		// ��ü ����
		Ex03 test = new Ex03("�Ӳ���");		// ������ Ex03(String n) ȣ��

		// ��������� Ȯ��
		String name = test.getName();
		int age = test.getAge();
		String addr = test.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test2 = new Ex03(5,"�Ѹ�");	// ������ Ex03(int k, String n) ȣ��

		name = test2.getName();
		age = test2.getAge();
		addr = test2.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test3 = new Ex03("����",6);	// ������ Ex03(String n, int k) ȣ��

		name = test3.getName();
		age = test3.getAge();
		addr = test3.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

		Ex03 test4 = new Ex03("�±Ǻ���",6,"��⵵");	// ������ Ex03(String n,int k, String a) ȣ��
		name = test4.getName();
		age = test4.getAge();
		addr = test4.getAddr();

		System.out.println(name);
		System.out.println(age);
		System.out.println(addr);
		System.out.println(":::::::::::::::::::::");

	}
}
