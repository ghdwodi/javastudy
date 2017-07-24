package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class Ex03 extends JFrame implements KeyListener {
	JTextArea jta;
	JScrollPane jsp;
	public Ex03(){
		setTitle("키 이벤트");
		jta = new JTextArea();
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setResizable(false);
		
		jta.addKeyListener(this);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode()==e.VK_LEFT){
			jta.append("←\n");
		} else if (e.getKeyCode()==e.VK_RIGHT){
			jta.append("→\n");
		} else if (e.getKeyCode()==e.VK_UP){
			jta.append("↑\n");
		} else if (e.getKeyCode()==e.VK_DOWN){
			jta.append("↓\n");
		} else if (e.getKeyCode()==e.VK_ESCAPE){
			System.exit(0);
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

}
