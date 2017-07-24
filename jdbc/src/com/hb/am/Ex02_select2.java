package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_select2 {
	public static void main(String[] args) {
		HbMemberVO[] hmvo = new HbMemberVO[5];
		// 오라클과 자바를 연결하는 것들
		Connection conn = null;
		Statement stmt = null;
		ResultSet resSet = null;
		// try-catch문으로 DB의 테이블을 불러온다.
		// try-catch문의 기본 형태는 아래와 같다.
		
		try {
			// 1. jdbc 드라이버 로딩
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB 접속
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from hbmember where id = 'hongkd' and pwd = '11234'";
//			String sql = "select * from hbmember where name = '홍길동'";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			
			// 4. 결과 저장하기
			
			int cnt = 0;
/*			while (resSet.next()){
				HbMemberVO k = new HbMemberVO();
				k.setIdx(resSet.getInt(1));
				k.setId(resSet.getString(2));
				k.setPwd(resSet.getString(3));
				k.setName(resSet.getString(4));
				k.setAge(resSet.getInt(5));
				k.setAddr(resSet.getString(6));
				hmvo[cnt] = k;
				cnt++;
			}
			
			for (HbMemberVO hbMemberVO : hmvo) {
				System.out.print(hbMemberVO.getIdx()+"\t");				
				System.out.print(hbMemberVO.getId()+"\t");				
				System.out.print(hbMemberVO.getPwd()+"\t");				
				System.out.print(hbMemberVO.getName()+"\t");				
				System.out.print(hbMemberVO.getAge()+"\t");				
				System.out.println(hbMemberVO.getAddr()+"\n");				
			}*/
			
			while (resSet.next()){
				System.out.print(resSet.getInt(1)+"\t");
				System.out.print(resSet.getString(2)+"\t");
				System.out.print(resSet.getString(3)+"\t");
				System.out.print(resSet.getString(4)+"\t");
				System.out.print(resSet.getInt(5)+"\t");
				System.out.println(resSet.getString(6)+"\n");
			}
			
			if (0==resSet.getRow()){
				System.out.println("로그인 실패.");
				System.out.println("ID나 패스워드를 다시 입력하시오.");
			}
			

		} catch (Exception e) {
			System.out.println(e);

		} finally {
			try {
				if(resSet != null) resSet.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
	}
}