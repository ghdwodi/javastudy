package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_2 extends JFrame {
	JPanel jp;
	JComboBox<String> jcom;
	String[] items = {"선택","그림1","그림2"};
	Image img;
	Ex05_Can ct = new Ex05_Can();
	Toolkit toolkit = getToolkit();
	public Ex05_2(){
		setTitle("콤보박스");
		jp = new JPanel();
		jcom = new JComboBox<>(items);
		jp.add(jcom);
		add(jp, BorderLayout.NORTH);
		add(ct,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-100, ds.height/2-150, 200, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jcom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange()==e.SELECTED){
					String s = (String)e.getItem();
					if (s.equals("그림1")){
						ct.img = toolkit.getImage("src/img/image1.gif");
					} else if (s.equals("그림2")){
						ct.img = toolkit.getImage("src/img/image2.gif");
					}
				}
			}
		});
	}
	
	

	public static void main(String[] args) {
		new Ex05_2();
	}
}
