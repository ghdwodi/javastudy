package com.hb.bm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex10_JFrame extends JFrame {
	JPanel jp;
	JTextField jtf;
	JButton jb1,jb2;
	JTextArea jta;
	JScrollPane jsp;
	Ex10_map map = new Ex10_map();
	public Ex10_JFrame() {
		setTitle("���� �˾ƺ���");
		jp = new JPanel();
		jtf = new JTextField(20);
		jb1 = new JButton("Ȯ��");
		jb2 = new JButton("���");
		
		jp.add(new JLabel("�����Է� : "));
		jp.add(jtf);
		jp.add(jb1);
		jp.add(jb2);
		
		jta = new JTextArea();
		jta.setEditable(false);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		add(jp,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-150, 500, 300);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = jtf.getText();
				if (map.getKeys().contains(input)){
					String output = map.getMap().get(input);
					jta.append(input+"�� ������ "+output+"�Դϴ�.\n");
				} else {
					jta.append("�����Ϳ� ���� �����Դϴ�.\n");
				}
				jtf.setText("");
			}
		});
		
		jb2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.setText("");
			}
		});
		
		jtf.addKeyListener(new KeyAdapter() {		// Ű ����� : Ŭ�����̹Ƿ� �������̵��� �ʿ����.
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_ENTER){
					String input = jtf.getText();
					if (map.getKeys().contains(input)){
						String output = map.getMap().get(input);
						jta.append(input+"�� ������ "+output+"�Դϴ�.\n");
					} else {
						jta.append("�����Ϳ� ���� �����Դϴ�.\n");
					}
					jtf.setText("");
				} else if (e.getKeyCode() == e.VK_ESCAPE){
					jta.setText("");
				}
			}
		});
	}
}
