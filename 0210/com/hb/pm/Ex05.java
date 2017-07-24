package com.hb.pm;

public class Ex05 {
	private String point;	// 은행 위치
	static float interest;	// 은행 이자
	public Ex05() {}
	public Ex05(String point){
		this.point = point;
	}
	public void getInfo(){
		System.out.println("지점 : "+point);
		System.out.println("이자율 : "+interest);
	}
}
