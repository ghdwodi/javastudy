package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		int result = 0;
		ResultSet rs = null;
		try {
			// 1. jdbc 드라이버 로딩
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB 접속
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "insert into hbmember values"
					+ "(hbmember_seq.nextval,"
					+ "'kdko','6789','고길동',55,'제주')";
//			String sql = "select * from hbmember where name = '홍길동'";
			stmt = conn.createStatement();
		
			// insert, update, delete => executeUpdate(sql)사용
			result = stmt.executeUpdate(sql);
			if (result>0){
				System.out.println("삽입성공");
				sql = "select * from hbmember order by idx";
				rs = stmt.executeQuery(sql);
				System.out.println("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
				while(rs.next()){
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\t");
					System.out.print(rs.getInt(5)+"\t");
					System.out.println(rs.getString(6)+"\n");
				}
			} else {
				System.out.println("삽입실패");
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} try {
			
		} finally {
			// TODO: handle finally clause
		}
	}

}
