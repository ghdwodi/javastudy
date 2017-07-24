package com.hb.bm;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

public class Join_IOmethods {
	ArrayList<TestMemberVO> tmvo = new ArrayList<>();
	TestMemberDAO tm = new TestMemberDAO();
	
	public void inputData(){
		FileOutputStream fis = null;
		ObjectOutputStream oos = null;
		tmvo = tm.select();
		try {
			fis = new FileOutputStream("c:/util/testmember.ser");
			oos = new ObjectOutputStream(fis);
			oos.writeObject(tmvo);
			oos.flush();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
	
	public void outputData(){
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		tmvo = tm.select();
		try {
			fis = new FileInputStream("c:/util/testmember.ser");
			ois = new ObjectInputStream(fis);
			ArrayList<TestMemberVO> tm2 = (ArrayList<TestMemberVO>)ois.readObject();
			Iterator<TestMemberVO> tm2_it = tm2.iterator();
			System.out.println("idx\tid\tpassword\tphone");
			while (tm2_it.hasNext()) {
				TestMemberVO t = (TestMemberVO) tm2_it.next();
				System.out.print(t.getIdx()+"\t");
				System.out.print(t.getId()+"\t");
				System.out.print(t.getPassword()+"\t");
				System.out.print(t.getPhone()+"\n");
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
