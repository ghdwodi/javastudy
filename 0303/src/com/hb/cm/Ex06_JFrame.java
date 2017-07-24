package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex06_JFrame extends JFrame {
	Toolkit toolkit = getToolkit() ;
	Canvas can;
	ArrayList<Ex06_thread> snowList;	// �������� ���ռ�
	public Ex06_JFrame() {
		snowList = new ArrayList<>();
		JPanel jp = new JPanel();
		JButton jb = new JButton("������!");
		
		Image snow = toolkit.getImage("src/img/snowflake.png");
		
		setTitle("�� ������");
		setBackground(Color.WHITE);
		jp.setBackground(Color.WHITE);
		jp.add(jb);
		
		add(jp, BorderLayout.NORTH);
		add(can = new Canvas(){
			@Override
			public void paint(Graphics g) {
				// ����Ʈ�� �ִ� ���� ���
				for(int i=0;i<snowList.size();i++){
					Ex06_thread k = snowList.get(i);
					g.drawImage(snow, k.x, k.y, 50, 50, this);
				}
			}
		}, BorderLayout.CENTER);
		
		can.setBackground(Color.WHITE);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-300, ds.height/2-300, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// ��ư�� ������ �����̸� ����
				// ������ �����̴� ��ü�̸�, Arraylist�� ����
				Ex06_thread k = new Ex06_thread(Ex06_JFrame.this);
				// ���� Ŭ���� Ÿ���� this�� ����� �� ����.
				k.x = (int)(Math.random()*can.getWidth()-50);
				snowList.add(k);
				k.start();
				
			}
		});
	}
}
