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
		setTitle("�ؽ�Ʈ �̺�Ʈ");
		jpb = new JPanel();
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		jp1 = new JPanel();
		jtf = new JTextField(14);
		jb = new JButton("�Է�");
		jb.setEnabled(false);	// ��ư ���̱�
		
		jp1.add(new JLabel("���� :"));
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

	@Override	// �ؽ�Ʈ �ʵ��� ������ ����� ��
	public void changedUpdate(DocumentEvent e) {
	}

	@Override	// �ؽ�Ʈ �ʵ��� ������ ���Ե� ��
	public void insertUpdate(DocumentEvent e) {
		jb.setEnabled(true);
	}

	@Override	// �ؽ�Ʈ �ʵ��� ������ ������ ��
	public void removeUpdate(DocumentEvent e) {
		if (e.getOffset()==0){
			jb.setEnabled(false);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		play();
	}

	@Override	// Ű�� ������ ��
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == e.VK_ENTER){	// ������ Ű�ڵ带 ������ ���
			play();
		}
//		if(e.getKeyCode() == e.VK_ESCAPE){
//			System.exit(0);
//		}
	}

	@Override	// Ű�� �����ٰ� ������ ��
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override	// Ű���带 ���� ���ڰ� �Էµ� ��
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void play(){
		String msg = jtf.getText();
		jtf.setText("");		// ���� �������� �ٲٱ�
		jta.append(msg+"\n");
		jtf.requestFocus();		// Ŀ���� �ؽ�Ʈ �ʵ忡 �ڵ����� �ֱ�
	}

	
}
