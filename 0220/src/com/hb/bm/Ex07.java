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

//������ư, üũ�ڽ�, �޺��ڽ� => ItemListener�� ����ϴ� ���� �����̴�.
//��ư => ActionListener�� ����ϴ� ���� �����̴�.
//ItemListner�� ActionListener�� �� �� �������̽��̹Ƿ� ���߻���� �����ϴ�.

public class Ex07 extends JFrame implements ActionListener, ItemListener {
	JToggleButton jt1,jt2,jt3,jt4;	// ���������� ������ �Ʒ� �޼ҵ忡�� �޾ư� �� �ִ�.
	JButton jb;
	JTextArea jta;
	JPanel jpb,jp1,jp2,jp3;
	JScrollPane jsp;
	
	public Ex07(){
		setTitle("��۹�ư(Action)");
		jpb = new JPanel();
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		// 1�� �г� : ��۹�ư
		jt1 = new JToggleButton("�౸");
		jt2 = new JToggleButton("�߱�");
		jt3 = new JToggleButton("��");
		jt4 = new JToggleButton("�豸");
		
		jp1.add(jt1);
		jp1.add(jt2);
		jp1.add(jt3);
		jp1.add(jt4);
		
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
		
		jb.addActionListener(this);
		jt1.addItemListener(this);
		jt2.addItemListener(this);
		jt3.addItemListener(this);
		jt4.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex07();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JToggleButton jtb = (JToggleButton)(e.getItem());
		// TODO Auto-generated method stub
		if (e.getStateChange() == e.SELECTED){
			jta.append(jtb.getText()+" ����\n");
			
		} else if (e.getStateChange() == e.DESELECTED){
			jta.append(jtb.getText()+" ����\n");
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}

}
