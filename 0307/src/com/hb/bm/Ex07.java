package com.hb.bm;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

// PrintStream => 모든 자료형을 출력
// PrintWrite => OutPutStream(1byte), (Writer)2byte 모두 받을 수 있다.

public class Ex07 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		PrintWriter pw = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fos = new FileOutputStream("c:/util/ps3.txt");
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
//			ps.println('A');
//			ps.println("String");
//			ps.println(true);
//			ps.flush();

			// PrintWriter가 OutputStream을 받아서 사용
			pw = new PrintWriter(bos);
			pw.write("안녕하슈");
			pw.println("파트라슈");
			pw.println("파트라슈2");
			pw.flush();
			
			// PrintWriter가 Writer를 받아서 사용
			fw = new FileWriter("c:/util/ps4.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.write("안녕하슈");
			pw.println();
			pw.println("파트라슈");
			pw.println("파트라슈2");
			pw.flush();
			
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
