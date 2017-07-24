package com.hb.am;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream : 모든 자료형을 출력할 수 있다.
// 혼자서 사용 가능
// 체인 방식으로도 사용 가능
public class Ex05 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		try {
			fos = new FileOutputStream("c:/util/ps2.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.println('a');
			ps.println("Hello");
			ps.println(false);
			ps.println(3.14);
			ps.println(1000);
			ps.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ps.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
