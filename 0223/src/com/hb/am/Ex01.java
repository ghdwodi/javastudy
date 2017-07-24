package com.hb.am;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex01 extends JFrame implements ActionListener, KeyListener {
	JPanel jp1,jp2,jp3;
	JButton jbScissors, jbRock, jbPaper;
	JTextField jtQuestion, jtResult;
	public Ex01(){
		setTitle("가위 바위 보");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp1.setLayout(new BorderLayout());
		jp3.setLayout(new BorderLayout());
		jp2.setLayout(new GridLayout(1, 3, 0, 0));
		jbScissors = new JButton("가위");
		jbRock = new JButton("바위");
		jbPaper = new JButton("보");
		jtQuestion = new JTextField("아래의 버튼 중 하나를 클릭하시오");
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
		int com = (int)(Math.random()*3);	// 0:가위, 1:바위, 2:보
		JButton user = (JButton)e.getSource();
		String msg = "";
		String computer = "";
		String human = "";
		if (user==jbScissors){
			human = "가위";
			if (com==0){
				computer = "가위";
				msg = "비김";
			} else if (com==1){
				computer = "바위";
				msg = "짐";
			} else if (com==2){
				computer = "보";
				msg = "이김";
			}
		} else if (user==jbRock){
			human = "바위";
			if (com==0){
				computer = "가위";
				msg = "이김";
			} else if (com==1){
				computer = "바위";
				msg = "비김";
			} else if (com==2){
				computer = "보";
				msg = "짐";
			}
		} else if (user==jbPaper){
			human = "보";
			if (com==0){
				computer = "가위";
				msg = "짐";
			} else if (com==1){
				computer = "바위";
				msg = "이김";
			} else if (com==2){
				computer = "보위";
				msg = "비김";
			}
		}
		String res = ("당신 : <"+human+"> 컴퓨터 : <"+computer+"> 결과 : <"+msg+">");
		jtResult.setText("");
		jtResult.setText(res);
	}

}
