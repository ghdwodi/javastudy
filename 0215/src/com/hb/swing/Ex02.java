package com.hb.swing;

import javax.swing.*;

public class Ex02 {
	public static void main(String[] args) {
		JFrame jf = new JFrame("��ư ������Ʈ2");
		
		// ��ư ������Ʈ
		
		JButton jb1 = new JButton("1��");
		JButton jb2 = new JButton("2��");
		JButton jb3 = new JButton("3��");
		JButton jb4 = new JButton("4��");
		JButton jb5 = new JButton("5��");
		
		// �г�
		
		JPanel jp = new JPanel();
		
		// �гο� ������Ʈ ����
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		// �����ӿ� �г� ����
		
		jf.add(jp);
		
		jf.setSize(300, 300);
		jf.setLocation(0, 0);
		jf.setVisible(true);
	}
}
