package com.hb.am;

import java.io.InputStream;
import java.io.Reader;
import java.math.BigDecimal;
import java.net.URL;
import java.sql.Array;
import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.NClob;
import java.sql.ParameterMetaData;
import java.sql.PreparedStatement;
import java.sql.Ref;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.RowId;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;

public class Quiz_DAO {
	Connection conn = null;
	PreparedStatement ptmt = null;
	ResultSet resSet = null;
	Quiz_VO vo;
	ArrayList<Quiz_VO> qvoList;
	String[] quizItems;
	
	public Quiz_DAO() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public ArrayList<Quiz_VO> selectAll(){
		try {
			String sql = "select * from quiz";
			ptmt = conn.prepareStatement(sql);
			resSet = ptmt.executeQuery();
			
			qvoList = new ArrayList<>();
			while (resSet.next()){
				vo = new Quiz_VO();
				quizItems = new String[4];
				vo.setQuiz_number(resSet.getInt(1));
				vo.setQuiz(resSet.getString(2));
				quizItems[0] = resSet.getString(3);
				quizItems[1] = resSet.getString(4);
				quizItems[2] = resSet.getString(5);
				quizItems[3] = resSet.getString(6);
				vo.setQuiz_items(quizItems);
				vo.setQuiz_answer(resSet.getInt(7));
				qvoList.add(vo);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return qvoList;
	}
	
	public void closeConnect(){
		try {
			resSet.close();
			ptmt.close();
			conn.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
