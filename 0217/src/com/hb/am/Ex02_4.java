package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Ex02_4 extends JFrame {
	public Ex02_4(){
		setTitle("성적");
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
						
		JLabel jl1 = new JLabel("이름:");
		JLabel jl2 = new JLabel("국어:");
		JLabel jl3 = new JLabel("영어:");
		JLabel jl4 = new JLabel("수학:");
		
		JTextField jf1 = new JTextField(4);		
		JTextField jf2 = new JTextField(4);		
		JTextField jf3 = new JTextField(4);		
		JTextField jf4 = new JTextField(4);		
		
		JTextArea ja = new JTextArea(16, 25);
		
		ja.setLineWrap(true);
		
		JScrollPane jsp = new JScrollPane(ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		
		jp1.add(jl1);
		jp1.add(jf1);
		jp2.add(jl2);
		jp2.add(jf2);
		jp2.add(jl3);
		jp2.add(jf3);
		jp2.add(jl4);
		jp2.add(jf4);
		jp2.add(jsp);
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-210, 300, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex02_4();
	}

}
