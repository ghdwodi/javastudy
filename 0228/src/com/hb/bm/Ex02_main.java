package com.hb.bm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02 t1 = new Ex02("����",17,"����");
		Ex02 t2 = new Ex02("�Ѹ�",1017,"����");
		Ex02 t3 = new Ex02("������",28,"����");
		Ex02 t4 = new Ex02("��ġ",15,"������ī");
		Ex02 t5 = new Ex02("�����",200,"����");
		
		// �迭 : ũ�� ���� �Ұ�
		Ex02[] arr = new Ex02[5];
		arr[0] = t1;
		arr[1] = t2;
		arr[2] = t3;
		arr[3] = t4;
		arr[4] = t5;

		for (Ex02 k : arr) {
			System.out.print(k.getName()+"\t");
			System.out.print(k.getAge()+"\n");
		}
		System.out.println("�� : "+arr.length);
		System.out.println("::::::::::::::::::::::::::::::::::::::::::::");
		
		// �÷��� : ũ�� ���� ����, �߰�/������ �����Ӵ�
		Set<Ex02> test = new HashSet<>();
		test.add(t1);
		test.add(t2);
		test.add(t3);
		test.add(t4);
		test.add(t5);
		test.add(new Ex02("������",1024,"�ϱ�"));
		test.add(new Ex02("�ٿ�ŷ",2047,"������"));
		
		System.out.println(test);
		/*for (Ex02 ex02 : test) {
			System.out.print(ex02.getName()+"\t");
			System.out.print(ex02.getAge()+"\n");
		}*/
		Iterator<Ex02> test_it = test.iterator();
		while (test_it.hasNext()) {
			Ex02 k = (Ex02) test_it.next();
			System.out.print(k.getName()+"\t");
			System.out.print(k.getAge()+"\n");
		}
		System.out.println("�� : "+test.size());
	}
}
