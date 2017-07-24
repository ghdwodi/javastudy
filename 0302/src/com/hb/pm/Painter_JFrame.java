package com.hb.pm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Painter_JFrame extends JFrame {
	Toolkit toolkit = getToolkit();
	public Painter_JFrame() {
		JPanel jp = new JPanel();
		JButton jb0 = new JButton(" ");
		JButton jb1 = new JButton(" ");
		JButton jb2 = new JButton(" ");
		JButton jb3 = new JButton(" ");
		JButton jb4 = new JButton(" ");
		JButton jb5 = new JButton(" ");
		JButton jb6 = new JButton(" ");
		Integer[] items = {5,10,15,20,25,30};
		JComboBox<Integer> jcom;
		Painter_Canvas pc = new Painter_Canvas();
		jcom = new JComboBox<>(items);
		
		jb0.setBackground(Color.BLACK);
		jb1.setBackground(Color.RED);
		jb2.setBackground(Color.GREEN);
		jb3.setBackground(Color.BLUE);
		jb4.setBackground(Color.CYAN);
		jb5.setBackground(Color.MAGENTA);
		jb6.setBackground(Color.YELLOW);
		
		jp.add(jb0);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		jp.add(jb6);
		
		jp.add(jcom);
		
		add(jp,BorderLayout.NORTH);
		add(pc,BorderLayout.CENTER);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb0.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.BLACK);
			}
		});
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.RED);
			}
		});
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.GREEN);
			}
		});
		jb3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.BLUE);
			}
		});
		jb4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.CYAN);
			}
		});
		jb5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.MAGENTA);
			}
		});
		jb6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				pc.color = (Color.YELLOW);
			}
		});
		jcom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				if (e.getStateChange()==e.SELECTED){
					int size;
					size = (int)e.getItem();
					pc.wh = size;
				}
			}
		});
		pc.addMouseMotionListener(new MouseAdapter() {
			@Override
			public void mouseDragged(MouseEvent e) {
				pc.x = (e.getX());
				pc.y = (e.getY());
				pc.repaint();
			}
		});
	}
}
