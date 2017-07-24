package com.hb.am;

import java.util.Scanner;

// throws : 메소드에서 예외 객체를 처리하지 않고 자신을 호출한 곳으로 전가한다.
//			예외처리를 하지 않고 전가만 하는 것이므로 프로그램이 종료하기 전에 언젠가는 예외처리를 해야 한다.

public class Ex03 {
	public void setData(String m) throws NumberFormatException {
		if (m.length()>=1){
			String str = m.substring(0, 1);
			prnData(str);
		}
	}
	
	public void prnData(String n) throws NumberFormatException {
		int dan = Integer.parseInt(n);
		System.out.println(dan+"단");
		for (int i = 1; i < 10; i++) {
			System.out.println(dan+" X "+i+" = "+(dan*i));
		}
	}
	
	public static void main(String[] args) {
		Ex03 test = new Ex03();
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("숫자 : ");
			String msg = scan.next();
			scan.close();
			test.setData(msg);	
		} catch (Exception e) {
			System.out.println("숫자를 입력하세요.");
		}
		
	}
}
