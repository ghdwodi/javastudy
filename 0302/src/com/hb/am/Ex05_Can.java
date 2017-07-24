package com.hb.am;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JPanel;

public class Ex05_Can extends JPanel {
	Image img;
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawImage(img, getWidth()/2, getHeight()/2, this);
		repaint();
	}
}
