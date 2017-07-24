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
		setTitle("�ζ�2");
		jp = new JPanel();
		jb = new JButton("��ȣ ����");
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
			// �̹��� �ֱ�
			for (int i = 0; i < image.length; i++) {
				image[i] = toolkit.getImage("src/imagesLotto/"+(i+1)+".gif");
			}
		}
		@Override
		public void paint(Graphics g) {
			 // ���ڸ� ���� ��
			for(int i=0; i<6; i++){
				if(! set.add((int)(Math.random()*45)+1)){
					i--;
				}
			}
			// ���ڸ� �׸����� 
			for(int i=0; i<6 ; i++){
				g.drawImage(image[i],(i*120) ,25, this);
			}
		}
	}
	public static void main(String[] args) {
		new Ex13();
	}

}
