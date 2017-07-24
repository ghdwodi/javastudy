package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex01_JFrame extends JFrame {
	public Ex01_JFrame() {
		JPanel jp = new JPanel();
		JButton jb = new JButton("¡æ");
		Ex01_Canvas can = new Ex01_Canvas();
		setTitle("°ø³îÀÌ1");
		jp.add(jb);
		
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
