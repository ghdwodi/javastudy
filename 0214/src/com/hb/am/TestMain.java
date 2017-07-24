package com.hb.am;

public class TestMain {
	public static void main(String[] args) {
		DcaPhone dca = new DcaPhone();
		System.out.println(dca.name);
		System.out.println(dca.price);	// 부모 클래스 Phone에서 받아온 멤버 변수
		dca.call();
		dca.text();		// 부모 클래스 Phone에서 받아온 메소드
		dca.dca();
		
		System.out.println(":::::::::::::::::::::::::::::");
		Mp3Phone mp = new Mp3Phone();
		System.out.println(mp.name);
		System.out.println(mp.price);
		mp.call();
		mp.text();
		mp.sound();
		
		System.out.println(":::::::::::::::::::::::::::::");
		GamePhone gp = new GamePhone();
		System.out.println(gp.name);
		System.out.println(gp.price);
		gp.call();
		gp.text();
		gp.sound();
		gp.play();
	}
}
