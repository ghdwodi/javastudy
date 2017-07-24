package com.hb.am;

import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ex03 extends JFrame {
	public Ex03(){
		setTitle("라디오 버튼");
		
		// 패널 : 컨테이너
		JPanel jp = new JPanel();

		// 라디오 버튼은 반드시 버튼 그룹에 소속되어야 한다.
		ButtonGroup bg = new ButtonGroup();
		
		// 라디오 버튼 컴포넌트
		JRadioButton jrb1 = new JRadioButton("야구");
		JRadioButton jrb2 = new JRadioButton("축구", true);
		JRadioButton jrb3 = new JRadioButton("배구");
		JRadioButton jrb4 = new JRadioButton("농구", true);
		
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		// 컴포넌트를 컨테이너에 부착
		
		jp.add(jrb1);
		jp.add(jrb2);
		jp.add(jrb3);
		jp.add(jrb4);
		
		// 경계선 만들기 : Border, createLineBorder
		//			  TitleBorder, create TitleBorder
		TitledBorder border = BorderFactory.createTitledBorder("좋아하는 운동");
		jp.setBorder(border);
		
		
		
		// 컨테이너를 프레임에 부착
		add(jp);
		
		// 크기와 속성
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
