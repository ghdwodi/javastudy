package com.hb.am;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex05_3 extends JPanel implements ActionListener{
	JPanel jp1;
	CardLayout cards;
	JButton jb1;
	public Ex05_3(){}
	
	public Ex05_3(CardLayout card){
		this.cards = card;
		setBackground(Color.GREEN);
		jp1 = new JPanel();
		jb1 = new JButton("돌아가기");
//		jb2 = new JButton("로그인");
		
		jp1.add(jb1);
//		jp1.add(jb2);
		add(jp1);
		
		jb1.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		if(jb==jb1){
//			cards.show(getParent(), "First");
			cards.first(getParent());
		}
	}
	
}
