package com.hb.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex03 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream("c:/util/exam02.txt");
			bos = new BufferedOutputStream(fos);
			String msg = "hello\r\n12345\r\n가나다라마바사";
			byte[] b = msg.getBytes();
			bos.write(b);
			bos.flush();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
