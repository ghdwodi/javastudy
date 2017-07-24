package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07 extends JFrame {
	public Ex07(){
		setTitle("JTextComponent");
		JPanel jp = new JPanel();
		
		// 텍스트 컴포넌트
		
		JLabel jl1 = new JLabel("ID : ");
		JTextField jf1 = new JTextField();
		jf1.setColumns(20);
		jf1.setText("아이디 입력");
		
		JLabel jl2 = new JLabel("PW : ");
		JPasswordField jpf = new JPasswordField("비번입력", 20);
		
		JLabel jl3 = new JLabel("자기소개");
		JTextArea jta = new JTextArea(5, 20);

		// JTextArea에서는 줄바꿈 기능과 스크롤 기능을 무조건 넣는다
		
		// 자동 줄바꿈 기능
		
		jta.setLineWrap(true);
		
		// 스크롤 기능 : 스크롤을 만들어서 설정
		
		JScrollPane jsp = new JScrollPane(jta,	// 스크롤을 설치할 컴포넌트
						ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,	// 세로
						ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER		// 가로
						);
		
		
		jp.add(jl1);
		jp.add(jf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jl3);
		jp.add(jsp);	// jsp에 jta가 이미 들어가 있다
		
		add(jp);

		
		// 기본적인 설정
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
//		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
