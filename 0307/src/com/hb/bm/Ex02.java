package com.hb.bm;

import java.io.FileWriter;

//FileOutputStream => 1byte, write() => 아스키코드(int), write(byte[] b)
//FileWriter => 2byte, write() => 유니코드(int), write(char[] c)
public class Ex02 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("c:/util/fw01.txt");
			fw.write("안녕하십니까!\r\n안녕못하거든?");
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