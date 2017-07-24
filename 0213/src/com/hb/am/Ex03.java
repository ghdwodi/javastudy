package com.hb.am;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		// StringTokenizer <= ���ڿ��� ������(String.split()�� ����)
		// split()�� �ٸ� �� : ������� ���� �� ����. �ʿ� ���� ������ �˾Ƽ� �����Ѵ�.
		//				     �� ��ȯ���� String[]�� �ƴϹǷ� for���� ����� �� ����.
		//				     Ư���� �����ڸ� ���������� ������ \t\n\r\f���� �����Ѵ�.
		// Tokenize�� ����� �迭�� ������ ����.
		StringTokenizer st = new StringTokenizer("�ƹ����� ����Ÿ�� �忡 ���ð�");
		String[] arr = new String[st.countTokens()];
		// countTokens() => ���������� ����
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i++;
		}
		for (String k : arr) {
			System.out.println(k);
		}
		
		// ��¥�� Tokenize�غ���.
		StringTokenizer st2 = new StringTokenizer("2013/02/13","/");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());			
		}
	}
}
