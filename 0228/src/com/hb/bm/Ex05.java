package com.hb.bm;

import java.util.Iterator;
import java.util.List;
import java.util.Stack;

// List 인터페이스 : 배열과 흡사한 구조이며, 길이는 자유롭고 미리 지정하지 않아도 된다.
// 관련 클래스 : Vector, ArrayList, Stack
public class Ex05 {
	// Stack 클래스 : LIFO(Last In First Out, 후입선출) -> 마지막에 들어온 자료가 먼저 나간다.
	// add, push -> 추가
	// pop -> 맨 위에 존재하는 객체를 반환하고 삭제까지 실행
	// peek -> 맨 위에 존재하는 객체 반환, 삭제는 실행하지 않음
	// search -> 검색(오른쪽부터 찾는다. 1부터 시작한다. 스택 방식)
	// indexOf -> 위치 반환(왼쪽부터 찾는다. 배열처럼 0부터 시작한다.)
	
	public static void main(String[] args) {
		Stack<String> list = new Stack<>();
		list.add("손흥민");
		list.add("기성용");		
		list.add("이청용");
		list.add(2, "차두리");
		list.push("박지성");
				
		System.out.println(list);
		
		if (list.contains("박지성")) {
			// 찾기
			int res = list.indexOf("박지성");
			System.out.println(res+"번째");	// 배열 방식
			res = list.search("박지성");
			System.out.println(res+"번째");	// 스택 방식
		} else {
			System.out.println("그런 거 없다.");
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
