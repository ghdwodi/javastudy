package com.hb.bm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// 이벤트 : 사용자가 어떠한 행동, 동작을 하는 것을 말함.
// 소스 : 이벤트가 발생하는 컴포넌트(버튼, 체크박스, 라디오버튼 등)
// 리스너 : 이벤트를 감지, 이벤트가 발생했을 때 실제로 이벤트를 처리할 수 있도록 만든 인터페이스
// 핸들러 : 리스너에 포함된 추상 메소드를 재정의하여 리스너에 전달된 이벤트를 실제로 처리하는 기능

// Action Event : 컴포넌트를 누르거나 선택할 때 발생하는 이벤트
// Action Listener : Action Event를 감지
// addActionListener : Action Event를 감지하고 이벤트 객체를 실제로 전달하는 역할

public class Ex01 extends JFrame /*implements ActionListener*/{
	
	JButton jb1,jb2,jb3;	// 전역변수로 만들어야 아래 메소드에서 받아갈 수 있다.
	
	public Ex01(){
		setTitle("Action Event");
		
		JPanel jp1 = new JPanel();
		jb1 = new JButton("Input");
		jb2 = new JButton("Output");
		jb3 = new JButton("Exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		/*jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);*/
		
		Ex02 test = new Ex02();
		jb1.addActionListener(test);
		jb2.addActionListener(test);
		jb3.addActionListener(test);
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
	
	//@Override	// 이벤트가 발생하면 실행할 메소드
	/*public void actionPerformed(ActionEvent e) {
//		System.out.println("버튼을 눌렀네");
	
		// 이벤트 발생 대상 찾기
		// getActionCommand() <= 이벤트 대상의 text를 알려 준다
		String msg = e.getActionCommand();
		
		if(msg.equals(jb1.getText())){
			System.out.println("Input 눌렀네");
		} else if (msg.equals(jb2.getText())){
			System.out.println("Output 눌렀네");
		} else if (msg.equals(jb3.getText())){
			System.out.println("Exit 눌렀네");
		}
	}*/
}

class Ex02 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// 방법1		
//		String msg = e.getActionCommand();
		
		// 방법 2 : Object를 JButton으로 바꾼 뒤 String으로 가지고 옴
		String msg = ((JButton)(e.getSource())).getText();
		
		// 방법 3 : Object를 JButton으로 바꾼 뒤 직접 원본 JButton과 비교
		//		   이 방법은 원본 JButton이 있는 클래스 내에서 사용해야 한다.
//		JButton jb = (JButton)(e.getSource());
//		if(jb==jb1){
//			System.out.println("Input 눌렀네");
//		} else if (jb==jb2){
//			System.out.println("Output 눌렀네");
//		} else if (jb==jb3){
//			System.out.println("Exit 눌렀네");
//		}
		
		System.out.println(msg+" 눌렀네");
	}
	
}
