package com.hb.am;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ex03 extends JFrame implements ActionListener,ItemListener,KeyListener {
	JPanel jp;
	JLabel jl1,jl2,jl3;
	JTextField jf1,jf2;
	ButtonGroup bg;
	JComboBox jc;
	JTextArea ja;
	JScrollPane jsp;
	JButton jb1,jb2,jb3;
	int su1,su2,res;
	String op;
	public Ex03(){
		setTitle("계산기 3");
		jp = new JPanel();
		
		jl1 = new JLabel("수1:");
		jl2 = new JLabel("수2:");
		jl3 = new JLabel("연산자:");
		
		jf1 = new JTextField(4);		
		jf2 = new JTextField(4);
		
		String[] items = {"선택하세요", " +", " -", " *", " /"};
		
		jc = new JComboBox(items);
		
		ja = new JTextArea(16, 35);
		
		ja.setLineWrap(true);
		
		JScrollPane jsp = new JScrollPane(ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("취소");
		
		
		
		jp.add(jl1);
		jp.add(jf1);
		jp.add(jl2);
		jp.add(jf2);
		jp.add(jl3);
		jp.add(jc);		
		jp.add(jsp);
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-200, 400, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jc.addItemListener(this);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex03();
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
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String jcb = (String)e.getItem();
		if (e.getStateChange() == e.SELECTED){
			op = jcb;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		if (jb==jb1){
			if (jf1.getText().length()==0 || 
					jf2.getText().length()==0 ||
					op.length()==0 ||
					!(op.equals(" +") || op.equals(" -") || 
					  op.equals(" *") || op.equals(" /")) || 
					(jf2.getText().equals("0") && op.equals(" /"))){
					
					ja.append("제대로 입력하세요\n");
				} else {
					su1 = Integer.parseInt(jf1.getText());
					su2 = Integer.parseInt(jf2.getText());
					res = 0;
					
					switch (op) {
						case " +": res = su1 + su2; break;
						case " -": res = su1 - su2; break;
						case " *": res = su1 * su2; break;
						case " /": res = su1 / su2; break;
//				default:break;
					}
					ja.append(su1+" "+op+" "+su2+" = "+res+"\n");
				}
		} else if (jb==jb2) {
			System.exit(0);
		} else if (jb==jb3) {
			jf1.setText("");
			jf2.setText("");
			ja.setText("");
			jf1.requestFocus();
			op = null;
			jc.setSelectedIndex(0);
		}
	}

}
