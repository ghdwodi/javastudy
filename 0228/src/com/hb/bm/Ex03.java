package com.hb.bm;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex03 {
	public static void main(String[] args) {
		String[] str = {"java","jsp","spring","android"};
		
		// �迭�� ������ Set�� �־� ����.
		
		Set<String> test = new HashSet<>();
		for (String k : str) {
			test.add(k);
		}
		
		Set<String> test2 = new HashSet<>();
		test2.add("html");
		test2.add("css");
		test2.add("jsp");
		test2.add("jquery");
		test2.add("ajax");
		test2.add("spring");
		System.out.println(test);
		System.out.println(test2);
		System.out.println("::::::::::::::::::::::::::::::");
		Set<String> test3 = new HashSet<>();
		for(int i=0; i<str.length;i++){
			if (!test2.add(str[i])){
				test3.add(str[i]);
			}
		}
		System.out.println("��� : "+test2);
		System.out.println("�ߺ� : "+test3);
		System.out.println("::::::::::::::::::::::::::::::");
		Iterator<String> test_it = test.iterator();
		System.out.println(test_it.next());
		
	}
}