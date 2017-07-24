package com.hb.bm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

// �̺�Ʈ : ����ڰ� ��� �ൿ, ������ �ϴ� ���� ����.
// �ҽ� : �̺�Ʈ�� �߻��ϴ� ������Ʈ(��ư, üũ�ڽ�, ������ư ��)
// ������ : �̺�Ʈ�� ����, �̺�Ʈ�� �߻����� �� ������ �̺�Ʈ�� ó���� �� �ֵ��� ���� �������̽�
// �ڵ鷯 : �����ʿ� ���Ե� �߻� �޼ҵ带 �������Ͽ� �����ʿ� ���޵� �̺�Ʈ�� ������ ó���ϴ� ���

// Action Event : ������Ʈ�� �����ų� ������ �� �߻��ϴ� �̺�Ʈ
// Action Listener : Action Event�� ����
// addActionListener : Action Event�� �����ϰ� �̺�Ʈ ��ü�� ������ �����ϴ� ����

public class Ex01 extends JFrame /*implements ActionListener*/{
	
	JButton jb1,jb2,jb3;	// ���������� ������ �Ʒ� �޼ҵ忡�� �޾ư� �� �ִ�.
	
	public Ex01(){
		setTitle("Action Event");
		
		JPanel jp1 = new JPanel();
		jb1 = new JButton("Input");
		jb2 = new JButton("Output");
		jb3 = new JButton("Exit");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		/*jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);*/
		
		Ex02 test = new Ex02();
		jb1.addActionListener(test);
		jb2.addActionListener(test);
		jb3.addActionListener(test);
		
	}
	public static void main(String[] args) {
		new Ex01();
	}
	
	//@Override	// �̺�Ʈ�� �߻��ϸ� ������ �޼ҵ�
	/*public void actionPerformed(ActionEvent e) {
//		System.out.println("��ư�� ������");
	
		// �̺�Ʈ �߻� ��� ã��
		// getActionCommand() <= �̺�Ʈ ����� text�� �˷� �ش�
		String msg = e.getActionCommand();
		
		if(msg.equals(jb1.getText())){
			System.out.println("Input ������");
		} else if (msg.equals(jb2.getText())){
			System.out.println("Output ������");
		} else if (msg.equals(jb3.getText())){
			System.out.println("Exit ������");
		}
	}*/
}

class Ex02 implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// ���1		
//		String msg = e.getActionCommand();
		
		// ��� 2 : Object�� JButton���� �ٲ� �� String���� ������ ��
		String msg = ((JButton)(e.getSource())).getText();
		
		// ��� 3 : Object�� JButton���� �ٲ� �� ���� ���� JButton�� ��
		//		   �� ����� ���� JButton�� �ִ� Ŭ���� ������ ����ؾ� �Ѵ�.
//		JButton jb = (JButton)(e.getSource());
//		if(jb==jb1){
//			System.out.println("Input ������");
//		} else if (jb==jb2){
//			System.out.println("Output ������");
//		} else if (jb==jb3){
//			System.out.println("Exit ������");
//		}
		
		System.out.println(msg+" ������");
	}
	
}
