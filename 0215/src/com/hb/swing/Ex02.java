package com.hb.swing;

import javax.swing.*;

public class Ex02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("버튼 컴포넌트2");
		
		// 버튼 컴포넌트
		
		JButton jb1 = new JButton("1번");
		JButton jb2 = new JButton("2번");
		JButton jb3 = new JButton("3번");
		JButton jb4 = new JButton("4번");
		JButton jb5 = new JButton("5번");
		
		// 패널
		
		JPanel jp = new JPanel();
		
		// 패널에 컴포넌트 부착
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		// 프레임에 패널 부착
		
		jf.add(jp);
		
		jf.setSize(300, 300);
		jf.setLocation(0, 0);
		jf.setVisible(true);
	}
}
