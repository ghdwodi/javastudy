package com.hb.am;

import com.hb.am.Ex04.Ex04_1;

public class Ex04_main {
	public static void main(String[] args) {
		// static �������� ��ü ���� ���� ���� ����
		System.out.println(Ex04_1.pi);
		System.out.println(Ex04_1.pi2);
		
		// Ex04_1 ��ü�� static Ŭ�����̹Ƿ� ������ ��ü ���� �� ������ ����
		Ex04_1 test =  new Ex04_1();
		System.out.println(test.age);
		System.out.println(test.str);
		
		
	}
}
