package com.hb.cm;

import java.util.*;

public class Ex01 extends Random {
	public static void main(String[] args) {
//		Random ran = new Random();
//		int su = ran.nextInt(44+1);
//		System.out.println(su);
		
		// 자기 자신을 객체로 만드는 순간 부모 클래스(Random)를 사용할 수 있다.
		Ex01 test = new Ex01();
		int su = test.nextInt(44)+1;
		System.out.println(su);
	}
}
