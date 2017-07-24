package com.hb.am;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex01 extends JFrame implements ActionListener, KeyListener {
	JPanel jp1,jp2,jp3;
	JButton jbScissors, jbRock, jbPaper;
	JTextField jtQuestion, jtResult;
	public Ex01(){
		setTitle("���� ���� ��");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp1.setLayout(new BorderLayout());
		jp3.setLayout(new BorderLayout());
		jp2.setLayout(new GridLayout(1, 3, 0, 0));
		jbScissors = new JButton("����");
		jbRock = new JButton("����");
		jbPaper = new JButton("��");
		jtQuestion = new JTextField("�Ʒ��� ��ư �� �ϳ��� Ŭ���Ͻÿ�");
		jtResult = new JTextField(20);
		jtQuestion.setEditable(false);
		jtResult.setEditable(false);
		
		jp1.add(jtQuestion);
		jp2.add(jbScissors);
		jp2.add(jbRock);
		jp2.add(jbPaper);
		jp3.add(jtResult);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-90, 300, 180);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		jbScissors.addActionListener(this);
		jbRock.addActionListener(this);
		jbPaper.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int com = (int)(Math.random()*3);	// 0:����, 1:����, 2:��
		JButton user = (JButton)e.getSource();
		String msg = "";
		String computer = "";
		String human = "";
		if (user==jbScissors){
			human = "����";
			if (com==0){
				computer = "����";
				msg = "���";
			} else if (com==1){
				computer = "����";
				msg = "��";
			} else if (com==2){
				computer = "��";
				msg = "�̱�";
			}
		} else if (user==jbRock){
			human = "����";
			if (com==0){
				computer = "����";
				msg = "�̱�";
			} else if (com==1){
				computer = "����";
				msg = "���";
			} else if (com==2){
				computer = "��";
				msg = "��";
			}
		} else if (user==jbPaper){
			human = "��";
			if (com==0){
				computer = "����";
				msg = "��";
			} else if (com==1){
				computer = "����";
				msg = "�̱�";
			} else if (com==2){
				computer = "����";
				msg = "���";
			}
		}
		String res = ("��� : <"+human+"> ��ǻ�� : <"+computer+"> ��� : <"+msg+">");
		jtResult.setText("");
		jtResult.setText(res);
	}

}
