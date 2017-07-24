package com.hb.cm;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// ��Ʈ��stream : �����͸� ���������� ������ϴ� ���
// ����Ʈ ��Ʈ�� : 1byte�� �����
// ����Ʈ ��Ʈ���� ��� : ����Ʈ�� �̷���� ����, ����, �Ҹ� �� ��� ����

// InputStream => FileInputStream : ������ �о���̴� ��Ʈ��
public class Ex04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		// File file = new File("c:/util/test01.txt");
		
		// �ƽ�Ű�ڵ� �̿��� ���ڸ� �б� ���� byte�迭�� ó���Ѵ�.
		// �迭 ũ�⸸ŭ�� �о���� �� �ִ�.
		byte[] b = new byte[64];
		try {
			fis = new FileInputStream("c:/util/test01.txt");
			fis.read(b);
//			System.out.println(b);	// ��ġ���� ���´�
			/*for (byte k : b) {
				System.out.println(k);	// ������ 1byte���� ����ϹǷ� �ƽ�Ű�ڵ� �̿��� ���ڴ� ��� �Ұ�
			}*/
			
			String msg = new String(b).trim();
			System.out.println(msg);

		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e);
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
