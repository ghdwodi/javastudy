package com.hb.am;

public class Ex02 {
	public static void main(String[] args) {
		// StringBuffer() => �⺻ ���̿� �뷮�� ���� String�� ����
		StringBuffer sb = new StringBuffer();
		System.out.println("���� : "+sb.length());
		System.out.println("�뷮 : "+sb.capacity());
		System.out.println("���� : "+sb);
				
		// append �޼ҵ� => ���� �߰��ϱ�
		sb.append(true);
		System.out.println("���� : "+sb.length());
		System.out.println("�뷮 : "+sb.capacity());
		System.out.println("���� : "+sb);
		sb.append("korea");
		System.out.println("���� : "+sb.length());
		System.out.println("�뷮 : "+sb.capacity());
		System.out.println("���� : "+sb);
		sb.append(1234567);
		System.out.println("���� : "+sb.length());
		System.out.println("�뷮 : "+sb.capacity());
		System.out.println("���� : "+sb);
		sb.append('a');	// �뷮�� �ʰ��ϴ� ���� �ڵ����� �뷮�� �þ��.
		System.out.println("���� : "+sb.length());
		System.out.println("�뷮 : "+sb.capacity());
		System.out.println("���� : "+sb);
		
		// insert �޼ҵ� => ���� �����ϱ�
		// insert (int offset(������ �ڸ���), ������ ����);
		sb.insert(4,"��");
		System.out.println(sb);
	}
}
