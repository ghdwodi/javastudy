package com.hb.am;
class Ex03 
{
	private String name = "������";	// �����ڿ� �ִ� �ʱⰪ�� ������ �켱�ȴ�.
	private int age = 15;			// �׷��Ƿ� ���⿡�� �� �������� getter���� �ݿ����� �ʴ´�.
	private String addr = "����";

	// ������ : ��������� �ʱ�ȭ�ϴ� ����
	// 1. return type ����
	// 2. Ŭ���� �̸��� ����
	// 3. �����ε� ����
	// 4. �����ڴ� �ٸ� �����ڸ� ȣ���� �� �ִ�.

	public Ex03(String n){
//		name = "ȫ�浿";
//		age = 12;
//		addr = "��û��";
		name = n;
	}

	public Ex03(String n, int k){
		name = n;
		age = k;
	}

	public Ex03(int k, String n){
		name = n;
		age = k;
	}

	public Ex03(String n,int k, String a){
		name = n;
		age = k;
		addr = a;
	}


	// getter

	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public String getAddr(){
		return addr;
	}


}
