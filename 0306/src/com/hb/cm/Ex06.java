package com.hb.cm;

import java.io.FileOutputStream;

// ��Ʈ��stream : �����͸� ���������� ������ϴ� ���
// ����Ʈ ��Ʈ�� : 1byte�� �����
// ����Ʈ ��Ʈ���� ��� : ����Ʈ�� �̷���� ����, ����, �Ҹ� �� ��� ����

// OutputStream => FileOutputStream : ������ ������ ������ ����ϴ� ��Ʈ��
public class Ex06 {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		try {
			// ������ ���������.
			// ������ ���� ����.
			// ������ ���Ͽ� �̾�⸦ �Ϸ��� true�� �־� �ش�.
			fos =  new FileOutputStream("c:/util/test02.txt");
//			fos =  new FileOutputStream("c:/util/test02.txt", true);
			
//			fos.write(79);	// �ƽ�Ű �ڵ� 79�� o�̴�.
			fos.flush();
			
			// ���� ���� �ֱ�
			/*int b = 'l';
			fos.write(b);
			fos.flush();
			b = 'o';
			fos.write(b);
			fos.flush();
			b = 'v';
			fos.write(b);
			fos.flush();
			b = 'e';
			fos.write(b);
			fos.flush();
			*/
			
			/*byte[] b = {'k','o','r','e','a',13,10,'b','o','y'};
			fos.write(b);
			fos.flush();
			*/
			
			String msg = "�ȳ��ϼ���\r\n12345\r\nHello~\r\n��������";
			byte[] b = msg.getBytes();
			fos.write(b);
			fos.flush();
			
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
