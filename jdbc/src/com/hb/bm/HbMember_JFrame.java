package com.hb.bm;

import java.awt.BorderLayout;
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

public class HbMember_JFrame extends JFrame implements ActionListener {
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
	
	public HbMember_JFrame(){
		setTitle("회원관리");
		// 패널 만들기
		jpBig = new JPanel();
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
		jta = new JTextArea(8, 30);
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
		for (int i = 0; i < jp.length-1; i++) {
			jpBig.add(jp[i]);
		} 
		
		
		// JFrame 완성
		add(jpBig,BorderLayout.NORTH);
		add(jsc,BorderLayout.CENTER);
		add(jp[5],BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbTotal.addActionListener(this);
		jbIndex.addActionListener(this);
		jbInsert.addActionListener(this);
		jbDelete.addActionListener(this);
		jbUpdate.addActionListener(this);
		jbAdjust.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if (jb==jbTotal){
			jta.setText("");
			HbMemberDAO dao = new HbMemberDAO();
			HbMemberVO[] hmvo = dao.getSelect();
			jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
			for (HbMemberVO k : hmvo) {
				jta.append(k.getIdx()+"\t");
				jta.append(k.getId()+"\t");
				jta.append(k.getPwd()+"\t");
				jta.append(k.getName()+"\t");
				jta.append(k.getAge()+"\t");
				jta.append(k.getAddr()+"\n");				
			}
			cls();
		} else if (jb==jbIndex){
			jta.setText("");
			HbMemberDAO dao = new HbMemberDAO();
			HbMemberVO[] hmvo = dao.getSelectOne(jtID.getText());
			jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
			/*jta.append(hmvo[0].getIdx()+"\t");
			jta.append(hmvo[0].getId()+"\t");
			jta.append(hmvo[0].getPwd()+"\t");
			jta.append(hmvo[0].getName()+"\t");
			jta.append(hmvo[0].getAge()+"\t");
			jta.append(hmvo[0].getAddr()+"\n");*/
			for (HbMemberVO k : hmvo) {			
				jta.append(k.getIdx()+"\t");
				jta.append(k.getId()+"\t");
				jta.append(k.getPwd()+"\t");
				jta.append(k.getName()+"\t");
				jta.append(k.getAge()+"\t");
				jta.append(k.getAddr()+"\n");
			}
			cls();
//			jtID.setText("");
		} else if (jb==jbInsert){
			jta.setText("");
			HbMemberDAO dao = new HbMemberDAO();
			int result = dao.getInsertOne(jtID.getText(),
					jtPWD.getText(),
					jtName.getText(),
					jtAge.getText(),
					jtAddr.getText());
			if (result>0){
				jta.append("삽입성공\n");
				HbMemberVO[] hmvo = dao.getSelect();
				jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
				for (HbMemberVO k : hmvo) {
					jta.append(k.getIdx()+"\t");
					jta.append(k.getId()+"\t");
					jta.append(k.getPwd()+"\t");
					jta.append(k.getName()+"\t");
					jta.append(k.getAge()+"\t");
					jta.append(k.getAddr()+"\n");
				}
				cls();
			} else {
				jta.append("삽입실패");
			}
		} else if (jb==jbDelete){
			jta.setText("");
			
			HbMemberDAO dao = new HbMemberDAO();
			int result = dao.getDelete(jtID.getText());
			if (result>0){
				cls();
				jta.append("삭제성공\n");
				HbMemberVO[] hmvo = dao.getSelect();
				jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
				for (HbMemberVO k : hmvo) {
					jta.append(k.getIdx()+"\t");
					jta.append(k.getId()+"\t");
					jta.append(k.getPwd()+"\t");
					jta.append(k.getName()+"\t");
					jta.append(k.getAge()+"\t");
					jta.append(k.getAddr()+"\n");				
				}
				
			}else {
				jta.append("삭제실패");
			} 
		} else if (jb==jbUpdate){
			HbMemberDAO dao = new HbMemberDAO();
			HbMemberVO[] hmvo = dao.getSelectOne(jtID.getText());
			jtID.setText(hmvo[0].getId());
			jtPWD.setText(hmvo[0].getPwd());
			jtName.setText(hmvo[0].getName());
			jtAge.setText(hmvo[0].getAge()+"");
			jtAddr.setText(hmvo[0].getAddr());
			
		} else if (jb==jbAdjust){
			jta.setText("");
			HbMemberDAO dao = new HbMemberDAO();
			int result = dao.getAdjust(jtID.getText(),
					jtPWD.getText(),
					jtName.getText(),
					jtAge.getText(),
					jtAddr.getText());
			if (result>0){
				jta.append("수정성공\n");
				HbMemberVO[] hmvo = dao.getSelect();
				jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
				for (HbMemberVO k : hmvo) {
					jta.append(k.getIdx()+"\t");
					jta.append(k.getId()+"\t");
					jta.append(k.getPwd()+"\t");
					jta.append(k.getName()+"\t");
					jta.append(k.getAge()+"\t");
					jta.append(k.getAddr()+"\n");				
				}
				cls();
			}else {
				jta.append("수정실패");
			} 
		}
	}
	public void cls(){
		jtID.setText("");
		jtPWD.setText("");
		jtName.setText("");
		jtAge.setText("");
		jtAddr.setText("");
	}
}
