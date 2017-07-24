package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_main extends JFrame implements ActionListener {
	JPanel jpMain;
	JButton jbJoin,jbLogin;
	String name = "hanbit";
	public Ex06_main() {
		jpMain = new JPanel();
		jbJoin = new JButton("회원가입");
		jbLogin = new JButton("로그인");
		
		jpMain.add(jbJoin);
		jpMain.add(jbLogin);
		
		add(jpMain);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jbJoin.addActionListener(this);
		jbLogin.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex06_main();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		if(jb==jbJoin){
			new Ex06_1();
		}else if(jb==jbLogin){
			new Ex06_2();
		}
	}
	

}
