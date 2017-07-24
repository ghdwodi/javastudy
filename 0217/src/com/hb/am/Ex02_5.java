package com.hb.am;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import javax.swing.*;

public class Ex02_5 extends JFrame {
	public Ex02_5(){
		setTitle("카페");
		setLayout(new FlowLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
				
		ButtonGroup gb = new ButtonGroup();
		JRadioButton jr1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jr2 = new JRadioButton("카페모카(4000)");
		JRadioButton jr3 = new JRadioButton("카페라떼(3500)");
		JRadioButton jr4 = new JRadioButton("과일쥬스(3000)");

		gb.add(jr1);
		gb.add(jr2);
		gb.add(jr3);
		gb.add(jr4);
				
		JTextField jf1 = new JTextField(10);		
		JTextField jf2 = new JTextField(10);		
		
		JTextArea ja = new JTextArea(15, 40);
		
		ja.setLineWrap(true);
		
		JScrollPane jsp = new JScrollPane(ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		JButton jb1 = new JButton("계산");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.X_AXIS));
		
		
		jp1.add(new JLabel("원하는 커피 선택"));
		jp1.add(jf1);
		jp2.add(jr1);
		jp2.add(jr2);
		jp2.add(jr3);
		jp2.add(jr4);
		jp3.add(new JLabel("수량 :  "));
		jp3.add(jf1);
		jp3.add(new JLabel("         입금액 :  "));
		jp3.add(jf2);
		jp4.add(jsp);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		
		
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		add(jp5);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-225, 500, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex02_5();
	}

}
