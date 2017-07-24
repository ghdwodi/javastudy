package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex02_output{
	public static void main(String[] args) {
		// vo기준 객체 생성
		Ex02_VO t1 = new Ex02_VO("홍길동", 12, "서울", false);	// 남자 : false, 여자 : true
		Ex02_VO t2 = new Ex02_VO("임꺽정", 13, "천안", false);
		Ex02_VO t3 = new Ex02_VO("일지매", 14, "고양", false);
		Ex02_VO t4 = new Ex02_VO("다모", 15, "평양", true);
		Ex02_VO t5 = new Ex02_VO("장길산", 16, "부산", false);
		
		ArrayList<Ex02_VO> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);
		list.add(t5);
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:/util/objectdata2.ser");	// ser : 직렬화 기본 확장자
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(list);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				fos.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
