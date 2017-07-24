package com.hb.am;

import java.awt.*;

import javax.swing.*;


public class Ex03 extends JFrame {
	public Ex03(){
		// �������� ���̷��� FlowerLayout.LEFT ���
		
		setTitle("ȸ������");
		
		JPanel bigJp = new JPanel();
		bigJp.setLayout(new BoxLayout(bigJp, BoxLayout.Y_AXIS));
		
		// �� �� ������
				
		JPanel[] jp_s = new JPanel[5];
		
		for (int i=0 ; i<jp_s.length; i++) {
			jp_s[i].setLayout(new BorderLayout());
		}
				
		// 1�� : ����, ����(������ư)
				
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
		JTextField jf1 = new JTextField(20);
		ButtonGroup gb = new ButtonGroup();
		JRadioButton jr1 = new JRadioButton("��");
		JRadioButton jr2 = new JRadioButton("��");
		gb.add(jr1);
		gb.add(jr2);
		
		jp1.add(new JLabel("�� ��"));
		jp1.add(jf1);
		jp1.add(new JLabel("�� ��"));
		jp1.add(jr1);
		jp1.add(jr2);
		
		jp_s[0].add(jp1,BorderLayout.WEST);
		
		// 2�� : �������
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		
		JTextField jf2 = new JTextField(10);
		
		jp2.add(new JLabel("�������"));
		jp2.add(jf2);
		
		jp_s[1].add(jp2,BorderLayout.WEST);
		
		// 3�� : �ּ�
		
		JPanel jp3 = new JPanel();
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
		
		JTextField jf3 = new JTextField(40);
		
		jp3.add(new JLabel("�ּ�"));
		jp3.add(jf3);
		
		jp_s[2].add(jp3,BorderLayout.WEST);
		
		// 4�� : �μ���
		
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.X_AXIS));
		
		String[] depList = {"�μ�","��ȹ��","�ѹ���","������","�����"}; 
		JComboBox jcom = new JComboBox(depList);
		
		jp4.add(new JLabel("�μ���"));
		jp4.add(jcom);
		
		jp_s[3].add(jp4,BorderLayout.WEST);
		
		// 5�� : ���
		
		JPanel jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.X_AXIS));
		
		JCheckBox jcb1 = new JCheckBox("�");
		JCheckBox jcb2 = new JCheckBox("��ȭ");
		JCheckBox jcb3 = new JCheckBox("����");
		JCheckBox jcb4 = new JCheckBox("��ǻ��");
		
		jp5.add(new JLabel("���"));
		jp5.add(jcb1);
		jp5.add(jcb2);
		jp5.add(jcb3);
		jp5.add(jcb4);
		
		jp_s[4].add(jp5,BorderLayout.WEST);
		
		// 6�� : �ڱ�Ұ�
		
		JPanel jp6 = new JPanel();
						
		JTextArea jta = new JTextArea(40, 20);
		
		JScrollPane jsp = new JScrollPane(
				jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jp6.add(new JLabel("�ڱ�Ұ�"));
		jp6.add(jsp);
		
		// 7�� : ��ư
		
		JPanel jp7 = new JPanel();
		
		JButton jb1 = new JButton("����");
		JButton jb2 = new JButton("����");
		JButton jb3 = new JButton("���");
		
		jp7.add(jb1);
		jp7.add(jb2);
		jp7.add(jb3);
		
		// 1 ~ 5���� ���� �гο� ����
		
		for (int i=0; i<jp_s.length; i++){
			bigJp.add(jp_s[i]);
		}
		
		bigJp.add(jp6);
		bigJp.add(jp7);
		
		
		add(bigJp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-250, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
