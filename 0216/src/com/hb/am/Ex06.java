package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Ex06 extends JFrame {
	public Ex06(){
		super("리스트");
		JPanel jp = new JPanel();
		
		// 리스트 컴포넌트
		
		String[] items = {"좋아하는 운동","축구","배구","야구","농구"};
		
		JList jl = new JList(items);
		
		jp.add(jl);
		
		add(jp);
		
		// 특정 항목을 먼저 선택하는 방법
		
		jl.setSelectedIndex(0);	// 배열의 index값을 조회
		
		// 기본적인 설정
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
