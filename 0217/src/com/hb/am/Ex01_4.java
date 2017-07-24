package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;

import javax.swing.BoxLayout;
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

public class Ex01_4 extends JFrame {
	public Ex01_4(){
		setTitle("BoxLayout");
		
		// 원래 기본적으로 BorderLayout인 JFrame을 BoxLayout으로 변경
		// BoxLayout에는 콘테이너가 반드시 하나 이상 필요하므로 JPanel을 다시 만들어 준다.
		
		JPanel jp = new JPanel();
		
		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5= new JButton("버튼5");
		JButton jb6 = new JButton("버튼6");
		
		// JPanel의 배치 관리자는 특별히 지정하지 않으면 FlowLayout이 된다.
		// 즉 상단 중앙에 컴포넌트들을 배치한다.
				
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
//		BoxLayout은 x축, y축 일방향으로 컴포넌트를 정렬한다.		
		
//		jp.setLayout(new BoxLayout(jp, BoxLayout.X_AXIS));
		jp.setLayout(new BoxLayout(jp, BoxLayout.Y_AXIS));
		
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_4();
	}
}
