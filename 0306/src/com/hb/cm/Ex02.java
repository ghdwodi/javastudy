package com.hb.cm;

import java.io.File;

public class Ex02 {
	public static void main(String[] args) {
		String path = "C:/util/test01.txt";
		File file = new File(path);
		try {
			boolean res = file.createNewFile();
			if (res) {
				System.out.println("���� ���� ����");
			} else {
				System.out.println("���� ���� ����");	// ���ϸ��� ���� ������ �̹� �����ϸ� ����
			}
			System.out.println("::::::::::::::::::::::::::::::");
			System.out.println("������ : "+file.getAbsolutePath());
			System.out.println("����� : "+file.getPath());
			System.out.println("����ȭ��� : "+file.getCanonicalPath());
			System.out.println("�����̸� : "+file.getName());
			System.out.println("�������丮 : "+file.getParent());
			
			boolean res2 = file.delete();
			if (res2){
				System.out.println("���� ���� ����");
			} else {
				System.out.println("���� ���� ����");
			}
			
			File file2 = new File("c:/util/exam");
			file2.mkdirs();
			file2.delete();
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);	// ���� ��ΰ� �ٸ��� ���ܷ� ó��
		}
	}
}
