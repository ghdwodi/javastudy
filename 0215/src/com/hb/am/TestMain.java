package com.hb.am;

public class TestMain {
	public static void main(String[] args) {
		Zerg z = new Zerg("��Ʈ�󸮽�ũ", false);
		Protoss p = new Protoss("ĳ����", true);
		Terran t = new Terran("��Ʈ", false);
		
		z.decEnerge();
		z.decEnerge();
		z.decEnerge();
		System.out.println(z.getName()+" ������ : "+z.getEnergy());
		if (z.fly){
			System.out.println("���డ��");
		} else {
			System.out.println("����Ұ�");
		}
	}
}
