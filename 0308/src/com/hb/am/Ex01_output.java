package com.hb.am;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// 객체 직렬화 : 객체가 가지고 있는 내용을 직렬로 만들어서 파일로 저장한다.
//			 직렬화하면 내용을 알아볼 수 없다.
public class Ex01_output {
	public static void main(String[] args) {
		// VO 기준으로 객체 생성
		Ex01_VO t1 = new Ex01_VO("홍길동", 12, "서울", false);	// 남자 : false, 여자 : true
		Ex01_VO t2 = new Ex01_VO("임꺽정", 13, "천안", false);
		Ex01_VO t3 = new Ex01_VO("일지매", 14, "고양", false);
		Ex01_VO t4 = new Ex01_VO("다모", 15, "평양", true);
		Ex01_VO t5 = new Ex01_VO("장길산", 16, "부산", false);
		
		// 만든 객체를 모은다(컬렉션 ArrayList)
		ArrayList<Ex01_VO> voList = new ArrayList<>();
		voList.add(t1);
		voList.add(t2);
		voList.add(t3);
		voList.add(t4);
		voList.add(t5);
		
		// 리스트 직렬화 : 객체 직렬화는 ObjectOutputStream.writeObject()
		// 직렬화는 객체를 파일로 만드는 것이다.
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			fos = new FileOutputStream("c:/util/objectdata.txt");
			oos = new ObjectOutputStream(fos);
			
			// 객체 직렬화
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
