package com.hb.am;

public class Ex05 {
	private String name = "�Ѹ�";
	private int age = 10;
	// this() : �����ڿ��� �ٸ� �����ڸ� ȣ���� �� ���
	//			������ �ȿ��� ���� ù�ٿ����� ��� ����
	public Ex05() {
//		Ex05("����); // ���� �߻�
		this("����");
//		this("�Ѹ�2", 5);
//		System.out.println(this);
	}
	public Ex05(String name) {
		this("�Ѹ�2",15);
		this.name = name;
	}
	public Ex05(String name, int age) {
		this.name = name;
		this.age = age;
	}
	// getter
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
}
