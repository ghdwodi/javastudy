package com.hb.bm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.PrintWriter;

// InputStreamReader : byte 스트림을 문자 스트림으로 변경
//					    즉 InputStream을 Reader로 변경한다.
// 일반적인 장치는 byte 입력 스트림을 사용한다.
// InputStreamReader는 기계와 사람 간 젠더 역할을 한다.
// 기계 => BufferedReader(InputStreamReader) => 인간
public class Ex08 {
	public static void main(String[] args) {
		System.out.print("원하는 문자 : ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		PrintStream ps = null;
		PrintWriter pw = null;
		
		try {
			isr = new InputStreamReader(System.in);	// System.in의 반환형은 InputStream이다.
			br = new BufferedReader(isr);
			String msg = br.readLine();
			ps = new PrintStream(System.out);
			ps.println("받은 정보(PrintStream) : "+msg);
			ps.flush();
			
			osw = new OutputStreamWriter(System.out);
			bw = new BufferedWriter(osw);
			pw = new PrintWriter(bw);
			pw.println("받은 정보(PrintWriter) : "+msg);
			pw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
}
