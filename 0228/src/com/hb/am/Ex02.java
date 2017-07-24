package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// 다중 catch : try문에서 한 가지 Exception이 발생하는 것이 아니라 여러 가지 Exception이 발생 가능할 경우
//			   각각의 Exception을 처리하고자 할 때 사용
// 주의사항 : Exception은 Exception 클래스의 최상위이다. 반드시 가장 마지막 catch에 사용해야 한다.
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int var = 50;
		
		try {
			System.out.print("정수 입력 : ");
			int data = scan.nextInt();
			System.out.println(var+" 나누기 "+data+" = "+var/data);
		} catch (ArithmeticException e) {
			System.out.println("0으로는 나눌 수 없습니다.");
		} catch (InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
		} catch (Exception e) {
			System.out.println("오류 : "+e);
		}
	}
}
