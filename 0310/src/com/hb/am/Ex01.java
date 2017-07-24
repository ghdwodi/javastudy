package com.hb.am;

import java.net.InetAddress;

// InetAddress : IP주소를 표현하는 클래스이다.
// 생성자는 존재하지만 new연산자로 생성할 수 없다.
// 5개의 static 메소드를 이용해 생성해야 한다.
// localhost => 현재 내가 사용하고 있는 컴퓨터를 뜻한다.

public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("호스트 이름 : "+addr.getHostName());
			System.out.println("호스트 IP주소 : "+addr.getHostAddress());

			InetAddress addr2 = InetAddress.getByName("newstapa.org");
			System.out.println("뉴스타파 이름 : "+addr2.getHostName());
			System.out.println("뉴스타파 IP주소 : "+addr2.getHostAddress());
			
			InetAddress[] addr3 =  InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addr3) {
				System.out.println("다음 이름 : "+k.getHostName());
				System.out.println("다음 IP주소 : "+k.getHostAddress());
				System.out.println(":::::::::::::::::::::::::::::::::::::");
			}
			
			byte[] b = {(byte)52,(byte)199,(byte)90,(byte)229};
			InetAddress addr4 = InetAddress.getByAddress(b);
			System.out.println("이름 : "+addr4.getHostName());
			System.out.println("IP주소 : "+addr4.getHostAddress());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
