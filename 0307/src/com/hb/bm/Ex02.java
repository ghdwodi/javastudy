package com.hb.bm;

import java.io.FileWriter;

//FileOutputStream => 1byte, write() => �ƽ�Ű�ڵ�(int), write(byte[] b)
//FileWriter => 2byte, write() => �����ڵ�(int), write(char[] c)
public class Ex02 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/util/fw01.txt");
			fw.write("�ȳ��Ͻʴϱ�!\r\n�ȳ���ϰŵ�?");
			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}