package com.hb.am;

import java.util.Scanner;

// throws : �޼ҵ忡�� ���� ��ü�� ó������ �ʰ� �ڽ��� ȣ���� ������ �����Ѵ�.
//			����ó���� ���� �ʰ� ������ �ϴ� ���̹Ƿ� ���α׷��� �����ϱ� ���� �������� ����ó���� �ؾ� �Ѵ�.

public class Ex03 {
	public void setData(String m) throws NumberFormatException {
		if (m.length()>=1){
			String str = m.substring(0, 1);
			prnData(str);
		}
	}
	
	public void prnData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan+"��");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+" X "+i+" = "+(dan*i));
		}
	}
	
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("���� : ");
			String msg = scan.next();
			scan.close();
			test.setData(msg);	
		} catch (Exception e) {
			System.out.println("���ڸ� �Է��ϼ���.");
		}
		
	}
}
