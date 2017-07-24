package com.hb.am;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03 extends JFrame {
	ImageTest it = new ImageTest();
	Toolkit toolkit = getToolkit();
	public Ex03(){
		
		add(it);
		
		Dimension ds = toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-350, 1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	
	// 내부 클래스
	private class ImageTest extends JPanel{
		Image img;
		public ImageTest(){
			toolkit = getToolkit();
			img = toolkit.getImage("src/img/image1.gif");
		}
		public void paint (Graphics g){
			g.drawImage(img, 10, 230, this);
		}
	}
	public static void main(String[] args) {
		new Ex03();
	}
}
