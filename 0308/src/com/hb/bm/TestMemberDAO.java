package com.hb.bm;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TestMemberDAO {
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet resSet = null;
	int result = 0;
	
	ArrayList<TestMemberVO> tmvo = new ArrayList<>();
	ArrayList<String> idList = new ArrayList<>();
	
	// 생성자(DB 접속)
	public TestMemberDAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hjlee";
			String password = "23579";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 회원가입
	public int join(String id, String password, String phone){
		try {
			String sql = "insert into testmember "
					+ "values(testseq.nextval,?,?,?)";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, id);
			ptmt.setString(2, password);
			ptmt.setString(3, phone);
			result = ptmt.executeUpdate();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return result;
	}
	
	// id조회
	public ArrayList<String> selectID(){
		try {
			String sql = "select id from testmember";
			ptmt = conn.prepareStatement(sql);
			resSet = ptmt.executeQuery();
			
			while(resSet.next()){
				idList.add(resSet.getString("id"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return idList;
	}
	
	// 전체조회
	public ArrayList<TestMemberVO> select(){
		try {
			String sql = "select * from testmember";
			ptmt = conn.prepareStatement(sql);
			resSet = ptmt.executeQuery();
			
			while(resSet.next()){
				TestMemberVO tm = 
						new TestMemberVO(resSet.getInt(1),
								resSet.getString(2),
								resSet.getString(3),
								resSet.getString(4));
				tmvo.add(tm);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return tmvo;
	}
	
	// DB 닫기
	public void closeConn(){
		try {
			resSet.close();
			ptmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
