package com.hb.am;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url2 = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn2 = url2.openConnection();
			
			isr = new InputStreamReader(conn2.getInputStream(),"utf-8");
			br = new BufferedReader(isr);
			
			String msg2 = null;
			while ((msg2=br.readLine())!=null){
				System.out.println(msg2);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				br.close();
				isr.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
