package com.hb.cm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.*;

public class Ex08_JFrame extends JFrame {
	JPanel jp1, jp2;
	JTextField jtf1, jtf2;
	JButton jb1, jb2;
	Toolkit toolkit = getToolkit();
	byte[] b;
	public Ex08_JFrame() {
		setTitle("�����ϱ�");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jtf1 = new JTextField(15);
		jtf2 = new JTextField(15);
		jtf1.setEditable(false);
		jtf2.setEditable(false);
		jb1 = new JButton("�ҷ�����");
		jb2 = new JButton("�ٿ��ֱ�");
		jp1.add(new JLabel("���� ��ġ : "));
		jp1.add(jtf1);
		jp1.add(jb1);
		jp2.add(new JLabel("�纻 ��ġ : "));
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
				FileDialog fd = new FileDialog((Frame) getParent(), "�ҷ�����", FileDialog.LOAD);
				fd.setVisible(true);
				
				String path = fd.getDirectory()+fd.getFile();
				File file = new File(path);
				b = new byte[(int)file.length()];
				try {
					FileInputStream fis = new FileInputStream(path);
					fis.read(b);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				jtf1.setText(path);
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				FileDialog fd = new FileDialog((Frame) getParent(), "�ҷ�����", FileDialog.SAVE);
				fd.setVisible(true);
				String path = fd.getDirectory()+fd.getFile();
				try {
					FileOutputStream fos = new FileOutputStream(path);
					fos.write(b);
					fos.flush();
					JOptionPane.showMessageDialog(getParent(),
							"���� �Ϸ�", "�޽���", JOptionPane.INFORMATION_MESSAGE);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
	}
}
