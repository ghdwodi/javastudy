package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;


// ������ȭ
public class Ex01_input {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:/util/objectdata.txt");
			ois = new ObjectInputStream(fis);
			
			// �������� �����ϸ� Object�� ���´�.
			// Object�� ���� ��ü�� �״�� list�� ����ȯ
			ArrayList<Ex01_VO> list = (ArrayList<Ex01_VO>)ois.readObject();
			System.out.println("�̸�\t����\t�ּ�\t����");
			for (Ex01_VO vo : list) {
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getAge()+"\t");
				System.out.print(vo.getAddr()+"\t");
				if (vo.isGender()){
					System.out.println("����"+"\n");
				} else {
					System.out.println("����"+"\n");
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
