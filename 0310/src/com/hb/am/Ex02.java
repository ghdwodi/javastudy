package com.hb.am;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;

public class Ex02 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL myUrl = new URL("http://www.naver.com");
			System.out.println(myUrl.getProtocol());
			System.out.println(myUrl.getPort());
			System.out.println(myUrl.getHost());
			System.out.println(myUrl.getFile());

			// 소스 보기
//			isr = new InputStreamReader(myUrl.openStream());
//			br = new BufferedReader(isr);
//			
//			String msg = null;
//			while((msg=br.readLine()) != null){
//				System.out.println(msg);
//			}
			
			URLConnection conn = myUrl.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String msg = null;
			while((msg=br.readLine()) != null){
				System.out.println(msg);
			}
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
