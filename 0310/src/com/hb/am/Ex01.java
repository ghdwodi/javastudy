package com.hb.am;

import java.net.InetAddress;

// InetAddress : IP�ּҸ� ǥ���ϴ� Ŭ�����̴�.
// �����ڴ� ���������� new�����ڷ� ������ �� ����.
// 5���� static �޼ҵ带 �̿��� �����ؾ� �Ѵ�.
// localhost => ���� ���� ����ϰ� �ִ� ��ǻ�͸� ���Ѵ�.

public class Ex01 {
	public static void main(String[] args) {
		try {
			InetAddress addr = InetAddress.getLocalHost();
			System.out.println("ȣ��Ʈ �̸� : "+addr.getHostName());
			System.out.println("ȣ��Ʈ IP�ּ� : "+addr.getHostAddress());

			InetAddress addr2 = InetAddress.getByName("newstapa.org");
			System.out.println("����Ÿ�� �̸� : "+addr2.getHostName());
			System.out.println("����Ÿ�� IP�ּ� : "+addr2.getHostAddress());
			
			InetAddress[] addr3 =  InetAddress.getAllByName("www.daum.net");
			for (InetAddress k : addr3) {
				System.out.println("���� �̸� : "+k.getHostName());
				System.out.println("���� IP�ּ� : "+k.getHostAddress());
				System.out.println(":::::::::::::::::::::::::::::::::::::");
			}
			
			byte[] b = {(byte)52,(byte)199,(byte)90,(byte)229};
			InetAddress addr4 = InetAddress.getByAddress(b);
			System.out.println("�̸� : "+addr4.getHostName());
			System.out.println("IP�ּ� : "+addr4.getHostAddress());
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
