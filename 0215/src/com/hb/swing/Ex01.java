package com.hb.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// ������Ʈ : Ư���� ���, �Ǵ� ���õ� ����� �����ϴ� �ϳ��� ��ü
//		    ȭ���� �����ϴ� ��ü
//		    ���̺�, �޺� �ڽ�, ����Ʈ, ���� ��ư, üũ �ڽ�, �����̳�, etc...
//
// �����̳� : �ڱ��� ������ ������Ʈ�� ���Խ�Ű�� �����ϴ� ������ �ϸ�, �ٸ� �����̳ʸ� ���Խ�ų ���� �ִ� ��ü
//		   ex) �г�, ���̾�α�, ������, ��ũ�� ����, etc...
//
// ������ : �ϳ��� â�� ���Ѵ�.
//
// â�� ���� : ��ǻ�� | â(������) | �г�(�����̳�) | ������Ʈ | ���

public class Ex01 extends JFrame {
	public Ex01(){
		// �θ� Ŭ���� JFrame�� ������
		super("��ư ������Ʈ");
		
		// ������Ʈ
		JButton jb1 = new JButton();
		jb1.setText("ù��° ��ư");
		JButton jb2 = new JButton("�ι�° ��ư");
		JButton jb3 = new JButton("����° ��ư");
		JButton jb4 = new JButton("�׹�° ��ư");
		JButton jb5 = new JButton("�ټ���° ��ư");
		
		// �����̳�
		JPanel jp = new JPanel();
		
		// add �޼ҵ� : ������Ʈ�� �����̳ʿ� ���δ�.
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		// ������Ʈ�� ���� �����̳ʸ� �����ӿ� ���δ�.
		// �����ӵ� �����̳��̹Ƿ� ������Ʈ�� �ٷ� �����ӿ� ���� ���� �ִ�.
		
		add(jp);
//		add(jb1);	// �г��� ������ �ʰ� �ٷ� ��ư ������Ʈ�� �����ӿ� ���̸� �������� �� ä��� ��ư �ϳ��� ���������.
//		add(jb2);	// �г��� ������ ������Ʈ�� ��ġ�ϴ� ��ı��� �����ϰ� �ִ�.
		
		
		setSize(300, 300);
		setLocation(0, 0);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new Ex01();
	}
}
