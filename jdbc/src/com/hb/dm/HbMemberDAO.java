package com.hb.dm;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


public class HbMemberDAO {
//	HbMemberVO[] hmvo = new HbMemberVO[500];
	ArrayList<HbMemberVO> hmvo = new ArrayList<>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	int result = 0;
	ResultSet resSet = null;
	
	// 생성자(DB 접속)
	public HbMemberDAO() {
		try {
			// 1. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
		}
	}
	
	// 테이블 전부 가져오기
	public ArrayList<HbMemberVO> getSelect(){
		try{
			// SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from hbmember order by idx";
			ptmt = conn.prepareStatement(sql);
			resSet = ptmt.executeQuery();
			
			// 4. 결과 저장하기
			
			while (resSet.next()){
				HbMemberVO k = new HbMemberVO();
				k.setIdx(resSet.getInt(1));
				k.setId(resSet.getString(2));
				k.setPwd(resSet.getString(3));
				k.setName(resSet.getString(4));
				k.setAge(resSet.getInt(5));
				k.setAddr(resSet.getString(6));
				hmvo.add(k);
//				hmvo[cnt] = k;
//				cnt++;
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				resSet.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return hmvo;
		
	}
	
	public ArrayList<HbMemberVO> getSelectOne(String id){
		try {
			// SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from hbmember where id=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, id);
			resSet = ptmt.executeQuery();
			
			// 4. 결과 저장하기
			
			while (resSet.next()){
				HbMemberVO k = new HbMemberVO();
				k.setIdx(resSet.getInt(1));
				k.setId(resSet.getString(2));
				k.setPwd(resSet.getString(3));
				k.setName(resSet.getString(4));
				k.setAge(resSet.getInt(5));
				k.setAddr(resSet.getString(6));
				hmvo.add(k);
//				hmvo[cnt] = k;
//				cnt++;
			}
		} catch (Exception e) {
		} finally {
			try {
				resSet.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return hmvo;
	}
	
	public int getInsertOne(
			String id, String pwd, String name, int age, String addr){
		try {
			// SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "insert into hbmember values"
					+ "(hbmember_seq.nextval,?,?,?,?,?)";
			ptmt = conn.prepareStatement(sql);
			
			// ?(동적 바인딩 변수) 처리하기 : 쿼리를 보내기 전에 처리한다.
			ptmt.setString(1, id);
			ptmt.setString(2, pwd);
			ptmt.setString(3, name);
			ptmt.setInt(4, age);
			ptmt.setString(5, addr);
			
			result = ptmt.executeUpdate();
		} catch (Exception e){
		} finally {
			try {
				resSet.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}
	
	public int getDelete(String id, String pwd){
		try {
			// SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "delete from hbmember where id=? and pwd=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, pwd);
			result = ptmt.executeUpdate();
		} catch (Exception e){
		} finally {
			try {
				resSet.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}

	
	public int getAdjust(
			String id, String pwd, String name, int age, String addr){
		try {
			// SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "update hbmember set name=?,age=?,addr=?"
					+ "where id =? and pwd=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, name);
			ptmt.setInt(2, age);
			ptmt.setString(3, addr);
			ptmt.setString(4, id);
			ptmt.setString(5, pwd);
			result = ptmt.executeUpdate();
		} catch (Exception e){
			
		} finally {
			try {
				resSet.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		return result;
	}
		
}
