package com.hb.bm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class HbMemberDAO {
	HbMemberVO[] hmvo = new HbMemberVO[500];
	Connection conn = null;
	Statement stmt = null;
	int result = 0;
	ResultSet resSet = null;
	
	// ������(DB ����)
	public HbMemberDAO() {
		try {
			// 1. jdbc ����̹� �ε�
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// ���̺� ���� ��������
	public HbMemberVO[] getSelect(){
		try{
			// SQL �ۼ�, ���� ����, ����, ��� �ޱ�
			
			String sql = "select * from hbmember order by idx";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			
			// 4. ��� �����ϱ�
			
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
			System.out.println(e);
		} finally {
			try {
				resSet.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return hmvo;
		
	}
	
	public HbMemberVO[] getSelectOne(String id){
		try {
			// SQL �ۼ�, ���� ����, ����, ��� �ޱ�
			
			String sql = "select * from hbmember where id='"+id+"'";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			
			// 4. ��� �����ϱ�
			
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
			System.out.println(e);
		} finally {
			try {
				resSet.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return hmvo;
	}
	
	public int getInsertOne(
			String id, String pwd, String name, String age, String addr){
		try {
			// SQL �ۼ�, ���� ����, ����, ��� �ޱ�
			
			String sql = "insert into hbmember values"
					+ "(hbmember_seq.nextval,'"
					+id+ "','"+pwd+"','"+name+"',"+age+",'"+addr+"')";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e){
			System.out.println(e);
		} finally {
			try {
				resSet.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return result;
	}
	
	public int getDelete(String id){
		try {
			// SQL �ۼ�, ���� ����, ����, ��� �ޱ�
			
			String sql = "delete from hbmember where id='"+id+"'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e){
			System.out.println(e);
		} finally {
			try {
				resSet.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return result;
	}

	
	public int getAdjust(
			String id, String pwd, String name, String age, String addr){
		try {
			// SQL �ۼ�, ���� ����, ����, ��� �ޱ�
			
			String sql = "update hbmember set "
					+ "pwd='"+pwd+"',"
					+ "name='"+name+"',"
					+ "age="+age+","
					+ "addr='"+addr+"'"
					+ "where id ='"+id+"'";
		
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
		} catch (Exception e){
			System.out.println(e);
		} finally {
			try {
				resSet.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return result;
	}
		
}
