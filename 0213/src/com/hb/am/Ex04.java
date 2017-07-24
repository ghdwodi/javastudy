package com.hb.am;

public class Ex04 {
	public static void main(String[] args) {
		// Wrapper 클래스들 => 각종 자료형을 객체로 만드는 역할을 하는 클래스
		// 각 자료형마다 객체로 만들어주는 클래스가 별도로 존재
		// boolean => Boolean, char => Character, int => Integer, double => Double
		boolean b = true;
		Boolean w_b; new Boolean(b);
		
		char c = 'A';
		Character w_c = new Character(c);
		
		int su = 123;
		Integer w_su = new Integer(su);
		
		double su2 = 3.14;
		Double w_su2 = new Double(su2);
		
		// String => 각종 자료형으로 변경
		// 단 Charater는 String.charAt()을 사용하면 된다.
		String s1 = "true";
		boolean k1 = Boolean.parseBoolean(s1);	// API 단축키 : 커서를 해당 API에 놓고 shift+F2
		// 객체 생성 없이 사용 가능한 이유 : static이기 때문
		String s2 = "123";
		int k2 = Integer.parseInt(s2);
		
		String s3 = "3.14";
		double k3 = Double.parseDouble(s3);
		
		String s4 = "3.14f";
		float k4 = Float.parseFloat(s4);
	}
}
