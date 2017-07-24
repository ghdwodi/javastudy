package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ���� Ŭ������ ��Դ� ���
public class Ex02_test extends JFrame {
	JPanel jp1;
	JButton jb1,jb2;
	public Ex02_test(){
		setTitle("���� Ŭ���� ����");
		jp1 = new JPanel();
		jb1 = new JButton("Ȯ��");
		jb2 = new JButton("���");
		jp1.add(jb1);
		jp1.add(jb2);
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		jb1.addActionListener(new EventTest1());
		jb2.addActionListener(new EventTest2());
	}
	public static void main(String[] args) {
		new Ex02_test();
	}
	
	class EventTest1 implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("Ȯ�� Ŭ��");
			
		}
		
	}
	class EventTest2 implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("��� Ŭ��");

		}
		
	}
}
