package com.hb.am;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class Ex09_Can extends JPanel {
	Toolkit toolkit = getToolkit();
	Image img = toolkit.getImage("src/img/image1.gif");
	int x=0; int y=0;
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(),getHeight());
		g.drawImage(img, x, y, this);
	}
}
