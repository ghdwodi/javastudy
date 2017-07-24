package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Ex05 extends JFrame {
	public Ex05(){
		super("콤보 박스(드롭-다운 버튼)");
		JPanel jp = new JPanel();
		
		// 콤보 박스 컴포넌트
		
		String[] items = {"좋아하는 운동","축구","배구","야구","농구"};
		
		JComboBox jcb = new JComboBox(items);
		
		jp.add(jcb);
		
		add(jp);
		
		// 특정 항목을 먼저 나오게 하는 방법
		
//		jcb.setSelectedItem("배구");
		jcb.setSelectedIndex(2);	// 배열의 index값을 조회
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex05();
	}
}
