package com.hb.cm;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex07 extends JFrame {
	JPanel jp;
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	byte[] b;
	String path, res;
	FileOutputStream file;
	public Ex07() {
		setTitle("파일저장");
		jp = new JPanel();
		jtf = new JTextField(25);
		jb = new JButton("저장");
		jta = new JTextArea(50, 40);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		jp.add(new JLabel("파일 경로 : "));
		jp.add(jtf);
		jp.add(jb);
		
		add(jp,BorderLayout.NORTH);
		add(jsp,BorderLayout.CENTER);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-350, 500, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		jb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				path = jtf.getText().trim();
				File files = new File(path);
				b = new byte[(int)files.length()];
				try {
					file = new FileOutputStream(path);
					res = jta.getText().replace("\n", "\r\n");
					
					b = res.getBytes();
					file.write(b);
					file.flush();

				} catch (FileNotFoundException e2) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(getParent(),
							"올바른 경로를 입력하세요", "메세지", JOptionPane.WARNING_MESSAGE);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} finally {
					try {
						if (file != null) {file.close();}
					} catch (Exception e3) {
						// TODO: handle exception
					}
				}
			}
		});
	}
}
