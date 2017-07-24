package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ex02 extends JFrame{
	public Ex02(){
		setTitle("피자 주문판");
		
		JPanel jp1 = new JPanel();	// "자바 피자에 오신 것을 환영합니다
		JPanel jp2 = new JPanel();	// 종류 : 콤보, 포테이토, 불고기 (라디오버튼 수직정렬)
		JPanel jp3 = new JPanel();	// 추가토핑 : 피망, 치즈, 페퍼로니, 베이컨 (라디오버튼 수직정렬)
		JPanel jp4 = new JPanel();	// 크기 : small, medium, large (라디오버튼 수직정렬)
		JPanel jp5 = new JPanel();	// 주문, 취소, [] (버튼 2개, 텍스트프레임)
		
		/*jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.Y_AXIS));*/
		
		jp2.setLayout(new GridLayout(3, 1));
		jp3.setLayout(new GridLayout(4, 1));
		jp4.setLayout(new GridLayout(3, 1));
		
		// 각 패널 제목
		
		jp2.setBorder(new TitledBorder(BorderFactory.createTitledBorder("종류")));
		jp3.setBorder(new TitledBorder(BorderFactory.createTitledBorder("추가토핑")));
		jp4.setBorder(new TitledBorder(BorderFactory.createTitledBorder("크기")));
		
		// 라디오버튼 버튼그룹 설정
		
		ButtonGroup gb1 = new ButtonGroup();
		ButtonGroup gb2 = new ButtonGroup();
		ButtonGroup gb3 = new ButtonGroup();
		
		// 라디오버튼
		
		JRadioButton jr1 = new JRadioButton("콤보",true);
		JRadioButton jr2 = new JRadioButton("포테이토");
		JRadioButton jr3 = new JRadioButton("불고기");
		
		gb1.add(jr1);		
		gb1.add(jr2);		
		gb1.add(jr3);
		
		JRadioButton jr4 = new JRadioButton("피망",true);
		JRadioButton jr5 = new JRadioButton("치즈");
		JRadioButton jr6 = new JRadioButton("페퍼로니");
		JRadioButton jr7 = new JRadioButton("베이컨");
		
		gb2.add(jr4);
		gb2.add(jr5);
		gb2.add(jr6);
		gb2.add(jr7);
		
		JRadioButton jr8 = new JRadioButton("Small",true);
		JRadioButton jr9 = new JRadioButton("Medium");
		JRadioButton jr10 = new JRadioButton("Large");
		
		gb3.add(jr8);
		gb3.add(jr9);
		gb3.add(jr10);
		
		// 버튼, 텍스트프레임
		
		JButton jb1 = new JButton("주문");
		JButton jb2 = new JButton("취소");
		JTextField jf = new JTextField(10);
		jf.setEditable(false);
		
		// 각 패널에 부착
		
		jp1.add(new JLabel("자바 피자에 오신 것을 환영합니다."));
		jp2.add(jr1);
		jp2.add(jr2);
		jp2.add(jr3);
		jp3.add(jr4);
		jp3.add(jr5);
		jp3.add(jr6);
		jp3.add(jr7);
		jp4.add(jr8);
		jp4.add(jr9);
		jp4.add(jr10);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jf);
		
		// 프레임에 부착
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.WEST);
		add(jp3,BorderLayout.CENTER);
		add(jp4,BorderLayout.EAST);
		add(jp5,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-220, ds.height/2-160, 400, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
