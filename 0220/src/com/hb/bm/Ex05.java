package com.hb.bm;

//�̺�Ʈ : ����ڰ� ��� �ൿ, ������ �ϴ� ���� ����.
//�ҽ� : �̺�Ʈ�� �߻��ϴ� ������Ʈ(��ư, üũ�ڽ�, ������ư ��)
//������ : �̺�Ʈ�� ����, �̺�Ʈ�� �߻����� �� ������ �̺�Ʈ�� ó���� �� �ֵ��� ���� �������̽�
//�ڵ鷯 : �����ʿ� ���Ե� �߻� �޼ҵ带 �������Ͽ� �����ʿ� ���޵� �̺�Ʈ�� ������ ó���ϴ� ���

//Action Event : ������Ʈ�� �����ų� ������ �� �߻��ϴ� �̺�Ʈ
//Action Listener : Action Event�� ����
//addActionListener : Action Event�� �����ϰ� �̺�Ʈ ��ü�� ������ �����ϴ� ����

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// ������ư, üũ�ڽ�, �޺��ڽ� => ItemListener�� ����ϴ� ���� �����̴�.
// ��ư => ActionListener�� ����ϴ� ���� �����̴�.
// ItemListner�� ActionListener�� �� �� �������̽��̹Ƿ� ���߻���� �����ϴ�.

public class Ex05 extends JFrame implements ActionListener, ItemListener {
	JRadioButton jr1,jr2,jr3,jr4;	// ���������� ������ �Ʒ� �޼ҵ忡�� �޾ư� �� �ִ�.
	JButton jb;
	JTextArea jta;
	JPanel jpb,jp1,jp2,jp3;
	JScrollPane jsp;
	ButtonGroup gb;
	
	public Ex05(){
		setTitle("���� ��ư2(Action)");
		jpb = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		// 1�� �г� : ������ư
		gb = new ButtonGroup();		
		
		jr1 = new JRadioButton("�౸");
		jr2 = new JRadioButton("�߱�");
		jr3 = new JRadioButton("��");
		jr4 = new JRadioButton("�豸");
		
		gb.add(jr1);
		gb.add(jr2);
		gb.add(jr3);
		gb.add(jr4);
		
		jp1.add(jr1);
		jp1.add(jr2);
		jp1.add(jr3);
		jp1.add(jr4);
		
		// 2�� �г� : ���� ��ư
		jb = new JButton("exit");
		
		jp2.add(jb);
		
		// 3�� �г� : ���â
		jta = new JTextArea(8, 25);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		jp3.add(jsp);
		
		// �� �г� : �г� 1~3 ����
		
		jpb.add(jp1);
		jpb.add(jp2);
		jpb.add(jp3);
		
		// �����ӿ� �� �г� ����
		
		add(jpb);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jr1.addItemListener(this);
		jr2.addItemListener(this);
		jr3.addItemListener(this);
		jr4.addItemListener(this);
		jb.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		JRadioButton jrb = (JRadioButton)(e.getItem());
		
		// ���ð� ���� �̺�Ʈ�� ��� ����
/*		if (jrb==jr1){
			jta.append(jr1.getText()+" ����\n");
		} else if (jrb==jr2) {
			jta.append(jr2.getText()+" ����\n");
		} else if (jrb==jr3) {
			jta.append(jr3.getText()+" ����\n");
		} else if (jrb==jr4) {
			jta.append(jr4.getText()+" ����\n");
		}*/
		
		if (e.getStateChange() == e.SELECTED) {	// getStateChange : ����/���� ���θ� ��ȯ�ϴ� �޼ҵ�
/*			if (jrb==jr1){
				jta.append(jr1.getText()+" ����\n");
			} else if (jrb==jr2) {
				jta.append(jr2.getText()+" ����\n");
			} else if (jrb==jr3) {
				jta.append(jr3.getText()+" ����\n");
			} else if (jrb==jr4) {
				jta.append(jr4.getText()+" ����\n");
			}*/
			jta.append(jrb.getText()+" ����\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
