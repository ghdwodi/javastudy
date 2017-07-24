package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Ex02_1 extends JFrame {
	public Ex02_1(){
		setTitle("계산기 1");
		JPanel jp = new JPanel();
		
		
		JLabel jl1 = new JLabel("수1:");
		JLabel jl2 = new JLabel("수2:");
		JLabel jl3 = new JLabel("연산자:");
		
		JTextField jf1 = new JTextField(4);		
		JTextField jf2 = new JTextField(4);		
		JTextField jf3 = new JTextField(4);		
		
		JTextArea ja = new JTextArea(16, 25);
		
		ja.setLineWrap(true);	// 자동 줄바꿈
		ja.setEditable(false);	// ja는 결과창이므로 편집이 불가능하도록 처리.
		
		JScrollPane jsp = new JScrollPane(	// 스크롤바 처리
				ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
						
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		
		jp.add(jl1);
		jp.add(jf1);
		jp.add(jl2);
		jp.add(jf2);
		jp.add(jl3);
		jp.add(jf3);

//		jp.add(new JLabel("수1:"));		// JLabel은 다시 호출할 일이 없으므로 이렇게 1회용으로 선언해주어도 된다.
//		jp.add(jf1);
//		jp.add(new JLabel("수2:"));
//		jp.add(jf2);
//		jp.add(new JLabel("연산자:"));
//		jp.add(jf3);		
		
		jp.add(jsp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex02_1();
	}

}
