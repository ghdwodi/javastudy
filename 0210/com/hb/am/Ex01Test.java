package com.hb.am;
class Ex01Test
{
	public static void main(String[] args) 
	{
		Ex01 animal = new Ex01();

		// �̸�, ����, ���翩�� ���

		String name = animal.getName();
		int age = animal.getAge();
		boolean live = animal.getLive();

		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age+"��");
		System.out.println("���� : "+live);

		// �̸� -> ���, ���� -> 2�� �� ����

		animal.setName("���");
		animal.setAge(2);
		String n_Name = animal.getName();
		int n_Age = animal.getAge();
		System.out.println("���� ����:::::::::::::::::::::::::::::::::");
		System.out.println("�̸� : "+n_Name);
		System.out.println("���� : "+n_Age+"��");
	}
}
