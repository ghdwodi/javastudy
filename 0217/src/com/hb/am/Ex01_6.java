package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ��ġ������ (p.448)
// ������Ʈ�� ȭ�鿡 ��ġ�ϴ� ��� : Layout
// ��ġ������(Layout Manager) <= Layout�� ����
// ��ġ�ϴ� ���
// 1) FlowLayout : ��� �߾ӿ� ����. JPanel ���� ���⿡ ���Ѵ�.
// 2) BorderLayout : ��, ��, ��, ��, �߾� ��ġ
//					 ��, ��, ��, ��, �߾��� ǥ������ ������ ������ ������Ʈ�� ȭ���� ä���.
//					 JFrame�� ���⿡ ���Ѵ�.
// 3) GridLayout : ���� ����.
// 4) BoxLayout : �ϳ��� ��, �ϳ��� ���� �����.
// 5) ������ǥ : �� ������Ʈ���� ��ǥ�� �����ؼ� ��ġ
// 6) CardLayout : ���� ���� ī�带 �׾Ƶ� �� �ϳ��� �����ִ� ����.
//				    �������� �ִٰ� �̺�Ʈ�� �߻��ϸ� �ϳ��� �����ִ� ����.
//

public class Ex01_6 extends JFrame {
	public Ex01_6(){
		setTitle("GridLayout");

		// JPanel�� GridLayout���� �ٲ� ����.
		// GridLayout�� �� �����ӿ� ����.
		
		JPanel jp = new JPanel();
//		jp.setLayout(new GridLayout(2,1));
		jp.setLayout(new GridLayout(6,2,10,10));
		
		JButton jb1 = new JButton("��ư1");
		JButton jb2 = new JButton("��ư2");
		JButton jb3 = new JButton("��ư3");
		JButton jb4 = new JButton("��ư4");
		JButton jb5 = new JButton("��ư5");

		
		// JPanel�� ��ġ �����ڴ� Ư���� �������� ������ FlowLayout�� �ȴ�.
		// �� ��� �߾ӿ� ������Ʈ���� ��ġ�Ѵ�.
		
		// BorderLayout�� ���� 5������ �������� �� �ִ�.
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);

		
				
		add(jp);
		
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex01_6();
	}
}
