package com.hb.bm;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ex09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, String> map = new HashMap<>();
		map.put("�ѱ�", "����");
		map.put("���ѹα�", "����");
		map.put("�̱�", "������");
		map.put("ĳ����", "��Ÿ��");
		map.put("����", "����");
		map.put("������", "�ĸ�");
		map.put("�ʸ���", "���Ҷ�");
		map.put("ȣ��", "ĵ����");
		
		Set<String> keys = map.keySet();
		
		exit :
		while(true){
			System.out.print("���� �Է� : ");
			String ans = scan.next();
			if (keys.contains(ans)){
				String cap = map.get(ans);
				System.out.println(ans+"�� ������ "+cap+"�Դϴ�.");
			} else {
				System.out.println("�����Ϳ� ���� �����Դϴ�.");
			}
			while(true){
				System.out.print("����ұ��?(y/n) : ");
				String msg = scan.next();
				if (msg.equalsIgnoreCase("y")){
					break;
				} else if (msg.equalsIgnoreCase("n")){
					break exit;
				} else {
					System.out.println("�ٽ� �Է��� �ּ���.(y/n)");
					continue;
				}
			}
		}
		System.out.println("�����ϼ̽��ϴ�.");
	}
}
