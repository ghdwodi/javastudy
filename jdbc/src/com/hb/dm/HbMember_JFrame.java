package com.hb.dm;

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
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

import java.sql.Connection;

public class HbMember_JFrame extends JFrame{
	JPanel[] jp;
	JPanel jpBig;
	JTextField jtID, jtPWD, jtName, jtAge, jtAddr;
	JButton jbTotal, jbInsert, jbDelete, jbIndex, jbUpdate, jbAdjust;
	JTextArea jta;
	JScrollPane jsc;
	Connection conn = null;
	Statement stmt = null;
	ResultSet resSet = null;
	HbMemberVO[] hmvo = new HbMemberVO[500];
	
	public HbMember_JFrame(){
		setTitle("ȸ������");
		// �г� �����
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
		
		// �ؽ�Ʈ�ʵ�
		jtID = new JTextField(20);
		jtPWD = new JTextField(20);
		jtName = new JTextField(20);
		jtAge = new JTextField(20);
		jtAddr = new JTextField(20);
		
		// ��ư
		jbTotal = new JButton("��ü����");
		jbInsert = new JButton("����");
		jbDelete = new JButton("����");
		jbIndex = new JButton("�˻�");
		jbUpdate = new JButton("����");
		jbAdjust = new JButton("��ġ��");
		
		// �ؽ�Ʈ���̸���
		jta = new JTextArea(8, 30);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jsc = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		
		// �� �гο� ���̱�
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
		
		// jpBig�� ����
		for (int i = 0; i < jp.length-1; i++) {
			jpBig.add(jp[i]);
		} 
		
		
		// JFrame �ϼ�
		add(jpBig,BorderLayout.NORTH);
		add(jsc,BorderLayout.CENTER);
		add(jp[5],BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-250, 600, 500);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jbTotal.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				cls();
				HbMemberDAO dao = new HbMemberDAO();
				ArrayList<HbMemberVO> hmvo = dao.getSelect();
				jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
				for (HbMemberVO k : hmvo) {
					jta.append(k.getIdx()+"\t");
					jta.append(k.getId()+"\t");
					jta.append(k.getPwd()+"\t");
					jta.append(k.getName()+"\t");
					jta.append(k.getAge()+"\t");
					jta.append(k.getAddr()+"\n");				
				}
			}
		});
		jbIndex.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				HbMemberDAO dao = new HbMemberDAO();
				ArrayList<HbMemberVO> hmvo = dao.getSelectOne(jtID.getText());
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
			}
		});
		jbInsert.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				HbMemberDAO dao = new HbMemberDAO();
				int result = dao.getInsertOne(jtID.getText(),
						jtPWD.getText(),
						jtName.getText(),
						Integer.parseInt(jtAge.getText()),
						jtAddr.getText());
				if (result>0){
					ArrayList<HbMemberVO> hmvo = dao.getSelect();
					jta.append("IDX\tID\tPWD\tNAME\tAGE\tADDR\n");
					for (HbMemberVO k : hmvo) {
						jta.append(k.getIdx()+"\t");
						jta.append(k.getId()+"\t");
						jta.append(k.getPwd()+"\t");
						jta.append(k.getName()+"\t");
						jta.append(k.getAge()+"\t");
						jta.append(k.getAddr()+"\n");
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "���� ����");
				}
				cls();
			}
		});
		jbDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				
				HbMemberDAO dao = new HbMemberDAO();
				int result = dao.getDelete(jtID.getText(), jtPWD.getText());
				if (result>0){
					cls();
					ArrayList<HbMemberVO> hmvo = dao.getSelect();
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
					JOptionPane.showMessageDialog(getParent(), "���� ����");
				}
				cls();
			}
		});
		jbUpdate.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					HbMemberDAO dao = new HbMemberDAO();
					ArrayList<HbMemberVO> hmvo = dao.getSelectOne(jtID.getText());
					jtID.setText(hmvo.get(0).getId());
					jtPWD.setText(hmvo.get(0).getPwd());
					jtName.setText(hmvo.get(0).getName());
					jtAge.setText(String.valueOf(hmvo.get(0).getAge()));
					jtAddr.setText(hmvo.get(0).getAddr());
					
					jbTotal.setEnabled(false);
					jbDelete.setEnabled(false);
					jbIndex.setEnabled(false);
					jbInsert.setEnabled(false);
					jbUpdate.setEnabled(false);
					
					jtID.setEditable(false);
					jtPWD.setEditable(false);
				} catch (Exception e2) {
					JOptionPane.showMessageDialog(getParent(), "���� ����");
				}
				
			}
		});
		jbAdjust.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
				jbTotal.setEnabled(true);
				jbDelete.setEnabled(true);
				jbIndex.setEnabled(true);
				jbInsert.setEnabled(true);
				jbUpdate.setEnabled(true);
				
				jtID.setEditable(true);
				jtPWD.setEditable(true);
				HbMemberDAO dao = new HbMemberDAO();
				int result = dao.getAdjust(jtID.getText(),
						jtPWD.getText(),
						jtName.getText(),
						Integer.parseInt(jtAge.getText()),
						jtAddr.getText());
				if (result>0){
					ArrayList<HbMemberVO> hmvo = dao.getSelect();
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
					JOptionPane.showMessageDialog(getParent(), "���� ����");
				}
				
				cls();
			}
		});
	}
	public void cls(){
		jtID.setText("");
		jtPWD.setText("");
		jtName.setText("");
		jtAge.setText("");
		jtAddr.setText("");
	}
}
