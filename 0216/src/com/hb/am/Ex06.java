package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.*;

public class Ex06 extends JFrame {
	public Ex06(){
		super("����Ʈ");
		JPanel jp = new JPanel();
		
		// ����Ʈ ������Ʈ
		
		String[] items = {"�����ϴ� �","�౸","�豸","�߱�","��"};
		
		JList jl = new JList(items);
		
		jp.add(jl);
		
		add(jp);
		
		// Ư�� �׸��� ���� �����ϴ� ���
		
		jl.setSelectedIndex(0);	// �迭�� index���� ��ȸ
		
		// �⺻���� ����
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex06();
	}
}
