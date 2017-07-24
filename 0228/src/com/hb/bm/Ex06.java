package com.hb.bm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// List �������̽� ���� : ArrayList, Vector <- �迭ó�� ó��
// ArrayList => ����ȭ ������ ���� ����. 1:n �ǽð� ó�� �Ұ���
// Vector => ����ȭ ����. 1:n �ǽð� ó�� ����
public class Ex06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		
		list.add("�±Ǻ���");
		list.add("����κ�");
		list.add("����");
		list.add("����");
		list.add(1,"��ڻ�");
		
		System.out.println(list);
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		
		vector.add("�Ѹ�");
		vector.add("�����");
		vector.add("��ġ");
		vector.add("������");
		vector.add(2,"�öѱ����");
		
		System.out.println(vector);
		
		// ũ��
		System.out.println("����Ʈ ũ�� : "+list.size());
		System.out.println("���� ũ�� : "+vector.size());
		
		// �뷮
		System.out.println("���� �뷮 : "+vector.capacity());
		
		// ��������
		if(list.contains("����")){
			System.out.println(list.indexOf("����"));
		} else {
			System.out.println("�׷� �� ����");
		}
		
		// get : �ش� ��ü ���
		String msg = list.get(3);
		System.out.println(msg);
		
		// ���
		for (String k : list) {
			System.out.print(k+"\t");
		}
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::");
		
		Iterator<String> vec_it = vector.iterator();
		while (vec_it.hasNext()) {
			String m = (String) vec_it.next();
			System.out.print(m+"\t");
		}
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::");
		
		for (int i = 0; i < list.size(); i++) {
			String msg2 = list.get(i);
			System.out.println(msg2);
		}
	}
}