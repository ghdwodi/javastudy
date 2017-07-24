package com.hb.bm;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Ex08 extends JFrame implements ActionListener, ItemListener {
	JComboBox jcom;
	JButton jb;
	JTextArea jta;
	JScrollPane jsp;
	JPanel jpb, jp1, jp2;
	
	public Ex08(){
		setTitle("콤보박스");
		jpb = new JPanel();
		jpb.setLayout(new BoxLayout(jpb, BoxLayout.Y_AXIS));
		
		jp1 = new JPanel();
		String[] items = {"선택하세요","축구","야구","농구","배구"};
		jcom = new JComboBox(items);
		jb = new JButton("exit");
		
		jp1.add(jcom);
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
		
		jcom.addItemListener(this);
		jb.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex08();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String jc = (String)e.getItem();
	
		// TODO Auto-generated method stub
		if (e.getStateChange() == e.SELECTED){
			jta.append(jc+" 선택\n");
			
		} 
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
