package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		int result = 0;
		ResultSet rs = null;
		try {
			// 1. jdbc ����̹� �ε�
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB ����
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// sql ����
			
			String sql = "delete from hbmember where idx > 5";
			
			// ���� ����
			
			stmt = conn.createStatement();
			
			result = stmt.executeUpdate(sql);
			
			if(result>0){
				System.out.println("��������");
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
				System.out.println("��������");
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
