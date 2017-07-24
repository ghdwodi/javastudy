package com.hb.cm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BookDAO {
	ArrayList<BookVO> bvo = new ArrayList<>();
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet res = null;
	int resInt=0;
	
	public BookDAO() {
		try {
			// 1. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hjlee";
			String password = "23579";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public ArrayList<BookVO> getSelect(){
		
		try {
			String sql = "select * from book order by bookid";
			ptmt = conn.prepareStatement(sql);
			res = ptmt.executeQuery();
			
			while (res.next()){
				BookVO b = new BookVO();
				b.setBookid(res.getInt(1));
				b.setBookname(res.getString(2));
				b.setPublisher(res.getString(3));
				b.setPrice(res.getInt(4));
				bvo.add(b);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				res.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return bvo;
	}
	
	public int getUpdate(int bookid, String bookname, String publisher, int price){
		try {
			String sql = "update book set bookname=?,publisher=?,price=? "
					+ "where bookid=?";
			ptmt = conn.prepareStatement(sql);
			ptmt.setString(1, bookname);
			ptmt.setString(2, publisher);
			ptmt.setInt(3, price);
			ptmt.setInt(4, bookid);
			resInt = ptmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				res.close();
				ptmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return resInt;
	}
}
