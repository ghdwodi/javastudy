package com.hb.am;
import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		// StringTokenizer <= 문자열을 나눈다(String.split()과 같다)
		// split()과 다른 점 : 마음대로 나눌 수 없다. 필요 없는 공간을 알아서 삭제한다.
		//				     단 반환형이 String[]이 아니므로 for문을 사용할 수 없다.
		//				     특별히 구분자를 지정해주지 않으면 \t\n\r\f으로 구분한다.
		// Tokenize한 결과를 배열에 저장해 보자.
		StringTokenizer st = new StringTokenizer("아버지는 나귀타고 장에 가시고");
		String[] arr = new String[st.countTokens()];
		// countTokens() => 나누어지는 개수
		int i = 0;
		while (st.hasMoreTokens()) {
			arr[i] = st.nextToken();
			i++;
		}
		for (String k : arr) {
			System.out.println(k);
		}
		
		// 날짜도 Tokenize해보자.
		StringTokenizer st2 = new StringTokenizer("2013/02/13","/");
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());			
		}
	}
}
