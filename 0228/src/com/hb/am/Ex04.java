package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// finally {
//		�ݵ�� �����ؾ� �� ����;
// }
public class Ex04 {
	public static void main(String[] args) {
		int var = 50;
		Scanner scan = new Scanner(System.in);
		try {
			System.out.print("�Է� : ");
			int data = scan.nextInt();
			System.out.println(var+" ������ "+data+" �� "+(var/data));
		} catch (ArithmeticException e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			return;
		} catch (InputMismatchException e) {
			System.out.println("���ڸ� �Է��� �ּ���.");
			return;	// return ���ɾ ������ ���α׷��� �����ϰ� ȣ���� ������ ����������.
		} finally 
		{
			System.out.println("�����ϼ̽��ϴ�.");	// finally ����� ���� ������ �ݵ�� �����ϰ� �Ѿ��.
		}
	}
}