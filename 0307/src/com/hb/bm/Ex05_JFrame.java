package com.hb.bm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

public class Ex05_JFrame extends JFrame {
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JButton jb1, jb2;
	Toolkit toolkit = getToolkit();
	byte[] b;
	int size;
	Ex05_CopyPaste cp = new Ex05_CopyPaste();
	public Ex05_JFrame() {
		setTitle("복사하기");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jtf1 = new JTextField(15);
		jtf2 = new JTextField(15);
		jtf1.setEditable(false);
		jtf2.setEditable(false);
		jb1 = new JButton("불러오기");
		jb2 = new JButton("붙여넣기");
		jp1.add(new JLabel("원본 위치 : "));
		jp1.add(jtf1);
		jp1.add(jb1);
		jp2.add(new JLabel("사본 위치 : "));
		jp2.add(jtf2);
		jp2.add(jb2);
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		
		Dimension ds = toolkit.getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-55, 400, 110);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.LOAD);
				fd.setVisible(true);
				
				String path = fd.getDirectory()+fd.getFile();
				int size = cp.fileSize(path);
				b = cp.copy(path,size);
				jtf1.setText(path);
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "불러오기", FileDialog.SAVE);
				fd.setVisible(true);
				String path = fd.getDirectory()+fd.getFile();
				cp.paste(path, b);
				
			}
		});
	}
}
