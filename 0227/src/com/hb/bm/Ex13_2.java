package com.hb.bm;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex13_2 extends JFrame{
	JPanel jp1;
	String name;
	public Ex13_2(String name) {
		this.name = name;
		jp1 = new JPanel();
		jp1.add(new JLabel(name+"�� ȯ���մϴ�."));
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 100, ds.height / 2 - 50, 200, 100);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
