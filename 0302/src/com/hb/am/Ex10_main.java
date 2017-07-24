package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Ex10_main extends JFrame {
	Ex10_Can can = new Ex10_Can();
	public Ex10_main() {
		setTitle("Å°º¸µå");
		add(can);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				int key = e.getKeyCode();
				if (key==e.VK_LEFT){
					if(can.x<=0){
						can.x = 0;
					} else {
						can.x -= 10;
					}
					can.repaint();
				} else if (key==e.VK_RIGHT){
					if(can.x>=500){
						can.x = 500;
					} else {
						can.x += 10;
					}
					can.repaint();
				} else if (key==e.VK_UP){
					if(can.y<=0){
						can.y = 0;
					} else {
						can.y -= 10;
					}
					can.repaint();
				} else if (key==e.VK_DOWN){
					if(can.y>=500){
						can.y = 500;
					} else {
						can.y += 10;
					}
					can.repaint();
				}
			}
			
		});
		
	}
	public static void main(String[] args) {
		new Ex10_main();
	}
}
