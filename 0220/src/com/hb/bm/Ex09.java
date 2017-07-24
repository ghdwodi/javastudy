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
	String[] items = {"선택","축구","야구","농구","배구"};
	ArrayList<String> jlst;
	
	public Ex09(){
		setTitle("리스트 이벤트");
		jpb = new JPanel();
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		jp0 = new JPanel();
		jlist = new JList(items);

		
		jp0.add(jlist);
		
		jp1 = new JPanel();
		
		jb1 = new JButton("exit");
		jb2 = new JButton("선택");
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
		
		// JList 단일 선택
//		jlist.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//		jlist.addListSelectionListener(this);
		
		// JList 다중 선택
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
		boolean cng = e.getValueIsAdjusting();	// 값이 변경되면 true
		if (cng) {
			// 단일 선택일 경우
			
//			String msg = (String)((JList)e.getSource()).getSelectedValue();
//			jta.append(msg+" 선택\n");
			
			// 혹은
//			jta.append(items[((JList)(e.getSource())).getSelectedIndex()]+" 선택\n");
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

			// 다중 선택일 경우
			jlst = (ArrayList<String>) jlist.getSelectedValuesList();
			for (String k : jlst) {
				jta.append(k+"\n");
			}
		}		
	}	
}
