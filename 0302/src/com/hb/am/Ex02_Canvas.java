package com.hb.am;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Ex02_Canvas extends Canvas {
	Toolkit toolkit = getToolkit();
	Image img1, img2;
	
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		
		// �� �ٲٱ�
		g.setColor(Color.PINK);
		
		// �� �׸��� : drawLine(������ġ, �� ��ġ)
		g.drawLine(10, 10, 10, 110);
		g.drawLine(10, 10, 110, 10);
		g.drawLine(110, 10, 110, 110);
		g.drawLine(10, 110, 110, 110);
		g.drawLine(10, 10, 110, 110);
		g.drawLine(10, 110, 110, 10);
						
		// �簢�� �׸���
		g.setColor(Color.BLUE);
		g.drawRect(120, 10, 100, 100);
		g.setColor(Color.RED);
		g.drawRect(130, 20, 80, 80);
		g.setColor(Color.GREEN);
		g.drawRect(140, 30, 60, 60);
		g.setColor(Color.YELLOW);
		g.drawRect(150, 40, 40, 40);
		g.setColor(Color.BLACK);
		g.drawRect(160, 50, 20, 20);
		
		// ä���� �簢�� fillRect
		g.setColor(Color.RED);
		g.fillRect(230, 10, 100, 100);
		g.setColor(Color.GREEN);
		g.fillRect(240, 20, 80, 80);
		
		// �𼭸��� �ձ� �簢�� : roundRect
		g.setColor(Color.black);
		g.drawRoundRect(340, 10, 100, 100, 0, 0);
		g.setColor(Color.black);
		g.drawRoundRect(450, 10, 100, 100, 100, 100);
		
		// RGB �÷� : 0-255
		g.setColor(new Color(0, 0, 255));
		g.fillRoundRect(560, 10, 100, 100, 50, 50);
		g.fillRoundRect(670, 10, 100, 100, 30, 30);
		
		// �� �׸���
		g.setColor(new Color(0, 255, 255));
		g.drawOval(780, 10, 100, 100);
		g.fillOval(890, 10, 100, 100);
		
		// ��ȣ �׸���
		g.setColor(Color.black);
		g.drawArc(10, 120, 100, 100, 0, 270);
		g.setColor(Color.YELLOW);
		g.fillArc(120, 120, 100, 100, 45, 270);
		
		g.setColor(Color.BLACK);
		g.drawString("�Ѹ�", 10, 230);
		
		// �׸� ���̱�
		img1 = toolkit.getImage("src/img/image1.gif");
		img2 = toolkit.getImage("src/img/image2.gif");
		g.drawImage(img1, 10, 230, this);
		g.drawImage(img1, 120, 230, 100, 100, this);
		g.drawImage(img1, 230, 230, 100, 100, Color.YELLOW, this);
		
	
	}
}
