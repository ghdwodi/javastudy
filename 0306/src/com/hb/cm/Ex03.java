package com.hb.cm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 스트림stream : 데이터를 목적지까지 입출력하는 방법
// 바이트 스트림 : 1byte씩 입출력
// 바이트 스트림의 대상 : 바이트로 이루어진 파일, 영상, 소리 등 모든 파일

// InputStream => FileInputStream : 파일을 읽어들이는 스트림
public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		// File file = new File("c:/util/test01.txt");
		
		// read 메소드를 사용하면 아스키코드값(0-255)이 숫자로 나온다.
		int k = 0;
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			
			// read()는 1byte만 읽어서 k에 저장
//			k = fis.read();
//			System.out.println(k);
//			System.out.println((char)k);
			
			// 전체 내용 읽어오기
/*			while(true){
				k = fis.read();
				if(k==-1) break;
				System.out.println(k);
			}*/
			
			// -1이 아닐 때 실행, -1이 나오면 실행하지 말 것
			while((k=fis.read()) != -1){
				System.out.println((char)k);	// 아스키코드에서 13, 10은 각각 맨 끝으로 이동, 줄바꿈
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
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
