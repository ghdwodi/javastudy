package com.hb.am;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// DataInputStream, DataOutputStream
// �⺻ �ڷ��� �����͸� �ְ� ���� �� ����Ѵ�.
// �ݵ�� �Է� ������ ��� ������ ����� �Ѵ�.
public class Ex04 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		FileInputStream fis = null;
		DataInputStream dis = null;
		try {
			fos = new FileOutputStream("c:/util/data01.txt");
			dos = new DataOutputStream(fos);
			
			// ��� => writeXX <= XX : �⺻ �ڷ���
			dos.writeInt(100);
			dos.writeDouble(10.1);
			dos.writeChar('A');
			dos.writeBoolean(true);
			dos.flush();
			
			fis = new FileInputStream("c:/util/data01.txt");
			dis = new DataInputStream(fis);
			
			// �Է�
			System.out.println(dis.readInt());	// ������ �ٸ��� ���� ������.
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
