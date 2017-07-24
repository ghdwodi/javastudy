package com.hb.am;

import com.hb.am.Ex04.Ex04_1;

public class Ex04_main {
	public static void main(String[] args) {
		// static 변수들은 객체 생성 없이 접근 가능
		System.out.println(Ex04_1.pi);
		System.out.println(Ex04_1.pi2);
		
		// Ex04_1 자체가 static 클래스이므로 별도로 객체 생성 후 접근이 가능
		Ex04_1 test =  new Ex04_1();
		System.out.println(test.age);
		System.out.println(test.str);
		
		
	}
}
