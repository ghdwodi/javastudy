package com.hb.am;

public abstract class Unit {
	private String name;
	private int energy;

	// 추상 메소드
	
	public abstract void decEnerge();
	
	// getter, setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energe) {
		this.energy = energe;
	}
	
}