package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_JFrame extends JFrame {
	JPanel jp1;
	Image img;
	Images images = new Images();
	JRadioButton jr1,jr2;
	Toolkit toolkit = getToolkit();
	public Ex04_JFrame() {
		setTitle("라디오버튼");
		jp1 = new JPanel();
		ButtonGroup bg = new ButtonGroup();
		jr1 = new JRadioButton("그림1");
		jr2 = new JRadioButton("그림2");
		bg.add(jr1);
		bg.add(jr2);
		
		jp1.add(jr1);
		jp1.add(jr2);
		

		
		add(jp1, BorderLayout.NORTH);
		add(images, BorderLayout.CENTER);
		
		jr1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==e.SELECTED){
					img = toolkit.getImage("src/img/image1.gif");
					repaint();
				}
			}
		});
		jr2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				// TODO Auto-generated method stub
				if(e.getStateChange()==e.SELECTED){
					img = toolkit.getImage("src/img/image2.gif");
					repaint();
				}
			}
		});
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-100, ds.height/2-100, 200, 200);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	private class Images extends JPanel{
		
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(),getHeight());
			g.drawImage(img, getWidth()/3,getHeight()/3, this);
		}
	}
}
