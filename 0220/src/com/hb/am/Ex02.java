package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ex02 extends JFrame{
	public Ex02(){
		setTitle("���� �ֹ���");
		
		JPanel jp1 = new JPanel();	// "�ڹ� ���ڿ� ���� ���� ȯ���մϴ�
		JPanel jp2 = new JPanel();	// ���� : �޺�, ��������, �Ұ�� (������ư ��������)
		JPanel jp3 = new JPanel();	// �߰����� : �Ǹ�, ġ��, ���۷δ�, ������ (������ư ��������)
		JPanel jp4 = new JPanel();	// ũ�� : small, medium, large (������ư ��������)
		JPanel jp5 = new JPanel();	// �ֹ�, ���, [] (��ư 2��, �ؽ�Ʈ������)
		
		/*jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.Y_AXIS));*/
		
		jp2.setLayout(new GridLayout(3, 1));
		jp3.setLayout(new GridLayout(4, 1));
		jp4.setLayout(new GridLayout(3, 1));
		
		// �� �г� ����
		
		jp2.setBorder(new TitledBorder(BorderFactory.createTitledBorder("����")));
		jp3.setBorder(new TitledBorder(BorderFactory.createTitledBorder("�߰�����")));
		jp4.setBorder(new TitledBorder(BorderFactory.createTitledBorder("ũ��")));
		
		// ������ư ��ư�׷� ����
		
		ButtonGroup gb1 = new ButtonGroup();
		ButtonGroup gb2 = new ButtonGroup();
		ButtonGroup gb3 = new ButtonGroup();
		
		// ������ư
		
		JRadioButton jr1 = new JRadioButton("�޺�",true);
		JRadioButton jr2 = new JRadioButton("��������");
		JRadioButton jr3 = new JRadioButton("�Ұ��");
		
		gb1.add(jr1);		
		gb1.add(jr2);		
		gb1.add(jr3);
		
		JRadioButton jr4 = new JRadioButton("�Ǹ�",true);
		JRadioButton jr5 = new JRadioButton("ġ��");
		JRadioButton jr6 = new JRadioButton("���۷δ�");
		JRadioButton jr7 = new JRadioButton("������");
		
		gb2.add(jr4);
		gb2.add(jr5);
		gb2.add(jr6);
		gb2.add(jr7);
		
		JRadioButton jr8 = new JRadioButton("Small",true);
		JRadioButton jr9 = new JRadioButton("Medium");
		JRadioButton jr10 = new JRadioButton("Large");
		
		gb3.add(jr8);
		gb3.add(jr9);
		gb3.add(jr10);
		
		// ��ư, �ؽ�Ʈ������
		
		JButton jb1 = new JButton("�ֹ�");
		JButton jb2 = new JButton("���");
		JTextField jf = new JTextField(10);
		jf.setEditable(false);
		
		// �� �гο� ����
		
		jp1.add(new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�."));
		jp2.add(jr1);
		jp2.add(jr2);
		jp2.add(jr3);
		jp3.add(jr4);
		jp3.add(jr5);
		jp3.add(jr6);
		jp3.add(jr7);
		jp4.add(jr8);
		jp4.add(jr9);
		jp4.add(jr10);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jf);
		
		// �����ӿ� ����
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.WEST);
		add(jp3,BorderLayout.CENTER);
		add(jp4,BorderLayout.EAST);
		add(jp5,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-220, ds.height/2-160, 400, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);	
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
