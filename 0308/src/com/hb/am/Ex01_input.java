package com.hb.am;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Iterator;


// 역직렬화
public class Ex01_input {
	public static void main(String[] args) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream("c:/util/objectdata.txt");
			ois = new ObjectInputStream(fis);
			
			// 역직렬을 실행하면 Object로 나온다.
			// Object로 나온 객체를 그대로 list로 형변환
			ArrayList<Ex01_VO> list = (ArrayList<Ex01_VO>)ois.readObject();
			System.out.println("이름\t나이\t주소\t성별");
			for (Ex01_VO vo : list) {
				System.out.print(vo.getName()+"\t");
				System.out.print(vo.getAge()+"\t");
				System.out.print(vo.getAddr()+"\t");
				if (vo.isGender()){
					System.out.println("여자"+"\n");
				} else {
					System.out.println("남자"+"\n");
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
