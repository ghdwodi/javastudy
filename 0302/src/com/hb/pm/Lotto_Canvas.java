package com.hb.pm;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Lotto_Canvas extends Canvas {
	Image[] img = new Image[6];
	Toolkit toolkit = getToolkit();
	Lotto_number ln = new Lotto_number();
	
	public Lotto_Canvas() {
		int j = 0;
		for (int i : ln.Lotto_number()){
			img[j] = toolkit.getImage("src/imagesLotto/"+i+".gif");
			j++;
		}
	}
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		for (int j = 0; j < img.length; j++) {
			g.drawImage(img[j], j*100, 0, 100, 100, this);
		}
	}
}
