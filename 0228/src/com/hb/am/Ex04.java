package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally {
//		반드시 실행해야 할 문장;
// }
public class Ex04 {
	public static void main(String[] args) {
		int var = 50;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("입력 : ");
			int data = scan.nextInt();
			System.out.println(var+" 나누기 "+data+" 는 "+(var/data));
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return;
		} catch (InputMismatchException e) {
			System.out.println("숫자만 입력해 주세요.");
			return;	// return 명령어를 만나면 프로그램을 중지하고 호출한 곳으로 보내버린다.
		} finally 
		{
			System.out.println("수고하셨습니다.");	// finally 예약어 내의 문장은 반드시 실행하고 넘어간다.
		}
	}
}
