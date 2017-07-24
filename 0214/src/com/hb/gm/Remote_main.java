package com.hb.gm;
import java.util.*;

class Remote_main
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		TV tv = new TV();
		Radio radio = new Radio();
		Computer com = new Computer();
		int device = 0;
		int volume = 0;
		while (true){
			System.out.print("1.TV 2.���� 3.��ǻ�� 4.���� >>> ");
			device = scan.nextInt();
			if (device==1 || device==2 || device==3){
				System.out.print("1.UP 2.DOWN >>> ");
				volume = scan.nextInt();
				if (volume==1 || volume==2){
					switch (device){
						case 1 : 
							switch (volume){
								case 1 : tv.upVol(); break;
								case 2 : tv.downVol(); break;							
							}
						break;
						case 2 :
							switch (volume){
								case 1 : radio.upVol(); break;
								case 2 : radio.downVol(); break;							
							}
						break;
						case 3 :
							switch (volume){
								case 1 : com.upVol(); break;
								case 2 : com.downVol(); break;							
							}
						break;				
					}
					System.out.println("::::::::::::::::::::::::::::::::::::::");
					System.out.println("TV ���� : "+tv.getVol());
					System.out.println("���� ���� : "+radio.getVol());
					System.out.println("��ǻ�� ���� : "+com.getVol());
				} else {
					System.out.println("�߸� �Է��߽��ϴ�.");
					continue;
				}

			} else if (device==4){
				System.out.println("�����մϴ�.");
				break;
			} else {
				System.out.println("�߸� �Է��߽��ϴ�.");
				continue;
			}
		}
		scan.close();
	}
}
