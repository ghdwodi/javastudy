package com.hb.bm;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// 제네릭(Generics) : 컬렉션이 어떤 객체들로 이루어졌는지 표시하는 객체 타입
// 형태 : <객체 자료형>
// API의 표기법
// <T> : 객체 타입
// <E> : 컬렉션 안에 존재하는 객체 하나(Element)
// <K>,<V> : Map형식의 key와 value를 뜻함. key와 value는 1:1 대응을 이루며, key를 호출하면 value가 나온다.

// 컬렉션(Collection) : 객체를 모으고 관리하는 인터페이스들
// Collection<E> <= 컬렉션 중 최상위 클래스
// 기본적으로 알아야 할 컬렉션 : Set<E>, List<E>, Queue<E>, Map<K,V>

// <컬렉션 인터페이스의 주요 메소드>
// add(E e) : 해당 객체를 추가하고 추가 성공 여부에 따라 boolean형을 반환한다.
// addAll(Collection<? extends E> c) : 특정 컬렉션에 있는 모든 요소를 다른 컬렉션에 추가한다.
//									    성공 여부에 따라 boolean형을 반환한다.
// clear() : 컬렉션의 모든 요소를 삭제한다.
// contains(Object o) : 해당 객체가 컬렉션 내에 존재하는지 검사하여 boolean형을 반환한다.
// isEmpty() : 해당 컬렉션이 비어있는지 검사하여 boolean형을 반환한다.
// remove(Object o) : 해당 객체를 컬렉션 내에서 삭제한다.
// size() : 컬렉션 내에 존재하는 객체의 수를 int로 반환한다.
// toArray() : 해당 컬렉션을 배열로 만든다.
// iterator() : 해당 컬렉션 안에 존재하는 객체에 차례대로 접근하기 위한 Iterator 객체를 반환한다.

public class Ex01 {
	public static void main(String[] args) {
		// set 인터페이스를 구현한 클래스 : HashSet, TreeSet
		// set의 특징 : 중복 없음, 특정 기준으로 정렬할 수 없음
		//			 TreeSet은 오름차순 정렬이다.
		
		Set<String> test1 = new HashSet<>();
		Set<Integer> test2 = new TreeSet<>();
		
		// 객체 생성
		String name = "희동이";
		// 생성된 객체 추가
		test1.add(name);
				
		// 객체 생성
		Integer k1 = new Integer(100);
		// 생성된 객체 추가
		test2.add(k1);
		
		test1.add("둘리");	// 오토박싱 : 기본 자료형을 객체로 만드는 것
		test1.add("마이콜");
		test2.add(12);		// 오토박싱에 의해 자동으로 객체로 만들어져 컬렉션에 들어간다.
		test2.add(14);

//		test2.addAll(true);	// 제네릭 타입은 Integer이므로 오류 발생
//		test2.addAll('A');
//		test2.addAll(3.14);
//		test2.addAll("10");

		// 전체 내용 보기

		System.out.println(test1);
		System.out.println(test2);
		System.out.println(test1.size());
		System.out.println(test2.size());
		
		// 하나씩 추출
		// 1. 배열로 취급해 for문 사용
		for (String s : test1) {
			System.out.println(s);
		}
		for (Integer i : test2) {
			System.out.println(i);
		}
		
		
		// 2. Iterator 사용
		Iterator<String> test1_it = test1.iterator();
		Iterator<Integer> test2_it = test2.iterator();
		System.out.println(":::::::::::::::::::::::::::::");
		while(test2_it.hasNext()){
			int k = test2_it.next();
			System.out.println(k+10);
		}
	}
}