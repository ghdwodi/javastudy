package com.hb.pm;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class Painter_Canvas extends Canvas {
	int x=0;
	int y=0;
	int wh=0;
	Color color = (Color.BLACK);
	
	@Override
	public void paint(Graphics g) {
		g.setColor(color);		
		g.fillOval(x-wh/2, y-wh/2, wh, wh);
	}
	@Override
	public void update(Graphics g) {
		paint(g);
	}
	

}
