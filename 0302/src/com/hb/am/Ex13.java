package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Set;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex13 extends JFrame {
	JPanel jp;
	JButton jb;
	Image[] image = new Image[45];
	Toolkit toolkit = getToolkit();
	Set<Integer> set = new HashSet<>();
	CanvasTest ct = new CanvasTest();
	public Ex13() {
		setTitle("로또2");
		jp = new JPanel();
		jb = new JButton("번호 생성");
		jp.add(jb);

		add(jp, BorderLayout.EAST);
		add(ct, BorderLayout.CENTER);

		setBounds(100, 100, 900, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				ct.repaint();
			}
		});
	}

	private class CanvasTest extends JPanel {
		public CanvasTest() {
			// 이미지 넣기
			for (int i = 0; i < image.length; i++) {
				image[i] = toolkit.getImage("src/imagesLotto/"+(i+1)+".gif");
			}
		}
		@Override
		public void paint(Graphics g) {
			 // 숫자를 구한 것
			for(int i=0; i<6; i++){
				if(! set.add((int)(Math.random()*45)+1)){
					i--;
				}
			}
			// 숫자를 그림으로 
			for(int i=0; i<6 ; i++){
				g.drawImage(image[i],(i*120) ,25, this);
			}
		}
	}
	public static void main(String[] args) {
		new Ex13();
	}

}
