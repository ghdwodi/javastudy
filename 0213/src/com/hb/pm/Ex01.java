package com.hb.pm;

// �θ� Ŭ���� �����
public class Ex01 {
	// ��� : Ŭ������ Ŭ���� ���� ����(is a ����)
	// 		�ڽ� Ŭ������ �θ� Ŭ������ ������� �ƹ��� ���� ���� ���
	// 		�� �ڽ� Ŭ������ �ɷ� Ȯ��(����� extends ���)�� ���Ѵ�.
	
	String name = "ȫ�浿";
	int age = 12;
	private String addr = "����";
	static int su = 5;
	private static int su2 = 100;
	
	public Ex01(String name){
		System.out.println("�θ� Ŭ���� ������ : "+this); // Ŭ���� ������ �ڱ� �ڽ�(���� �ּҰ�)�� ��Ī
		this.name = name;
	}
	public void prn(){
		System.out.println("�θ� Ŭ���� �޼ҵ� : ");
	}
	public void prn2(){
		System.out.println("�θ� Ŭ���� static �޼ҵ�");
	}
}