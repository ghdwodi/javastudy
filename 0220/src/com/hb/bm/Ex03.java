package com.hb.bm;

//�̺�Ʈ : ����ڰ� ��� �ൿ, ������ �ϴ� ���� ����.
//�ҽ� : �̺�Ʈ�� �߻��ϴ� ������Ʈ(��ư, üũ�ڽ�, ������ư ��)
//������ : �̺�Ʈ�� ����, �̺�Ʈ�� �߻����� �� ������ �̺�Ʈ�� ó���� �� �ֵ��� ���� �������̽�
//�ڵ鷯 : �����ʿ� ���Ե� �߻� �޼ҵ带 �������Ͽ� �����ʿ� ���޵� �̺�Ʈ�� ������ ó���ϴ� ���

//Action Event : ������Ʈ�� �����ų� ������ �� �߻��ϴ� �̺�Ʈ
//Action Listener : Action Event�� ����
//addActionListener : Action Event�� �����ϰ� �̺�Ʈ ��ü�� ������ �����ϴ� ����

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Ex03 extends JFrame implements ActionListener {
	JButton jb1,jb2,jb3;	// ���������� ������ �Ʒ� �޼ҵ忡�� �޾ư� �� �ִ�.
	JTextArea jta;
	JPanel jp1;
	JScrollPane jsp;
	
	public Ex03(){
		setTitle("Action Event2");
		
		jp1 = new JPanel();
				
		jb1 = new JButton("Input");
		jb2 = new JButton("Output");
		jb3 = new JButton("Exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		add(jp1,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		// �̺�Ʈ ó��
		
		jb1.addActionListener(this);	// actionPerformed�� �ִ� Ŭ������ ��ġ�� �Է��Ѵ�
		jb2.addActionListener(this);
		jb3.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		
		if (jb==jb1){
			jta.append("Input Ŭ��\n");
		} else if (jb==jb2) {
			jta.append("Output Ŭ��\n");
		} else if (jb==jb3) {
			System.exit(0);;	// ���α׷� ����
		}
	}
}
