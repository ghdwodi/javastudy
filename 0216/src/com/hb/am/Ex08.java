package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class Ex08 extends JFrame {
	public Ex08(){
		setTitle("탭");
		JTabbedPane jtab = new JTabbedPane();
		
		// 탭은 패널 단위로 만든다(각 화면이 다르기 때문)
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		// 탭에 색깔 주기
		
		jp1.setBackground(Color.ORANGE);
		jp2.setBackground(Color.CYAN);
		jp3.setBackground(Color.magenta);
		
		jtab.addTab("오렌지", jp1);
		jtab.addTab("시안", jp2);
		jtab.addTab("마젠타", jp3);
		
		add(jtab);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex08();
	}
}
