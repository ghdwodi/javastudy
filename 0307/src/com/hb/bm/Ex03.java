package com.hb.bm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

// BufferedReader => 한 줄씩 읽기 : readLine();
// BufferedWriter => 한 줄 띄우기 : newLine();
public class Ex03 {
	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		String msg = null;
		try {
			// 읽기
			fr = new FileReader("c:/util/test02.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("c:/util/fw02.txt");
			bw = new BufferedWriter(fw);
			while((msg = br.readLine()) != null){
				bw.write(msg);
				bw.newLine();
				bw.flush();
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
