package com.hb.am;

public class Terran extends Unit {
	
	boolean fly;
	
	// ������
	
	public Terran() {}
	
	public Terran(String name, boolean fly){
		setName(name);
		this.fly = fly;
		setEnergy(150);
	}
	
	// �θ� Ŭ������ �߻� �޼ҵ带 ��üȭ
	@Override
	public void decEnerge() {
		setEnergy(getEnergy()-1);
	}
}
