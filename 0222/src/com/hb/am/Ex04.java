package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class Ex04 extends JFrame implements ActionListener, KeyListener {
	JPanel jp1,jp2,jp3;
	JLabel jl1,jl2,jl3,jl4;
	JTextField jf1,jf2,jf3,jf4;
	JButton jb1,jb2,jb3;
	JTextArea ja;
	JScrollPane jsp;
	String name,grade;
	int kor,eng,math,sum;
	Double avg;
	
	public Ex04(){
		setTitle("성적");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
						
		jl1 = new JLabel("이름:");
		jl2 = new JLabel("국어:");
		jl3 = new JLabel("영어:");
		jl4 = new JLabel("수학:");
		
		jf1 = new JTextField(4);		
		jf2 = new JTextField(4);		
		jf3 = new JTextField(4);		
		jf4 = new JTextField(4);		
		
		ja = new JTextArea(
				"이름\t총점\t평균\t학점\n"
				+ "----------------------------"
				+ "---------------------------------------------------\n",
				16, 30);
		
		ja.setLineWrap(true);
		
		jsp = new JScrollPane(ja,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jb1 = new JButton("계산");
		jb2 = new JButton("종료");
		jb3 = new JButton("취소");
		
		
		jp1.add(jl1);
		jp1.add(jf1);
		jp2.add(jl2);
		jp2.add(jf2);
		jp2.add(jl3);
		jp2.add(jf3);
		jp2.add(jl4);
		jp2.add(jf4);
		jp2.add(jsp);
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.CENTER);
		add(jp3,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-200, ds.height/2-210, 400, 420);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		
	}
	
	public static void main(String[] args) {
		new Ex04();
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
			name = jf1.getText();
			kor = Integer.parseInt(jf2.getText());
			eng = Integer.parseInt(jf3.getText());
			math = Integer.parseInt(jf4.getText());
			gradeCompute(kor,eng,math);
			
			ja.append(name+"\t"+sum+"점\t"+avg+"점\t"+grade+"\n");
		} else if (jb==jb2) {
			System.exit(0);
		} else if (jb==jb3)	{
			jf1.setText("");
			jf2.setText("");
			jf3.setText("");
			jf4.setText("");
			ja.setText("");
			jf1.requestFocus();
		}
	}
	
	public void gradeCompute(int kor, int eng, int math){
		sum = kor + eng + math;
		avg = (int)(sum*100/3.0)/100.0;
		if (avg>=90){
			grade = "A학점";
		} else if (avg>=80) {
			grade = "B학점";
		} else if (avg>=70) {
			grade = "C학점";
		} else if (avg>=60) {
			grade = "D학점";
		} else {
			grade = "F학점";
		}
	}

}
