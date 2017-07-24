package com.hb.bm;

import java.util.Iterator;
import java.util.LinkedList;

// ť(Queue) : FIFO(First In First Out, ���Լ���)

// Queue �������̽��� ������ Ŭ���� : LinkedList

public class Ex07 {
	public static void main(String[] args) {
		LinkedList<String> link = new LinkedList<>();
		// add, addFirst, addLast, offer
		link.add("�ѱ�");
		link.add("�߱�");
		link.offer("�±�");
		link.addFirst("����");
		link.add(2,"�̱�");
		System.out.println(link);
		
		System.out.println("ũ�� : "+link.size());
		if (link.contains("�ѱ�")){
			int a = link.indexOf("�ѱ�");
			System.out.println(link.get(a));
		} else {
			System.out.println("�׷� �� ����.");
		}
		System.out.println(link.getFirst());
		System.out.println(link.getLast());
		
		for (String k : link) {
			System.out.print(k+"\t");
		}
		System.out.println();
		System.out.println("::::::::::::::::::::::::::::::::::::::::::");
		Iterator<String> it = link.iterator();
		while (it.hasNext()) {
			String m = (String) it.next();
			System.out.print(m+"\t");
		}
	}
}
