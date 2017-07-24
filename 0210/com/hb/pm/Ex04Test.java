package com.hb.pm;

public class Ex04Test {
	public static void main(String[] args) {
		Ex04 t1 = new Ex04();
		System.out.println(t1.a);	// Ex04 클래스의 멤버변수 a(=0)에 1을 더한다.
		System.out.println(t1.b);	// Ex04 클래스의 static int b에 1을 더한다.
		
		Ex04 t2 = new Ex04();
		System.out.println(t2.a);	// Ex04 클래스를 또 객체로 불러와 a(=0)에 1을 더한다.
		System.out.println(t2.b);	// static int b의 주소에는 이미 1이 더해져 있으므로 또 1을 더하면 2가 된다.
		
		Ex04 t3 = new Ex04();
		System.out.println(t3.a);	// Ex04 클래스를 또 객체로 불러와 a(=0)에 1을 더한다.
		System.out.println(t3.b);	// static int b의 주소에는 이미 1이 더해져 있으므로 또 1을 더하면 3이 된다.
	}
}
