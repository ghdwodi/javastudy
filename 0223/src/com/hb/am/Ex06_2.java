package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex06_2 extends JFrame implements ActionListener {
	JPanel jp2;	

	public Ex06_2(){
		jp2 = new JPanel();
		
		jp2.add(new JLabel("·Î±×ÀÎ"));
		add(jp2);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-50, ds.height/2-50, 100, 100);
		setVisible(true);
		setResizable(false);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
