package com.hb.am;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream, DataOutputStream
// 기본 자료형 데이터를 주고 받을 때 사용한다.
// 반드시 입력 순서와 출력 순서를 맞춰야 한다.
public class Ex04 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream("c:/util/data01.txt");
			dos = new DataOutputStream(fos);
			
			// 출력 => writeXX <= XX : 기본 자료형
			dos.writeInt(100);
			dos.writeDouble(10.1);
			dos.writeChar('A');
			dos.writeBoolean(true);
			dos.flush();
			
			fis = new FileInputStream("c:/util/data01.txt");
			dis = new DataInputStream(fis);
			
			// 입력
			System.out.println(dis.readInt());	// 순서가 다르면 값이 깨진다.
			System.out.println(dis.readDouble());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
