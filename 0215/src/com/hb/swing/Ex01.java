package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// 컴포넌트 : 특정한 기능, 또는 관련된 기능을 제공하는 하나의 객체
//		    화면을 구성하는 객체
//		    레이블, 콤보 박스, 리스트, 라디오 버튼, 체크 박스, 컨테이너, etc...
//
// 컨테이너 : 자기의 영역에 컴포넌트를 포함시키고 관리하는 역할을 하며, 다른 컨테이너를 포함시킬 수도 있는 객체
//		   ex) 패널, 다이얼로그, 프레임, 스크롤 페인, etc...
//
// 프레임 : 하나의 창을 뜻한다.
//
// 창의 구조 : 컴퓨터 | 창(프레임) | 패널(컨테이너) | 컴포넌트 | 사람

public class Ex01 extends JFrame {
	public Ex01(){
		// 부모 클래스 JFrame의 생성자
		super("버튼 컴포넌트");
		
		// 컴포넌트
		JButton jb1 = new JButton();
		jb1.setText("첫번째 버튼");
		JButton jb2 = new JButton("두번째 버튼");
		JButton jb3 = new JButton("세번째 버튼");
		JButton jb4 = new JButton("네번째 버튼");
		JButton jb5 = new JButton("다섯번째 버튼");
		
		// 컨테이너
		JPanel jp = new JPanel();
		
		// add 메소드 : 컴포넌트를 컨테이너에 붙인다.
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		// 컴포넌트를 가진 컨테이너를 프레임에 붙인다.
		// 프레임도 컨테이너이므로 컴포넌트를 바로 프레임에 붙일 수도 있다.
		
		add(jp);
//		add(jb1);	// 패널을 통하지 않고 바로 버튼 컴포넌트를 프레임에 붙이면 프레임을 꽉 채우는 버튼 하나만 만들어진다.
//		add(jb2);	// 패널은 복수의 컴포넌트를 배치하는 방식까지 포함하고 있다.
		
		
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
