package com.hb.am;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex01 extends JFrame implements ActionListener {
	JButton[] jb;
	JPanel jp;
	public Ex01(){
		setTitle("���̾�α� ����");
		jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jb = new JButton[6];
		jb[0] = new JButton("�޼���");
		jb[1] = new JButton("Ȯ��");
		jb[2] = new JButton("�Է�");
		jb[3] = new JButton("�ɼ�");
		jb[4] = new JButton("���� ����");
		jb[5] = new JButton("���� ����");
		
		for (JButton jButton : jb) {
			jp.add(jButton);
		}
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-35, 500, 70);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (JButton jButton : jb) {
			jButton.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jbt = (JButton)e.getSource();
		
		if (jbt==jb[0]){
			// �޼��� : ����ڿ��� �˸��� ����
//			JOptionPane.showMessageDialog("�θ� ������Ʈ", "�ȳ�");
//			JOptionPane.showMessageDialog(jp, "�ȳ�");
//			JOptionPane.showMessageDialog(getParent(), "�ȳ�");
			
			// �޼��� Ÿ��(messageType) : ���
			JOptionPane.showMessageDialog(getParent(),
					"�ȳ�",
					"�޼��� ���̾�α�",
					JOptionPane.PLAIN_MESSAGE);
			
		} else if (jbt==jb[1]){
			// Ȯ�� : ��(=0) / �ƴϿ�(=1) / ���(=2)
//			int ans = JOptionPane.showConfirmDialog(getParent(), "�ڴ�?");
			int ans = JOptionPane.showConfirmDialog(getParent(),
					"�ڴ�?",
					"���ߴ��̾�α�",
					JOptionPane.OK_CANCEL_OPTION);
					
			
		} else if (jbt==jb[2]){
			// �Է� : ������� ������ �޾Ƶ��δ�
//			String name = JOptionPane.showInputDialog("���� �̸���");
//			String name = JOptionPane.showInputDialog("���� �̸���", "��ʶ�");
			String name = JOptionPane.showInputDialog(getParent(),
					"���� �̸���",
					"��ǲ ���̾�α�",
					JOptionPane.QUESTION_MESSAGE);

		} else if (jbt==jb[3]){
			// ����� ���� ���̾�α�
			JOptionPane.showOptionDialog(getParent(),
					"����� ����",
					"����� ���� ���̾�α�",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,	// ������ ����
					null,	// ���� ����
					null);	// �ʱⰪ ����
		} else if (jbt==jb[4]){
			FileDialog fd = new FileDialog(this, "���� ����", FileDialog.LOAD);
			fd.setVisible(true);
			// ���� ����ڰ� ���� I/O�� �ؾ� �Ѵ�.
		} else if (jbt==jb[5]){
			FileDialog fd = new FileDialog(this, "���� ����", FileDialog.SAVE);
			fd.setVisible(true);
			// ���� ����ڰ� ���� I/O�� �ؾ� �Ѵ�.
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
