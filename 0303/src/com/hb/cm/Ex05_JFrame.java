package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_JFrame extends JFrame {
	public Ex05_JFrame() {
		JPanel jp = new JPanel();
		JButton jb = new JButton("√‚πﬂ!");
		Ex05_canvas can = new Ex05_canvas();
		jp.setBackground(Color.WHITE);
		can.setBackground(Color.WHITE);
		
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(can, BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(can.x[0] < 500){
							can.x[0] += (int)(Math.random()*20);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							can.repaint();
						}
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(can.x[1] < 500){
							can.x[1] += (int)(Math.random()*20);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							can.repaint();
						}
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(can.x[2] < 500){
							can.x[2] += (int)(Math.random()*20);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							can.repaint();
						}
					}
				}).start();
				new Thread(new Runnable() {
					@Override
					public void run() {
						while(can.x[3] < 500){
							can.x[3] += (int)(Math.random()*20);
							try {
								Thread.sleep(100);
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
