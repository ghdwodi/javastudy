package com.hb.am;

import javax.swing.*;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class Ex02 extends JFrame {
	public Ex02(){
		setTitle("üũ�ڽ�");
		
		// �г� : �����̳�
		JPanel jp = new JPanel();
		
		// üũ�ڽ� ������Ʈ
		JCheckBox jcb1 = new JCheckBox();
		jcb1.setText("�߱�");
		JCheckBox jcb2 = new JCheckBox("�౸");
		JCheckBox jcb3 = new JCheckBox("�豸", true);
		JCheckBox jcb4 = new JCheckBox("��");
		
		// ������Ʈ�� �����̳ʿ� ����
		jp.add(jcb1);
		jp.add(jcb2);
		jp.add(jcb3);
		jp.add(jcb4);
		
		// ��輱 ����� : Border, createLineBorder
		//			  TitleBorder, create TitleBorder
		
		TitledBorder border = BorderFactory.createTitledBorder("�����ϴ� �");
		jp.setBorder(border);
		
		
		
		// �����̳ʸ� �����ӿ� ����
		add(jp);
		
		// ũ��� �Ӽ�
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex02();
	}
}