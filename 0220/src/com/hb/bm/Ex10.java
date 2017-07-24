package com.hb.bm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Ex10 extends JFrame implements
ActionListener, DocumentListener, KeyListener {
	JTextField jtf;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	JPanel jpb, jp1, jp2;
	
	public Ex10(){
		setTitle("텍스트 이벤트");
		jpb = new JPanel();
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		jp1 = new JPanel();
		jtf = new JTextField(14);
		jb = new JButton("입력");
		jb.setEnabled(false);	// 버튼 죽이기
		
		jp1.add(new JLabel("제목 :"));
		jp1.add(jtf);
		jp1.add(jb);
		
		jp2 = new JPanel();
		jta = new JTextArea(13,25);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jp1.add(jsp);
		
		jpb.add(jp1);
		jpb.add(jp2);
		
		add(jpb);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		jb.addActionListener(this);
		jtf.getDocument().addDocumentListener(this);
		jtf.addKeyListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex10();
	}

	@Override	// 텍스트 필드의 내용이 변경될 때
	public void changedUpdate(DocumentEvent e) {
	}

	@Override	// 텍스트 필드의 내용이 삽입될 때
	public void insertUpdate(DocumentEvent e) {
		jb.setEnabled(true);
	}

	@Override	// 텍스트 필드의 내용이 삭제될 때
	public void removeUpdate(DocumentEvent e) {
		if (e.getOffset()==0){
			jb.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		play();
	}

	@Override	// 키를 눌렀을 때
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_ENTER){	// 엔터의 키코드를 저장한 상수
			play();
		}
//		if(e.getKeyCode() == e.VK_ESCAPE){
//			System.exit(0);
//		}
	}

	@Override	// 키를 눌렀다가 떼었을 때
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override	// 키보드를 통해 문자가 입력될 때
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void play(){
		String msg = jtf.getText();
		jtf.setText("");		// 내용 공백으로 바꾸기
		jta.append(msg+"\n");
		jtf.requestFocus();		// 커서를 텍스트 필드에 자동으로 넣기
	}

	
}
