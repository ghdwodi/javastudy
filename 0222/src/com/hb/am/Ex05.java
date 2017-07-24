package com.hb.am;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ex05 extends JFrame implements ActionListener, KeyListener, ItemListener {
	JPanel jp1,jp2,jp3,jp4,jp5;
	ButtonGroup gb;
	JRadioButton jr1,jr2,jr3,jr4;
	JTextField jf1,jf2;
	JTextArea ja;
	JScrollPane jsp;
	JButton jb1,jb2,jb3;
	int price, num, pay, total, change;
	Double vatRate = 0.1;
	String name ="";
	
	public Ex05(){
		setTitle("카페");
		setLayout(new FlowLayout());
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();
		jp5 = new JPanel();
				
		gb = new ButtonGroup();
		jr1 = new JRadioButton("아메리카노(3000)");
		jr2 = new JRadioButton("카페모카(4000)");
		jr3 = new JRadioButton("카페라떼(3500)");
		jr4 = new JRadioButton("과일쥬스(3000)");

		gb.add(jr1);
		gb.add(jr2);
		gb.add(jr3);
		gb.add(jr4);
				
		jf1 = new JTextField(10);		
		jf2 = new JTextField(10);		
		
		ja = new JTextArea(15, 40);
		
		ja.setLineWrap(true);
		
		jsp = new JScrollPane(ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("취소");
		
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.X_AXIS));
		
		
		jp1.add(new JLabel("원하는 커피 선택"));
		jp1.add(jf1);
		jp2.add(jr1);
		jp2.add(jr2);
		jp2.add(jr3);
		jp2.add(jr4);
		jp3.add(new JLabel("수량 :  "));
		jp3.add(jf1);
		jp3.add(new JLabel("         입금액 :  "));
		jp3.add(jf2);
		jp4.add(jsp);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jb3);
		
		
		add(jp1);
		add(jp2);
		add(jp3);
		add(jp4);
		add(jp5);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-225, 500, 450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jr1.addItemListener(this);
		jr2.addItemListener(this);
		jr3.addItemListener(this);
		jr4.addItemListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();
		if (jb==jb1){
			num = Integer.parseInt(jf1.getText());
			pay = Integer.parseInt(jf2.getText());
			total = totalCompute(price,num);
			change = pay-total;
			ja.append(name+" "+num+"잔, 받은돈 "+pay+"원, 거스름돈 "+change+"원\n");
			
		} else if (jb==jb2) {
			System.exit(0);
		} else if (jb==jb3)	{
			jf1.setText("");
			jf2.setText("");
			ja.setText("");
			jf1.requestFocus();
		}
	}
	
	public int totalCompute(int price, int number){
		int total;
		total = (int)(price * number * (1+vatRate));
		return total;
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getStateChange()==e.SELECTED){
			if (jr1.isSelected()){
				name = "아메리카노";
				price = 3000;
			} else if (jr2.isSelected()){
				name = "카페모카";
				price = 4000;
			} else if (jr3.isSelected()){
				name = "카페라떼";
				price = 3500;
			} else if (jr4.isSelected()){
				name = "과일쥬스";
				price = 3000;
			}
		}
	}

}
