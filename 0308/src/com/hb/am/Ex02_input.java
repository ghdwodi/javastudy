package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex02_input {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:/util/objectdata2.ser");
			ois = new ObjectInputStream(fis);
			ArrayList<Ex02_VO> list = (ArrayList<Ex02_VO>)ois.readObject();
			
			System.out.println("�̸�\t����\t�ּ�\t����");
			for (Ex02_VO vo : list) {
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getAge()+"\t");
				System.out.print(vo.getAddr()+"\t");
				if (vo.isGender()){
					System.out.println("����"+"\n");
				} else {
					System.out.println("����"+"\n");
				}
			}
			
			// Iterator�� ����غ���
			
		} catch (Exception e) {
		} finally {
			try {
				
			} catch (Exception e2) {
			}
		}
	}
}
