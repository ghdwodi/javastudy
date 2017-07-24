package com.hb.bm;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

// List 인터페이스 구현 : ArrayList, Vector <- 배열처럼 처리
// ArrayList => 동기화 지원을 하지 않음. 1:n 실시간 처리 불가능
// Vector => 동기화 지원. 1:n 실시간 처리 가능
public class Ex06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();
		
		list.add("태권브이");
		list.add("깡통로봇");
		list.add("훈이");
		list.add("영희");
		list.add(1,"김박사");
		
		System.out.println(list);
		System.out.println("::::::::::::::::::::::::::::::::::::::::");
		
		vector.add("둘리");
		vector.add("도우너");
		vector.add("또치");
		vector.add("마이콜");
		vector.add(2,"꼴뚜기왕자");
		
		System.out.println(vector);
		
		// 크기
		System.out.println("리스트 크기 : "+list.size());
		System.out.println("벡터 크기 : "+vector.size());
		
		// 용량
		System.out.println("벡터 용량 : "+vector.capacity());
		
		// 존재유무
		if(list.contains("훈이")){
			System.out.println(list.indexOf("훈이"));
		} else {
			System.out.println("그런 거 없다");
		}
		
		// get : 해당 객체 얻기
		String msg = list.get(3);
		System.out.println(msg);
		
		// 출력
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