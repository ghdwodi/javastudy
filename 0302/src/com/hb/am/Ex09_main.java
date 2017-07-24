package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class Ex09_main extends JFrame {
	Ex09_Can can = new Ex09_Can();
	public Ex09_main() {
		setTitle("마우스포인터");
		add(can);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		can.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseMoved(MouseEvent e) {
				can.x = e.getX();
				can.y = e.getY();
				can.repaint();
			}
		});
		
	}
	public static void main(String[] args) {
		new Ex09_main();
	}
}
