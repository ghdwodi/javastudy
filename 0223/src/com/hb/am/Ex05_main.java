package com.hb.am;

import java.awt.*;

import javax.swing.*;

public class Ex05_main extends JFrame {
	JPanel cardsPanel;
	CardLayout cLayout;
	public Ex05_main(){
		setTitle("카드 레이아웃2");
		cLayout = new CardLayout();
		cardsPanel = new JPanel(cLayout);
		
		Ex05_1 first = new Ex05_1(cLayout);
		Ex05_2 second = new Ex05_2(cLayout);
		Ex05_3 third = new Ex05_3(cLayout);
		
		cardsPanel.add(first,"First");
		cardsPanel.add(second,"Second");
		cardsPanel.add(third,"Third");
		
		add(cardsPanel);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new Ex05_main();
	}

}
