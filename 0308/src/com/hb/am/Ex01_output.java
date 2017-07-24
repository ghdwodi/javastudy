package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ��ü ����ȭ : ��ü�� ������ �ִ� ������ ���ķ� ���� ���Ϸ� �����Ѵ�.
//			 ����ȭ�ϸ� ������ �˾ƺ� �� ����.
public class Ex01_output {
	public static void main(String[] args) {
		// VO �������� ��ü ����
		Ex01_VO t1 = new Ex01_VO("ȫ�浿", 12, "����", false);	// ���� : false, ���� : true
		Ex01_VO t2 = new Ex01_VO("�Ӳ���", 13, "õ��", false);
		Ex01_VO t3 = new Ex01_VO("������", 14, "���", false);
		Ex01_VO t4 = new Ex01_VO("�ٸ�", 15, "���", true);
		Ex01_VO t5 = new Ex01_VO("����", 16, "�λ�", false);
		
		// ���� ��ü�� ������(�÷��� ArrayList)
		ArrayList<Ex01_VO> voList = new ArrayList<>();
		voList.add(t1);
		voList.add(t2);
		voList.add(t3);
		voList.add(t4);
		voList.add(t5);
		
		// ����Ʈ ����ȭ : ��ü ����ȭ�� ObjectOutputStream.writeObject()
		// ����ȭ�� ��ü�� ���Ϸ� ����� ���̴�.
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:/util/objectdata.txt");
			oos = new ObjectOutputStream(fos);
			
			// ��ü ����ȭ
			oos.writeObject(voList);
			oos.flush();
		} catch (Exception e) {
		} finally {
			
		} try {
			oos.close();
			fos.close();
		} catch (Exception e) {
		}
	}
}
