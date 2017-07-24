package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex01 extends JFrame {
	public Ex01(){
		setTitle("화면에 난수 발생");
		
		JPanel jp1 = new JPanel();
		JLabel[] labels = new JLabel[50];
		
		jp1.setLayout(null);
		jp1.setBackground(Color.YELLOW);
		
		for(int i=0;i<labels.length;i++){
			labels[i] = new JLabel((i+1)+"");
			int x = (int)(Math.random()*280);
			int y = (int)(Math.random()*280);
			
			labels[i].setForeground(Color.blue);
			
			labels[i].setLocation(x, y);
			labels[i].setSize(15, 15);
			jp1.add(labels[i]);
		}
		
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);	
	}
	public static void main(String[] args) {
		new Ex01();
	}
}
