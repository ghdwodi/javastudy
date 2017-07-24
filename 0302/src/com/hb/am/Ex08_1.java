package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex08_1 extends JFrame {
	CanvasTest ct = new CanvasTest();
	Toolkit toolkit = getToolkit();
	int x=-5; int y=-5; int wh=5;
	public Ex08_1(){
		setTitle("그림그리기");
		add(ct);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		ct.addMouseMotionListener(new MouseMotionAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				x = e.getX();
				y = e.getY();
				ct.repaint();
			}
		});
	}
	
	private class CanvasTest extends JPanel{
		@Override
		public void paint(Graphics g) {
			g.setColor(Color.CYAN);
			g.fillOval(x - wh/2, y - wh/2, wh, wh);
		}
	}
	public static void main(String[] args) {
		new Ex08_1();
	}
}
