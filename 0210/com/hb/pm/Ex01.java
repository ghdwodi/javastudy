package com.hb.pm;
import java.util.*;
import com.hb.am.*;
public class Ex01 {
	public static void main(String[] args) {
		// class의 접근 제한자가 default이므로 다른 패키지에서 객체를 생성할 수 없다.
//		Ex02 test = new Ex02();
		// Ex05 클래스의 접근 제한자는 public이므로 import를 사용해서 접근할 수 있다.
		Ex05 test2 = new Ex05();
		Scanner scan = new Scanner(System.in);
	}
}
