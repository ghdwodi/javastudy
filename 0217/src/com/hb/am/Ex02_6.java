package com.hb.am;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.*;

public class Ex02_6 extends JFrame {
	public Ex02_6(){
		setTitle("°è»ê±â4");
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		
		jp2.setLayout(new GridLayout(5,3,2,2));
								
				
		JTextField jf = new JTextField(15);		
				
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb10 = new JButton("0");
		JButton jb11 = new JButton("+");
		JButton jb12 = new JButton("-");
		JButton jb13 = new JButton("*");
		JButton jb14 = new JButton("/");
		JButton jb15 = new JButton("=");
		
		jp1.add(jf);
		jp2.add(jb1);
		jp2.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		jp2.add(jb6);
		jp2.add(jb7);
		jp2.add(jb8);
		jp2.add(jb9);
		jp2.add(jb10);
		jp2.add(jb11);
		jp2.add(jb12);
		jp2.add(jb13);
		jp2.add(jb14);
		jp2.add(jb15);
		
		
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-90, ds.height/2-120, 180, 240);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);		
	}
	
	public static void main(String[] args) {
		new Ex02_6();
	}

}
