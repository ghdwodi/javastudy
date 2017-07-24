package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ex09 extends JFrame {
	public Ex09(){
		setTitle("��2");
		JTabbedPane jtab = new JTabbedPane();
		
		Ex09_1 test1 = new Ex09_1();
		test1.setBackground(Color.blue);
		Ex09_2 test2 = new Ex09_2();
		test2.setBackground(Color.red);
		Ex09_3 test3 = new Ex09_3();
		test3.setBackground(Color.green);
		
		jtab.addTab("�Ķ�+��۹�ư", test1);
		jtab.addTab("����", test2);
		jtab.addTab("�ʷ�", test3);
		
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex09();
	}
}
