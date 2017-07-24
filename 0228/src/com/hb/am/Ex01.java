package com.hb.am;

import java.util.Scanner;

// ����ó�� : try-catch ��
// try {
//		���� �߻� ������ ����;
// } catch (���� ��ü e) {
//		���� �߻��� ó�� ����;
// }

// ���� : ���ܰ� �߻��ϸ� ���α׷��� ����������ȴ�. �̰��� ���� ���� ����ó���� �Ѵ�.
//		����ó���� ���� �߻� �� ���������� ���Ḧ �������� ����� �����ϰ� �ش� ���ܸ� ó���Ѵ�.
// Ư¡ : ���ܹ߻� �� �ش� ���� �Ʒ��� �����ϴ� ��ɾ���� �����ϰ� �ٷ� catch������ �̵��Ѵ�.

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
				System.out.println("�迭�� �Ѿ����ϴ�.");
			}
		}
		System.out.println("���α׷� ��!");
	}
}
