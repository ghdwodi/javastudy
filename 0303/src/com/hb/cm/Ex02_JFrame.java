package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_JFrame extends JFrame {
	public Ex02_JFrame() {
		JPanel jp = new JPanel();
		JButton jb = new JButton("¡æ");
		JButton jb2 = new JButton("¡é");
		Ex02_Canvas can = new Ex02_Canvas();
		setTitle("°ø³îÀÌ2");
		jp.add(jb);
		jp.add(jb2);
		
		add(jp,BorderLayout.NORTH);
		add(can,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(can.x < can.getWidth()-30){
							can.x += 1;
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							can.repaint();
						}
					}
				}).start();
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						// TODO Auto-generated method stub
						while(can.y < can.getHeight()-30){
							can.y += 1;
							try {
								Thread.sleep(50);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							can.repaint();
						}
					}
				}).start();
			}
		});
		
	}
}
