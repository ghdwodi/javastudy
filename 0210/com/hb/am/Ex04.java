package com.hb.am;
class Ex04 
{
	// this : Ŭ���� �ȿ��� ��ü �ڱ��ڽ��� ��Ī�ϴ� �����
	//		  Ŭ������ ��ü�� ���� �� ������ �ּҰ��� �ǹ�
	// ���������� ��������� �̸��� ���� �� ��������� this�� ���δ�.
	// this() : ������ ������ �����ε� �� �ٸ� �����ڸ� ȣ���� �� ����Ѵ�.
	//			�������� ù �࿡ �������� ������ ������ ������ �߻��Ѵ�.

	private String name = "�Ѹ�";
	private int age = 10;


	// �⺻ ������

	public Ex04(){
//		this("�Ѻ�");		// this()�� �̿��� �Ʒ� �����ڸ� ȣ���� ��
		System.out.println("������(�⺻) : "+this);		// �ڱ� �ڽ��� �ּҰ��� ����Ѵ�
	}

	public Ex04(String n){
		this();				// this()�� �̿��� �� �����ڸ� ȣ���� ��
		name = n;
		System.out.println("������(�⺻�ƴ�) : "+this);	// �ڱ� �ڽ��� �ּҰ��� ����Ѵ�
	}

	// getter

	public String getName(){
		return name;
	}

	// this�� �̿��� ��Ȯ�ϰ� ǥ���� setter
	
	public void setName(String name){	// �� ���� name�� ��������
		this.name = name;				// ������� name�� �Է¹��� �� name(��������)�� ����ִ´�.
	}									// this�� �̿��� ��������� �����ؾ� ���� �̸��� �������� name�� ������ �� �ִ�.
}
