package com.hb.am;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_select {
	public static void main(String[] args) {
		// 오라클과 자바를 연결하는 것들
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		// try-catch문으로 DB의 테이블을 불러온다.
		// try-catch문의 기본 형태는 아래와 같다.
		
		try {
			// 1. jdbc 드라이버 로딩
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB 접속
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// 3. SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from member";
			stmt = conn.createStatement();
			// select문은 executeQuery() 사용
			// insert, delete, update >= exucuteUpdate() 사용 : 결과 => int
			rs = stmt.executeQuery(sql);
			
			// 4. 결과 보기
			// rs.get자료형 <- DB순서대로 존재하는 열의 자료형
			// 결과를 배열에 저장하려는 경우
			// 데이터를 저장할 클래스는 해당 DB의 컬럼과 같다
			// 클래스가 곧 배열의 자료형이다.
			
			MemberVO[] mvo = new MemberVO[6];
			int cnt = 0;	// 배열의 index값
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
			// 배열을 출력해 보자
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
