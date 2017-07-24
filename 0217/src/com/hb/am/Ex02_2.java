package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.*;

public class Ex02_2 extends JFrame {
	public Ex02_2(){
		setTitle("계산기 2");
		JPanel jp = new JPanel();
		
		
		JLabel jl1 = new JLabel("수1:");
		JLabel jl2 = new JLabel("수2:");
		JLabel jl3 = new JLabel("연산자:");
		
		JTextField jf1 = new JTextField(4);		
		JTextField jf2 = new JTextField(4);	

		// ※ 라디오버튼은 반드시 버튼그룹을 만들어 줘야 중복선택이 되지 않는다는 점에 주의!
		ButtonGroup bg = new ButtonGroup();
		
		JRadioButton jr1 = new JRadioButton("+");
		JRadioButton jr2 = new JRadioButton("-");
		JRadioButton jr3 = new JRadioButton("*");
		JRadioButton jr4 = new JRadioButton("/");
		
		bg.add(jr1);
		bg.add(jr2);
		bg.add(jr3);
		bg.add(jr4);
		
		JTextArea ja = new JTextArea(16, 35);
		
		ja.setLineWrap(true);
		
		JScrollPane jsp = new JScrollPane(ja,
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
		// ButtonGroup은 컴포넌트가 아니므로 add를 이용해 붙일 수 없다.
		jp.add(jr1);
		jp.add(jr2);
		jp.add(jr3);
		jp.add(jr4);
		jp.add(jsp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex02_2();
	}

}
