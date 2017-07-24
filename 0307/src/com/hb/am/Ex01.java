package com.hb.am;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Ex01 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		int b = 0;
		try {
			// 스트림 체인 방식
			fis = new FileInputStream("c:/util/test02.txt");
			bis = new BufferedInputStream(fis);
			while ((b=fis.read()) != -1){
				System.out.print((char)b);
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
