package com.hb.am;

public class Ex04 {
	public static void main(String[] args) {
		// Wrapper Ŭ������ => ���� �ڷ����� ��ü�� ����� ������ �ϴ� Ŭ����
		// �� �ڷ������� ��ü�� ������ִ� Ŭ������ ������ ����
		// boolean => Boolean, char => Character, int => Integer, double => Double
		boolean b = true;
		Boolean w_b; new Boolean(b);
		
		char c = 'A';
		Character w_c = new Character(c);
		
		int su = 123;
		Integer w_su = new Integer(su);
		
		double su2 = 3.14;
		Double w_su2 = new Double(su2);
		
		// String => ���� �ڷ������� ����
		// �� Charater�� String.charAt()�� ����ϸ� �ȴ�.
		String s1 = "true";
		boolean k1 = Boolean.parseBoolean(s1);	// API ����Ű : Ŀ���� �ش� API�� ���� shift+F2
		// ��ü ���� ���� ��� ������ ���� : static�̱� ����
		String s2 = "123";
		int k2 = Integer.parseInt(s2);
		
		String s3 = "3.14";
		double k3 = Double.parseDouble(s3);
		
		String s4 = "3.14f";
		float k4 = Float.parseFloat(s4);
	}
}
