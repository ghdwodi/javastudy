package com.hb.am;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_select {
	HbMemberVO[] hmvo = new HbMemberVO[5];

	Ex02_select() {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet resSet = null;
		
		try {
			// 1. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from hbmember";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			
			// 4. 결과 저장하기
			
			int cnt = 0;
			while (resSet.next()){
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
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(resSet != null) resSet.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
