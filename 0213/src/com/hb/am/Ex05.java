package com.hb.am;
import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		// Formatter 클래스
		Formatter f = new Formatter();
		// %b는 boolean, %d는 10진수 int, %f는 실수, %c는 char, %s는 String
		f.format("%b %3d %f %.1f %c %s", true, 120, 3.14, 3.15, 'A', "당나귀");
		System.out.println(f);
		
		// 디버깅 : 계산한 값이 맞나 틀리나 점검하는 것
		
		int su = 10;
		int su2 = 10;
		su = su + 5;
		
//		System.out.println(su);
		
		su2 = su + su2;
		System.out.println(su2);
		
	}
}
