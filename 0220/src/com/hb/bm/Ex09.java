package com.hb.bm;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

public class Ex09 extends JFrame implements ActionListener, ListSelectionListener {
	JList jlist;
	JButton jb1, jb2;
	JTextArea jta;
	JScrollPane jsp;
	JPanel jpb, jp0, jp1, jp2;
	String[] items = {"����","�౸","�߱�","��","�豸"};
	ArrayList<String> jlst;
	
	public Ex09(){
		setTitle("����Ʈ �̺�Ʈ");
		jpb = new JPanel();
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		jp0 = new JPanel();
		jlist = new JList(items);

		
		jp0.add(jlist);
		
		jp1 = new JPanel();
		
		jb1 = new JButton("exit");
		jb2 = new JButton("����");
		jp1.add(jb1);
		jp1.add(jb2);
		
		jp2 = new JPanel();
		jta = new JTextArea(4,25);
		jta.setEditable(false);
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jp1.add(jsp);
		
		jpb.add(jp0);
		jpb.add(jp1);
		jpb.add(jp2);
		
		add(jpb);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		// JList ���� ����
//		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		jlist.addListSelectionListener(this);
		
		// JList ���� ����
		jlist.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		jlist.addListSelectionListener(this);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex09();
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		boolean cng = e.getValueIsAdjusting();	// ���� ����Ǹ� true
		if (cng) {
			// ���� ������ ���
			
//			String msg = (String)((JList)e.getSource()).getSelectedValue();
//			jta.append(msg+" ����\n");
			
			// Ȥ��
//			jta.append(items[((JList)(e.getSource())).getSelectedIndex()]+" ����\n");
		} else {
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();
		if (jb==jb1){
			System.exit(0);
		} else if (jb==jb2){

			// ���� ������ ���
			jlst = (ArrayList<String>) jlist.getSelectedValuesList();
			for (String k : jlst) {
				jta.append(k+"\n");
			}
		}		
	}	
}
