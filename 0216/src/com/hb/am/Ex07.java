package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07 extends JFrame {
	public Ex07(){
		setTitle("JTextComponent");
		JPanel jp = new JPanel();
		
		// �ؽ�Ʈ ������Ʈ
		
		JLabel jl1 = new JLabel("ID : ");
		JTextField jf1 = new JTextField();
		jf1.setColumns(20);
		jf1.setText("���̵� �Է�");
		
		JLabel jl2 = new JLabel("PW : ");
		JPasswordField jpf = new JPasswordField("����Է�", 20);
		
		JLabel jl3 = new JLabel("�ڱ�Ұ�");
		JTextArea jta = new JTextArea(5, 20);

		// JTextArea������ �ٹٲ� ��ɰ� ��ũ�� ����� ������ �ִ´�
		
		// �ڵ� �ٹٲ� ���
		
		jta.setLineWrap(true);
		
		// ��ũ�� ��� : ��ũ���� ���� ����
		
		JScrollPane jsp = new JScrollPane(jta,	// ��ũ���� ��ġ�� ������Ʈ
						ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,	// ����
						ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER		// ����
						);
		
		
		jp.add(jl1);
		jp.add(jf1);
		jp.add(jl2);
		jp.add(jpf);
		jp.add(jl3);
		jp.add(jsp);	// jsp�� jta�� �̹� �� �ִ�
		
		add(jp);

		
		// �⺻���� ����
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150,ds.height/2-150,300,300);
//		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Ex07();
	}
}
