package com.hb.am;

public class TestMain {
	public static void main(String[] args) {
		Zerg z = new Zerg("울트라리스크", false);
		Protoss p = new Protoss("캐리어", true);
		Terran t = new Terran("고스트", false);
		
		z.decEnerge();
		z.decEnerge();
		z.decEnerge();
		System.out.println(z.getName()+" 에너지 : "+z.getEnergy());
		if (z.fly){
			System.out.println("비행가능");
		} else {
			System.out.println("비행불가");
		}
	}
}
