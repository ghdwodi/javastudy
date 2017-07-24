package com.hb.am;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.sql.Connection;

public class Ex02_JFrame extends JFrame implements ActionListener {
	JPanel[] jp;
	JPanel jpBig;
	JTextField jtID, jtPWD, jtName, jtAge, jtAddr;
	JButton jbTotal, jbInsert, jbDelete, jbIndex, jbUpdate, jbAdjust;
	JTextArea jta;
	JScrollPane jsc;
	Connection conn = null;
	Statement stmt = null;
	ResultSet resSet = null;
	HbMemberVO[] hmvo = new HbMemberVO[5];
	
	public Ex02_JFrame(){
		setTitle("회원관리");
		// 패널 만들기
		jpBig = new JPanel();
		jpBig.setLayout(new BoxLayout(jpBig, BoxLayout.Y_AXIS));
		jp = new JPanel[6];
		for (int i = 0; i < jp.length-1; i++) {
			jp[i] = new JPanel();
			jp[i].setLayout(new FlowLayout(FlowLayout.LEFT));
		}
		jp[5] = new JPanel();
		jp[5].setLayout(new GridLayout(1, 6, 0, 0));
		
		// 텍스트필드
		jtID = new JTextField(20);
		jtPWD = new JTextField(20);
		jtName = new JTextField(20);
		jtAge = new JTextField(20);
		jtAddr = new JTextField(20);
		
		// 버튼
		jbTotal = new JButton("전체보기");
		jbInsert = new JButton("삽입");
		jbDelete = new JButton("삭제");
		jbIndex = new JButton("검색");
		jbUpdate = new JButton("갱신");
		jbAdjust = new JButton("고치기");
		
		// 텍스트에이리어
		jta = new JTextArea(5, 30);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsc = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		// 각 패널에 붙이기
		jp[0].add(new JLabel("ID"));
		jp[0].add(jtID);
		jp[1].add(new JLabel("PWD"));
		jp[1].add(jtPWD);
		jp[2].add(new JLabel("NAME"));
		jp[2].add(jtName);
		jp[3].add(new JLabel("AGE"));
		jp[3].add(jtAge);
		jp[4].add(new JLabel("ADDRESS"));
		jp[4].add(jtAddr);
		jp[5].add(jbTotal);
		jp[5].add(jbInsert);
		jp[5].add(jbDelete);
		jp[5].add(jbIndex);
		jp[5].add(jbUpdate);
		jp[5].add(jbAdjust);
		
		// jpBig에 부착
		for (int i = 0; i < jp.length; i++) {
			jpBig.add(jp[i]);
		} 
		jpBig.add(jsc);
		
		// JFrame 완성
		add(jpBig);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jbTotal.addActionListener(this);
		jbIndex.addActionListener(this);
	}
	
/*	public static void main(String[] args) {
		new Ex02_JFrame();
	}
*/

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();
		if (jb==jbTotal){
			cls();
			connet();
			getSelect();
		} else if (jb==jbIndex){
			jta.setText("");
			connet();
			getSelectOne(jtID.getText().trim());
		}
			
	}
	
	// 화면을 지우는 메소드
	public void cls(){
		jta.setText("");
		jtID.setText("");
		jtPWD.setText("");
		jtName.setText("");
		jtAge.setText("");
		jtAddr.setText("");
	}
	
	// DB 접속하는 메소드
	public void connet(){
		try {
			// 1. jdbc 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			
			// 2. DB접속
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	
	public void getSelect(){
		try {
			// 3. SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from hbmember order by idx";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
			
			// 4. 결과 출력하기
			
			int cnt = 0;
			while (resSet.next()){
				jta.append(resSet.getInt(1)+"\t");
				jta.append(resSet.getString(2)+"\t");
				jta.append(resSet.getString(3)+"\t");
				jta.append(resSet.getString(4)+"\t");
				jta.append(resSet.getInt(5)+"\t");
				jta.append(resSet.getString(6)+"\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// 아이디 가지고 조건 검색
	
	public void getSelectOne(String id){
		try {
			// 3. SQL 작성, 구문 생성, 전송, 결과 받기
			
			String sql = "select * from hbmember where id='"+id+"'";
			stmt = conn.createStatement();
			resSet = stmt.executeQuery(sql);
			jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
			
			// 4. 결과 출력하기
			
			int cnt = 0;
			while (resSet.next()){
				jta.append(resSet.getInt(1)+"\t");
				jta.append(resSet.getString(2)+"\t");
				jta.append(resSet.getString(3)+"\t");
				jta.append(resSet.getString(4)+"\t");
				jta.append(resSet.getInt(5)+"\t");
				jta.append(resSet.getString(6)+"\n");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
