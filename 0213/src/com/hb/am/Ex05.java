package com.hb.am;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		// Formatter Ŭ����
		Formatter f = new Formatter();
		// %b�� boolean, %d�� 10���� int, %f�� �Ǽ�, %c�� char, %s�� String
		f.format("%b %3d %f %.1f %c %s", true, 120, 3.14, 3.15, 'A', "�糪��");
		System.out.println(f);
		
		// ����� : ����� ���� �³� Ʋ���� �����ϴ� ��
		
		int su = 10;
		int su2 = 10;
		su = su + 5;
		
//		System.out.println(su);
		
		su2 = su + su2;
		System.out.println(su2);
		
	}
}
