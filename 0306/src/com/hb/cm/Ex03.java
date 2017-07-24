package com.hb.cm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ��Ʈ��stream : �����͸� ���������� ������ϴ� ���
// ����Ʈ ��Ʈ�� : 1byte�� �����
// ����Ʈ ��Ʈ���� ��� : ����Ʈ�� �̷���� ����, ����, �Ҹ� �� ��� ����

// InputStream => FileInputStream : ������ �о���̴� ��Ʈ��
public class Ex03 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		// File file = new File("c:/util/test01.txt");
		
		// read �޼ҵ带 ����ϸ� �ƽ�Ű�ڵ尪(0-255)�� ���ڷ� ���´�.
		int k = 0;
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			
			// read()�� 1byte�� �о k�� ����
//			k = fis.read();
//			System.out.println(k);
//			System.out.println((char)k);
			
			// ��ü ���� �о����
/*			while(true){
				k = fis.read();
				if(k==-1) break;
				System.out.println(k);
			}*/
			
			// -1�� �ƴ� �� ����, -1�� ������ �������� �� ��
			while((k=fis.read()) != -1){
				System.out.println((char)k);	// �ƽ�Ű�ڵ忡�� 13, 10�� ���� �� ������ �̵�, �ٹٲ�
			}
			
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fis != null) fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
