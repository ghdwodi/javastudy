package com.hb.am;

public class Hw04_main {
	public static void main(String[] args) {
		Hw04_Calc calc = new Hw04_Calc();
		int arr[] = calc.numbers("100+200* 00989- 300");
		String arr2[] = calc.operations("100+200* 00989/300");
		
		for (int i : arr) {
			System.out.println(i);
		}
		
		for (String s : arr2) {
			System.out.println(s);
		}
		
	}
}
