package com.hb.cm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex05_canvas extends Canvas {
	Image[] img = new Image[4];
	int[] x = new int[4];
	Toolkit toolkit = getToolkit();
	public Ex05_canvas() {
		for (int k : x) {
			k=0;
		}
		for (int i = 0; i < img.length; i++) {
			img[i] = toolkit.getImage("src/img/´ÞÆØ.jpg");
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		for (int i = 0; i < 4; i++) {
			g.drawImage(img[i], x[i], i*120 , 100, 100, this);
		}
	}
}
