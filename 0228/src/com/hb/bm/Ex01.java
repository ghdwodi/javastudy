package com.hb.bm;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// ���׸�(Generics) : �÷����� � ��ü��� �̷�������� ǥ���ϴ� ��ü Ÿ��
// ���� : <��ü �ڷ���>
// API�� ǥ���
// <T> : ��ü Ÿ��
// <E> : �÷��� �ȿ� �����ϴ� ��ü �ϳ�(Element)
// <K>,<V> : Map������ key�� value�� ����. key�� value�� 1:1 ������ �̷��, key�� ȣ���ϸ� value�� ���´�.

// �÷���(Collection) : ��ü�� ������ �����ϴ� �������̽���
// Collection<E> <= �÷��� �� �ֻ��� Ŭ����
// �⺻������ �˾ƾ� �� �÷��� : Set<E>, List<E>, Queue<E>, Map<K,V>

// <�÷��� �������̽��� �ֿ� �޼ҵ�>
// add(E e) : �ش� ��ü�� �߰��ϰ� �߰� ���� ���ο� ���� boolean���� ��ȯ�Ѵ�.
// addAll(Collection<? extends E> c) : Ư�� �÷��ǿ� �ִ� ��� ��Ҹ� �ٸ� �÷��ǿ� �߰��Ѵ�.
//									    ���� ���ο� ���� boolean���� ��ȯ�Ѵ�.
// clear() : �÷����� ��� ��Ҹ� �����Ѵ�.
// contains(Object o) : �ش� ��ü�� �÷��� ���� �����ϴ��� �˻��Ͽ� boolean���� ��ȯ�Ѵ�.
// isEmpty() : �ش� �÷����� ����ִ��� �˻��Ͽ� boolean���� ��ȯ�Ѵ�.
// remove(Object o) : �ش� ��ü�� �÷��� ������ �����Ѵ�.
// size() : �÷��� ���� �����ϴ� ��ü�� ���� int�� ��ȯ�Ѵ�.
// toArray() : �ش� �÷����� �迭�� �����.
// iterator() : �ش� �÷��� �ȿ� �����ϴ� ��ü�� ���ʴ�� �����ϱ� ���� Iterator ��ü�� ��ȯ�Ѵ�.

public class Ex01 {
	public static void main(String[] args) {
		// set �������̽��� ������ Ŭ���� : HashSet, TreeSet
		// set�� Ư¡ : �ߺ� ����, Ư�� �������� ������ �� ����
		//			 TreeSet�� �������� �����̴�.
		
		Set<String> test1 = new HashSet<>();
		Set<Integer> test2 = new TreeSet<>();
		
		// ��ü ����
		String name = "����";
		// ������ ��ü �߰�
		test1.add(name);
				
		// ��ü ����
		Integer k1 = new Integer(100);
		// ������ ��ü �߰�
		test2.add(k1);
		
		test1.add("�Ѹ�");	// ����ڽ� : �⺻ �ڷ����� ��ü�� ����� ��
		test1.add("������");
		test2.add(12);		// ����ڽ̿� ���� �ڵ����� ��ü�� ������� �÷��ǿ� ����.
		test2.add(14);

//		test2.addAll(true);	// ���׸� Ÿ���� Integer�̹Ƿ� ���� �߻�
//		test2.addAll('A');
//		test2.addAll(3.14);
//		test2.addAll("10");

		// ��ü ���� ����

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1.size());
		System.out.println(test2.size());
		
		// �ϳ��� ����
		// 1. �迭�� ����� for�� ���
		for (String s : test1) {
			System.out.println(s);
		}
		for (Integer i : test2) {
			System.out.println(i);
		}
		
		
		// 2. Iterator ���
		Iterator<String> test1_it = test1.iterator();
		Iterator<Integer> test2_it = test2.iterator();
		System.out.println(":::::::::::::::::::::::::::::");
		while(test2_it.hasNext()){
			int k = test2_it.next();
			System.out.println(k+10);
		}
	}
}