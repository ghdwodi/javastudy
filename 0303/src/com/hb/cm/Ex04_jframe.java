package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

public class Ex04_jframe extends JFrame {
	public Ex04_jframe() {
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JProgressBar jpr1, jpr2;
		JButton jb;
		Toolkit toolkit = getToolkit();
		
		jp2.setLayout(new FlowLayout(FlowLayout.TRAILING, 10, 10));
		
		jpr1 = new JProgressBar();
		jpr2 = new JProgressBar();
		jb = new JButton("Ω√¿€");
		
		jp1.add(jb);
		jp2.add(jpr1);
		jp2.add(jpr2);
		
		add(jp1, BorderLayout.WEST);
		add(jp2, BorderLayout.CENTER);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2, ds.height/2, 400, 70);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {
					int i = 0;
					@Override
					public void run() {
						while(i <= jpr1.getMaximum()){
							i += (int)(Math.random()*10);
							jpr1.setValue(i);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();
				new Thread(new Runnable() {
					int i = 0;
					@Override
					public void run() {
						while(i <= jpr2.getMaximum()){
							i += (int)(Math.random()*10);
							jpr2.setValue(i);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
					}
				}).start();
			}
		});
	}
}
