package com.hb.am;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.spi.CalendarDataProvider;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Ex05_1 extends JPanel implements ActionListener{
	JPanel jp1;
	CardLayout cards;
	JButton jb1,jb2;
	public Ex05_1(){}
	
	public Ex05_1(CardLayout card){
		this.cards = card;
		setBackground(Color.YELLOW);
		jp1 = new JPanel();
		jb1 = new JButton("회원가입");
		jb2 = new JButton("로그인");
		
		jp1.add(jb1);
		jp1.add(jb2);
		add(jp1);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		if(jb==jb1){
			cards.show(getParent(), "Second");
		}else if(jb==jb2){
			cards.show(getParent(), "Third");
		}
	}
	
}
