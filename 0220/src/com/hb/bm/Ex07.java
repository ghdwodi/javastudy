package com.hb.bm;

//이벤트 : 사용자가 어떠한 행동, 동작을 하는 것을 말함.
//소스 : 이벤트가 발생하는 컴포넌트(버튼, 체크박스, 라디오버튼 등)
//리스너 : 이벤트를 감지, 이벤트가 발생했을 때 실제로 이벤트를 처리할 수 있도록 만든 인터페이스
//핸들러 : 리스너에 포함된 추상 메소드를 재정의하여 리스너에 전달된 이벤트를 실제로 처리하는 기능

//Action Event : 컴포넌트를 누르거나 선택할 때 발생하는 이벤트
//Action Listener : Action Event를 감지
//addActionListener : Action Event를 감지하고 이벤트 객체를 실제로 전달하는 역할

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//라디오버튼, 체크박스, 콤보박스 => ItemListener를 사용하는 것이 정석이다.
//버튼 => ActionListener를 사용하는 것이 정석이다.
//ItemListner와 ActionListener는 둘 다 인터페이스이므로 다중상속이 가능하다.

public class Ex07 extends JFrame implements ActionListener, ItemListener {
	JToggleButton jt1,jt2,jt3,jt4;	// 전역변수로 만들어야 아래 메소드에서 받아갈 수 있다.
	JButton jb;
	JTextArea jta;
	JPanel jpb,jp1,jp2,jp3;
	JScrollPane jsp;
	
	public Ex07(){
		setTitle("토글버튼(Action)");
		jpb = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		// 1번 패널 : 토글버튼
		jt1 = new JToggleButton("축구");
		jt2 = new JToggleButton("야구");
		jt3 = new JToggleButton("농구");
		jt4 = new JToggleButton("배구");
		
		jp1.add(jt1);
		jp1.add(jt2);
		jp1.add(jt3);
		jp1.add(jt4);
		
		// 2번 패널 : 종료 버튼
		jb = new JButton("exit");
		
		jp2.add(jb);
		
		// 3번 패널 : 결과창
		jta = new JTextArea(8, 25);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		jp3.add(jsp);
		
		// 빅 패널 : 패널 1~3 부착
		
		jpb.add(jp1);
		jpb.add(jp2);
		jpb.add(jp3);
		
		// 프레임에 빅 패널 부착
		
		add(jpb);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(this);
		jt1.addItemListener(this);
		jt2.addItemListener(this);
		jt3.addItemListener(this);
		jt4.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JToggleButton jtb = (JToggleButton)(e.getItem());
		// TODO Auto-generated method stub
		if (e.getStateChange() == e.SELECTED){
			jta.append(jtb.getText()+" 선택\n");
			
		} else if (e.getStateChange() == e.DESELECTED){
			jta.append(jtb.getText()+" 해제\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
