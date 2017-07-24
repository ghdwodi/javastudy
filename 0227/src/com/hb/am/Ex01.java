package com.hb.am;

// ������ : ���(static final)�� ������ ����, ������ ����� �ϳ��� ��ü�� �Ǵ�.
// ���� : [����������] enum �̸�{���, ���, ���,...}

public class Ex01 {
	static final int JAVA = 100;
	public enum Lesson{JAVA,JSP,SPRING,ANDROID,DB,HTML_CSS,JAVASCRIPT};
	public static void main(String[] args) {
		Lesson msg = Lesson.JAVA;
		
		System.out.println(msg);	// �̸��� �������� ���� �ٸ��� ���´�. 
		System.out.println(JAVA);	// ������ ����� ������ �� ������ �� �� �ִ� �κ��̹Ƿ� ������ ��!
		System.out.println("::::::::::::::::::::::::::::::");
		
		// enum�� �迭�� ����� �� �ִ�
		Lesson[] arr = Lesson.values();
		for (Lesson lesson : arr) {
			System.out.println(lesson);
		}
	}
}
