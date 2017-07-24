package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_select {
	public static void main(String[] args) {
		// ����Ŭ�� �ڹٸ� �����ϴ� �͵�
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// try-catch������ DB�� ���̺��� �ҷ��´�.
		// try-catch���� �⺻ ���´� �Ʒ��� ����.
		
		try {
			// 1. jdbc ����̹� �ε�
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB ����
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. SQL �ۼ�, ���� ����, ����, ��� �ޱ�
			
			String sql = "select * from member";
			stmt = conn.createStatement();
			// select���� executeQuery() ���
			// insert, delete, update >= exucuteUpdate() ��� : ��� => int
			rs = stmt.executeQuery(sql);
			
			// 4. ��� ����
			// rs.get�ڷ��� <- DB������� �����ϴ� ���� �ڷ���
			// ����� �迭�� �����Ϸ��� ���
			// �����͸� ������ Ŭ������ �ش� DB�� �÷��� ����
			// Ŭ������ �� �迭�� �ڷ����̴�.
			
			MemberVO[] mvo = new MemberVO[6];
			int cnt = 0;	// �迭�� index��
			while (rs.next()){
/*				System.out.print(rs.getInt("idx")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getInt("age")+"\t");
				System.out.print(rs.getString("addr")+"\t");
				System.out.println(rs.getString("class")+"\t");
*/
/*				System.out.print(rs.getInt(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getInt(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.println(rs.getString(5));
*/
				MemberVO k = new MemberVO();
				k.setIdx(rs.getInt(1));
				k.setName(rs.getString(2));
				k.setAge(rs.getInt(3));
				k.setAddr(rs.getString(4));
				k.setClas(rs.getString(5));
				mvo[cnt] = k;
				cnt++;
			}
			// �迭�� ����� ����
			for (MemberVO k : mvo) {
				System.out.print(k.getIdx()+"\t");
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getAddr()+"\t");
				System.out.println(k.getClas());
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				if(rs != null) rs.close();
				if(stmt != null) stmt.close();
				if(conn != null) conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
