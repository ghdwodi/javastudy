package com.hb.am;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

public class Ex02_main extends JFrame {
	Ex02_Canvas can = new Ex02_Canvas();
	Toolkit toolkit = can.getToolkit();
	public Ex02_main(){
		add(can);
		
		Dimension ds = toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-500, ds.height/2-350, 1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
	}
	public static void main(String[] args) {
		new Ex02_main();
	}
}
