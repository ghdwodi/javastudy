package com.hb.bm;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// List �������̽� : �迭�� ����� �����̸�, ���̴� �����Ӱ� �̸� �������� �ʾƵ� �ȴ�.
// ���� Ŭ���� : Vector, ArrayList, Stack
public class Ex05 {
	// Stack Ŭ���� : LIFO(Last In First Out, ���Լ���) -> �������� ���� �ڷᰡ ���� ������.
	// add, push -> �߰�
	// pop -> �� ���� �����ϴ� ��ü�� ��ȯ�ϰ� �������� ����
	// peek -> �� ���� �����ϴ� ��ü ��ȯ, ������ �������� ����
	// search -> �˻�(�����ʺ��� ã�´�. 1���� �����Ѵ�. ���� ���)
	// indexOf -> ��ġ ��ȯ(���ʺ��� ã�´�. �迭ó�� 0���� �����Ѵ�.)
	
	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		list.add("�����");
		list.add("�⼺��");		
		list.add("��û��");
		list.add(2, "���θ�");
		list.push("������");
				
		System.out.println(list);
		
		if (list.contains("������")) {
			// ã��
			int res = list.indexOf("������");
			System.out.println(res+"��°");	// �迭 ���
			res = list.search("������");
			System.out.println(res+"��°");	// ���� ���
		} else {
			System.out.println("�׷� �� ����.");
		}
		
		for (String k : list) {
			System.out.print(k+"\t");
		}
		
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::");
		
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String m = (String) it.next();
			System.out.print(m+"\t");
		}
		System.out.println("\n::::::::::::::::::::::::::::::::::::::::");
		while(!list.isEmpty()){
			String msg = list.pop();
			System.out.print(msg+"\t");
		}
		System.out.println("\n"+list);
	}
}
