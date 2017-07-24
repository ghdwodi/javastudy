package com.hb.am;

import java.util.Scanner;

// 예외처리 : try-catch 문
// try {
//		예외 발생 가능한 문장;
// } catch (예외 객체 e) {
//		예외 발생시 처리 문장;
// }

// 목적 : 예외가 발생하면 프로그램이 비정상종료된다. 이것을 막기 위해 예외처리를 한다.
//		예외처리는 예외 발생 시 비정상적인 종료를 정상적인 종료로 유도하고 해당 예외를 처리한다.
// 특징 : 예외발생 시 해당 시점 아래에 존재하는 명령어들을 무시하고 바로 catch문으로 이동한다.

public class Ex01 {
	public static void main(String[] args) {
		int[] var = {10,200,30};
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var["+i+"] : "+var[i]);
				System.out.println(4);
				System.out.println(5);
			} catch (Exception e) {
				System.out.println(e);
				System.out.println("배열을 넘었습니다.");
			}
		}
		System.out.println("프로그램 끝!");
	}
}
