package com.hb.bm;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

// PrintStream => ��� �ڷ����� ���
// PrintWrite => OutPutStream(1byte), (Writer)2byte ��� ���� �� �ִ�.

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

			// PrintWriter�� OutputStream�� �޾Ƽ� ���
			pw = new PrintWriter(bos);
			pw.write("�ȳ��Ͻ�");
			pw.println("��Ʈ��");
			pw.println("��Ʈ��2");
			pw.flush();
			
			// PrintWriter�� Writer�� �޾Ƽ� ���
			fw = new FileWriter("c:/util/ps4.txt");
			bw = new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			pw.write("�ȳ��Ͻ�");
			pw.println();
			pw.println("��Ʈ��");
			pw.println("��Ʈ��2");
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
