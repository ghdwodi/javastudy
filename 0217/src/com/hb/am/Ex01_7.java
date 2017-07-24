package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 배치관리자 (p.448)
// 컴포넌트를 화면에 배치하는 방법 : Layout
// 배치관리자(Layout Manager) <= Layout을 관리
// 배치하는 방법
// 1) FlowLayout : 상단 중앙에 정렬. JPanel 등이 여기에 속한다.
// 2) BorderLayout : 동, 서, 남, 북, 중앙 배치
//					 동, 서, 남, 북, 중앙을 표시하지 않으면 마지막 컴포넌트가 화면을 채운다.
//					 JFrame이 여기에 속한다.
// 3) GridLayout : 격자 형식.
// 4) BoxLayout : 하나의 행, 하나의 열로 만든다.
// 5) 절대좌표 : 각 컴포넌트마다 좌표를 지정해서 배치
// 6) CardLayout : 여러 장의 카드를 쌓아둔 후 하나씩 보여주는 형태.
//				    뒤집어져 있다가 이벤트가 발생하면 하나씩 보여주는 형태.
//

public class Ex01_7 extends JFrame {
	public Ex01_7(){
		setTitle("Absolute");
		
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");
	
//		절대좌표는 각 컴포넌트마다 직접 설정
		
		jp.setLayout(null);
		
		jb1.setBounds(100,5,100,50);	// (100,5)좌표 너비 100, 높이 50의 버튼 생성
		jb2.setBounds(205,5,100,50);	// (205,5)좌표 너비 100, 높이 50의 버튼 생성
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);

		
				
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_7();
	}
}
