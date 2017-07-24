package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Lotto_JFrame extends JFrame {
	JPanel jp;
	JButton jb;
	Image[] img = new Image[6];
	Lotto_Canvas lc = new Lotto_Canvas();
	Lotto_number ln = new Lotto_number();
	Toolkit toolkit = getToolkit();
	public Lotto_JFrame() {
		setTitle("로또");
		jp = new JPanel();
		jb = new JButton("번호생성");
		jp.add(jb);
		
		add(lc,BorderLayout.CENTER);
		add(jp,BorderLayout.EAST);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-350, ds.height/2-70, 700, 140);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int j = 0;
				for (int i : ln.Lotto_number()){
					lc.img[j] = toolkit.getImage("src/imagesLotto/"+i+".gif");
					j++;
				}
				ln.lottoSet.clear();
				lc.repaint();
			}
		});
	}
}
