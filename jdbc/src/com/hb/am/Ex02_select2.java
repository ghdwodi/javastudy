package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02_select2 {
	public static void main(String[] args) {
		HbMemberVO[] hmvo = new HbMemberVO[5];
		// ����Ŭ�� �ڹٸ� �����ϴ� �͵�
		Connection conn = null;
		Statement stmt = null;
		ResultSet resSet = null;
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
			
			String sql = "select * from hbmember where id = 'hongkd' and pwd = '11234'";
//			String sql = "select * from hbmember where name = 'ȫ�浿'";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			
			// 4. ��� �����ϱ�
			
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
				System.out.println("�α��� ����.");
				System.out.println("ID�� �н����带 �ٽ� �Է��Ͻÿ�.");
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