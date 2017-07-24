package com.hb.cm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex02_Canvas2 extends Canvas {
	int y = 0;
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.MAGENTA);
		g.fillOval(getWidth()-30, y, 30, 30);
	}
}
