package com.hb.bm;

//이벤트 : 사용자가 어떠한 행동, 동작을 하는 것을 말함.
//소스 : 이벤트가 발생하는 컴포넌트(버튼, 체크박스, 라디오버튼 등)
//리스너 : 이벤트를 감지, 이벤트가 발생했을 때 실제로 이벤트를 처리할 수 있도록 만든 인터페이스
//핸들러 : 리스너에 포함된 추상 메소드를 재정의하여 리스너에 전달된 이벤트를 실제로 처리하는 기능

//Action Event : 컴포넌트를 누르거나 선택할 때 발생하는 이벤트
//Action Listener : Action Event를 감지
//addActionListener : Action Event를 감지하고 이벤트 객체를 실제로 전달하는 역할

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex03 extends JFrame implements ActionListener {
	JButton jb1,jb2,jb3;	// 전역변수로 만들어야 아래 메소드에서 받아갈 수 있다.
	JTextArea jta;
	JPanel jp1;
	JScrollPane jsp;
	
	public Ex03(){
		setTitle("Action Event2");
		
		jp1 = new JPanel();
				
		jb1 = new JButton("Input");
		jb2 = new JButton("Output");
		jb3 = new JButton("Exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// 이벤트 처리
		
		jb1.addActionListener(this);	// actionPerformed가 있는 클래스의 위치를 입력한다
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		
		if (jb==jb1){
			jta.append("Input 클릭\n");
		} else if (jb==jb2) {
			jta.append("Output 클릭\n");
		} else if (jb==jb3) {
			System.exit(0);;	// 프로그램 종료
		}
	}
}
