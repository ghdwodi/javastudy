package com.hb.am;

import java.util.InputMismatchException;
import java.util.Scanner;

// ���� catch : try������ �� ���� Exception�� �߻��ϴ� ���� �ƴ϶� ���� ���� Exception�� �߻� ������ ���
//			   ������ Exception�� ó���ϰ��� �� �� ���
// ���ǻ��� : Exception�� Exception Ŭ������ �ֻ����̴�. �ݵ�� ���� ������ catch�� ����ؾ� �Ѵ�.
public class Ex02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int var = 50;
		
		try {
			System.out.print("���� �Է� : ");
			int data = scan.nextInt();
			System.out.println(var+" ������ "+data+" = "+var/data);
		} catch (ArithmeticException e) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		} catch (InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
		} catch (Exception e) {
			System.out.println("���� : "+e);
		}
	}
}
