package com.hb.am;

// 열거형 : 상수(static final)만 가지고 있음, 각각의 상수를 하나의 객체로 판단.
// 형식 : [접근제한자] enum 이름{상수, 상수, 상수,...}

public class Ex01 {
	static final int JAVA = 100;
	public enum Lesson{JAVA,JSP,SPRING,ANDROID,DB,HTML_CSS,JAVASCRIPT};
	public static void main(String[] args) {
		Lesson msg = Lesson.JAVA;
		
		System.out.println(msg);	// 이름이 같은데도 값이 다르게 나온다. 
		System.out.println(JAVA);	// 실제로 상수를 정의할 때 문제가 될 수 있는 부분이므로 주의할 것!
		System.out.println("::::::::::::::::::::::::::::::");
		
		// enum을 배열로 사용할 수 있다
		Lesson[] arr = Lesson.values();
		for (Lesson lesson : arr) {
			System.out.println(lesson);
		}
	}
}
