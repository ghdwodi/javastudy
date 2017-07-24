package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.Activator;

import javax.swing.*;

public class Ex01 extends JFrame implements ActionListener {
	JPanel jp;
	JLabel jl1,jl2,jl3;
	JTextField jf1,jf2,jf3;
	JTextArea ja;
	JScrollPane jsp;
	JButton jb1,jb2,jb3;
	public Ex01(){
		setTitle("계산기 1");
		jp = new JPanel();
				
		jl1 = new JLabel("수1:");
		jl2 = new JLabel("수2:");
		jl3 = new JLabel("연산자:");
		
		jf1 = new JTextField(4);		
		jf2 = new JTextField(4);		
		jf3 = new JTextField(4);		
		
		ja = new JTextArea(16, 25);
		
		ja.setLineWrap(true);	// 자동 줄바꿈
		ja.setEditable(false);	// ja는 결과창이므로 편집이 불가능하도록 처리.
		
		jsp = new JScrollPane(	// 스크롤바 처리
				ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
						
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("취소");
		
		
		jp.add(jl1);
		jp.add(jf1);
		jp.add(jl2);
		jp.add(jf2);
		jp.add(jl3);
		jp.add(jf3);

//		jp.add(new JLabel("수1:"));		// JLabel은 다시 호출할 일이 없으므로 이렇게 1회용으로 선언해주어도 된다.
//		jp.add(jf1);
//		jp.add(new JLabel("수2:"));
//		jp.add(jf2);
//		jp.add(new JLabel("연산자:"));
//		jp.add(jf3);		
		
		jp.add(jsp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if(jb == jb1){
			if (jf1.getText().length()==0 || 
				jf2.getText().length()==0 ||
				jf3.getText().length()==0 ||
				!(jf3.getText().equals("+") || jf3.getText().equals("-") || 
				  jf3.getText().equals("*") || jf3.getText().equals("/")) || 
				(jf2.getText().equals("0") && jf3.getText().equals("/"))){
				
				ja.append("제대로 입력하세요\n");
			} else {
				int su1 = Integer.parseInt(jf1.getText());
				int su2 = Integer.parseInt(jf2.getText());
				String op = jf3.getText();
				int res = 0;
				
				switch (op) {
					case "+": res = su1 + su2; break;
					case "-": res = su1 - su2; break;
					case "*": res = su1 * su2; break;
					case "/": res = su1 / su2; break;
//			default:break;
				}
				ja.append(su1+" "+op+" "+su2+" = "+res+"\n");
			}
		} else if (jb == jb2){
			System.exit(0);
		} else if (jb == jb3){
			jf1.setText("");
			jf2.setText("");
			jf3.setText("");
			ja.setText("");
			jf1.requestFocus();
		} else {
			ja.append("제대로 입력하세요");
		}
	}

}
