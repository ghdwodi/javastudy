package com.hb.em;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Join_JFrame extends JFrame {
	JPanel jp1, jp2, jp3, jp4;
	JButton jbOver, jbJoin, jbCancel;
	JTextField jtID, jtPW, jtPW2, jtPhone;
	JPasswordField jpw1, jpw2;
	ArrayList<String> idList = new ArrayList<>();
	TestMemberDAO tm = new TestMemberDAO();
	int idCheck = 0;
	
	public Join_JFrame() {
		setTitle("ȸ�� ����");
		
		// ����
		jp1 = new JPanel();
		jp1.add(new JLabel("ȸ������"));
		
		// �Է¶�
		jp2 = new JPanel();
		jp2.setLayout(new GridLayout(4, 2));
		
		jtID = new JTextField(15);
		jpw1 = new JPasswordField(15);
		jpw2 = new JPasswordField(15);
		jtPhone = new JTextField(15);
		
		jp2.add(new JLabel("���̵�"));
		jp2.add(jtID);
		jp2.add(new JLabel("��й�ȣ"));
		jp2.add(jpw1);
		jp2.add(new JLabel("��й�ȣȮ��"));
		jp2.add(jpw2);
		jp2.add(new JLabel("��ȭ��ȣ"));
		jp2.add(jtPhone);

		// �ߺ�Ȯ�� ��ư
		jp3 = new JPanel();
		jbOver = new JButton("�ߺ�Ȯ��");
		jp3.add(jbOver);
		
		// �Ʒ� ��ư
		jp4 = new JPanel();
		jbJoin = new JButton("ȸ������");
		jbCancel = new JButton("���");
		
		jp4.add(jbJoin);
		jp4.add(jbCancel);
		
		add(jp1, BorderLayout.NORTH);
		add(jp2, BorderLayout.CENTER);
		add(jp3, BorderLayout.EAST);
		add(jp4, BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200,ds.height/2-200,300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jbOver.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				idList = tm.selectID();
				String newID = jtID.getText();
				if (newID.length()<=0){
					JOptionPane.showConfirmDialog(getParent(),
							"���̵� �Է��Ͻʽÿ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				} else if (idList.contains(newID)){
					JOptionPane.showConfirmDialog(getParent(),
							"��� ���� ���̵��Դϴ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
					idCheck = 0;
					jtID.setText("");
				} else {
					JOptionPane.showConfirmDialog(getParent(),
							"����� �� �ִ� ���̵��Դϴ�.", "Ȯ��",
							JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
					idCheck = 1;
				}
			}
		});
		
		jbJoin.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				idList = tm.selectID();
				String newID = jtID.getText();
				String newPW = new String(jpw1.getPassword()).trim();
				String newPW2 = new String(jpw2.getPassword()).trim();
				String newPhone = jtPhone.getText();
				
				if (newID.length()<=0){
					JOptionPane.showConfirmDialog(getParent(),
							"���̵� �Է��Ͻʽÿ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				} else if (newPW.length()<=0){
					JOptionPane.showConfirmDialog(getParent(),
							"��й�ȣ�� �Է��Ͻʽÿ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				} else if (newPW2.length()<=0){
					JOptionPane.showConfirmDialog(getParent(),
							"��й�ȣ�� �ѹ� �� �Է��Ͻʽÿ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				} else if (newPhone.length()<=0){
					JOptionPane.showConfirmDialog(getParent(),
							"��ȭ��ȣ�� �Է��Ͻʽÿ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				} else if (!newPW.equals(newPW2)){
					JOptionPane.showConfirmDialog(getParent(),
							"��й�ȣ�� �ٸ��ϴ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
				} else if (idCheck!=1 || idList.contains(newID)){
					JOptionPane.showConfirmDialog(getParent(),
							"���̵� üũ�� �� �ֽʽÿ�.", "���",
							JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE);
					jtID.setText("");
					idCheck = 0;
				} else {
					int result = tm.join(newID, newPW, newPhone);
					if (result==1){
						JOptionPane.showConfirmDialog(getParent(),
								"�����մϴ�! �����ϼ̽��ϴ�.", "Ȯ��",
								JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE);
						jtID.setText("");
						jpw1.setText("");
						jpw2.setText("");
						jtPhone.setText("");
					}
				}
			}
		});
		
		jbCancel.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				tm.closeConn();
				System.exit(0);
			}
		});
	}
}
