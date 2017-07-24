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
		setTitle("수도 알아보기");
		jp = new JPanel();
		jtf = new JTextField(20);
		jb1 = new JButton("확인");
		jb2 = new JButton("취소");
		
		jp.add(new JLabel("나라입력 : "));
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
					jta.append(input+"의 수도는 "+output+"입니다.\n");
				} else {
					jta.append("데이터에 없는 나라입니다.\n");
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
		
		jtf.addKeyListener(new KeyAdapter() {		// 키 어댑터 : 클래스이므로 오버라이딩이 필요없다.
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == e.VK_ENTER){
					String input = jtf.getText();
					if (map.getKeys().contains(input)){
						String output = map.getMap().get(input);
						jta.append(input+"의 수도는 "+output+"입니다.\n");
					} else {
						jta.append("데이터에 없는 나라입니다.\n");
					}
					jtf.setText("");
				} else if (e.getKeyCode() == e.VK_ESCAPE){
					jta.setText("");
				}
			}
		});
	}
}
