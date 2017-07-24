package com.hb.am;

public class Terran extends Unit {
	
	boolean fly;
	
	// 생성자
	
	public Terran() {}
	
	public Terran(String name, boolean fly){
		setName(name);
		this.fly = fly;
		setEnergy(150);
	}
	
	// 부모 클래스의 추상 메소드를 구체화
	@Override
	public void decEnerge() {
		setEnergy(getEnergy()-1);
	}
}
