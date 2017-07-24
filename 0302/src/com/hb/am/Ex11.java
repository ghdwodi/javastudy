package com.hb.am;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Ex11 extends JFrame{
	int x=0; int y=0; int wh=30;
	int ballSpeed = 10;		// 1�� = 1000
	int ballSpeedGap = 20;	// �̵� ����
	CanvasTest ct = new CanvasTest();
	Toolkit toolkit = getToolkit();
	
	boolean bRight = true;
	boolean bDown = true;
	public Ex11() {
		setTitle("�� �� ��");
		add(ct);
		
		Dimension ds = toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-300, 1000, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		Timer timer = new Timer(ballSpeed, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				/*x += ballSpeedGap;
				y += ballSpeedGap;
				ct.repaint();*/
				if (x<0) bRight = true;
				if (x>970) bRight = false;
				if (y<0) bDown = true;
				if (y>540) bDown = false;
				if (bRight){
					x += ballSpeedGap;
				} else {
					x -= ballSpeedGap;
				}
				if (bDown){
					y += ballSpeedGap;
				} else {
					y -= ballSpeedGap;
				}
				ct.repaint();
			}
		});
		Timer timer2 = new Timer(100, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				ct.color = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
			}
		});
		
		timer.start();
		timer2.start();
	}
	
	private class CanvasTest extends JPanel {
		Color color;
		@Override
		public void paint(Graphics g) {
			g.clearRect(0, 0, getWidth(),getHeight());
			g.setColor(color);
			g.fillOval(x, y, wh, wh);
		}
	}
	public static void main(String[] args) {
		new Ex11();
	}

}
