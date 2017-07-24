package com.hb.am;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

// 서울시 도서관시간표 URL : http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/
// 전국날씨 URL : http://www.kma.go.kr/XML/weather/sfc_web_map.xml
public class Ex03 {
	public static void main(String[] args) {
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			URL url1 = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			
			
			URLConnection conn1 = url1.openConnection();
			
			
			isr = new InputStreamReader(conn1.getInputStream(),"utf-8");
			br = new BufferedReader(isr);

			String msg = null;
			while ((msg=br.readLine())!=null){
				System.out.println(msg);
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
