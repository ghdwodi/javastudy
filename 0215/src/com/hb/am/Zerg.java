package com.hb.am;

public class Zerg extends Unit {
	
	boolean fly;
	
	// ������
	
	public Zerg() {}
	
	public Zerg(String name, boolean fly){
		setName(name);
		this.fly = fly;
		setEnergy(300);
	}
	
	// �θ� Ŭ������ �߻� �޼ҵ带 ��üȭ
	@Override
	public void decEnerge() {
		setEnergy(getEnergy()-5);
	}
}
