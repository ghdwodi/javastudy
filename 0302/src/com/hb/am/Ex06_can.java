package com.hb.am;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Ex06_can extends JPanel {
	int x = -30; int y = -30; int wh = 30;
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		Color color = new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255));
		g.setColor(color);
		g.fillOval(x-wh/2, y-wh/2, wh, wh);
	}

}
