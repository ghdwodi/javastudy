package com.hb.cm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 스트림stream : 데이터를 목적지까지 입출력하는 방법
// 바이트 스트림 : 1byte씩 입출력
// 바이트 스트림의 대상 : 바이트로 이루어진 파일, 영상, 소리 등 모든 파일

// InputStream => FileInputStream : 파일을 읽어들이는 스트림
public class Ex04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		// File file = new File("c:/util/test01.txt");
		
		// 아스키코드 이외의 문자를 읽기 위해 byte배열로 처리한다.
		// 배열 크기만큼만 읽어들일 수 있다.
		byte[] b = new byte[64];
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			fis.read(b);
//			System.out.println(b);	// 위치값만 나온다
			/*for (byte k : b) {
				System.out.println(k);	// 여전히 1byte씩만 출력하므로 아스키코드 이외의 문자는 출력 불가
			}*/
			
			String msg = new String(b).trim();
			System.out.println(msg);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
