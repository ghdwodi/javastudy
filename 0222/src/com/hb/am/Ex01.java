package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.activation.Activator;

import javax.swing.*;

public class Ex01 extends JFrame implements ActionListener {
	JPanel jp;
	JLabel jl1,jl2,jl3;
	JTextField jf1,jf2,jf3;
	JTextArea ja;
	JScrollPane jsp;
	JButton jb1,jb2,jb3;
	public Ex01(){
		setTitle("���� 1");
		jp = new JPanel();
				
		jl1 = new JLabel("��1:");
		jl2 = new JLabel("��2:");
		jl3 = new JLabel("������:");
		
		jf1 = new JTextField(4);		
		jf2 = new JTextField(4);		
		jf3 = new JTextField(4);		
		
		ja = new JTextArea(16, 25);
		
		ja.setLineWrap(true);	// �ڵ� �ٹٲ�
		ja.setEditable(false);	// ja�� ���â�̹Ƿ� ������ �Ұ����ϵ��� ó��.
		
		jsp = new JScrollPane(	// ��ũ�ѹ� ó��
				ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
						
		jb1 = new JButton("���");
		jb2 = new JButton("����");
		jb3 = new JButton("���");
		
		
		jp.add(jl1);
		jp.add(jf1);
		jp.add(jl2);
		jp.add(jf2);
		jp.add(jl3);
		jp.add(jf3);

//		jp.add(new JLabel("��1:"));		// JLabel�� �ٽ� ȣ���� ���� �����Ƿ� �̷��� 1ȸ������ �������־ �ȴ�.
//		jp.add(jf1);
//		jp.add(new JLabel("��2:"));
//		jp.add(jf2);
//		jp.add(new JLabel("������:"));
//		jp.add(jf3);		
		
		jp.add(jsp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-200, 300, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton jb = (JButton)e.getSource();
		if(jb == jb1){
			if (jf1.getText().length()==0 || 
				jf2.getText().length()==0 ||
				jf3.getText().length()==0 ||
				!(jf3.getText().equals("+") || jf3.getText().equals("-") || 
				  jf3.getText().equals("*") || jf3.getText().equals("/")) || 
				(jf2.getText().equals("0") && jf3.getText().equals("/"))){
				
				ja.append("����� �Է��ϼ���\n");
			} else {
				int su1 = Integer.parseInt(jf1.getText());
				int su2 = Integer.parseInt(jf2.getText());
				String op = jf3.getText();
				int res = 0;
				
				switch (op) {
					case "+": res = su1 + su2; break;
					case "-": res = su1 - su2; break;
					case "*": res = su1 * su2; break;
					case "/": res = su1 / su2; break;
//			default:break;
				}
				ja.append(su1+" "+op+" "+su2+" = "+res+"\n");
			}
		} else if (jb == jb2){
			System.exit(0);
		} else if (jb == jb3){
			jf1.setText("");
			jf2.setText("");
			jf3.setText("");
			ja.setText("");
			jf1.requestFocus();
		} else {
			ja.append("����� �Է��ϼ���");
		}
	}

}
