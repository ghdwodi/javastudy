package com.hb.am;

public class Protoss extends Unit {
	
	boolean fly;
	
	// ������
	
	public Protoss() {}
	
	public Protoss(String name, boolean fly){
		setName(name);
		this.fly = fly;
		setEnergy(100);
	}
	
	// �θ� Ŭ������ �߻� �޼ҵ带 ��üȭ
	@Override
	public void decEnerge() {
		setEnergy(getEnergy()-1);
	}
}
