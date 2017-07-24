package com.hb.am;

import java.awt.*;

import javax.swing.*;


public class Ex03 extends JFrame {
	public Ex03(){
		// 왼쪽으로 붙이려면 FlowerLayout.LEFT 사용
		
		setTitle("회원가입");
		
		JPanel bigJp = new JPanel();
		bigJp.setLayout(new BoxLayout(bigJp, BoxLayout.Y_AXIS));
		
		// 각 행 껍데기
				
		JPanel[] jp_s = new JPanel[5];
		
		for (int i=0 ; i<jp_s.length; i++) {
			jp_s[i].setLayout(new BorderLayout());
		}
				
		// 1행 : 성명, 성별(라디오버튼)
				
		JPanel jp1 = new JPanel();
		jp1.setLayout(new BoxLayout(jp1, BoxLayout.X_AXIS));
		JTextField jf1 = new JTextField(20);
		ButtonGroup gb = new ButtonGroup();
		JRadioButton jr1 = new JRadioButton("남");
		JRadioButton jr2 = new JRadioButton("여");
		gb.add(jr1);
		gb.add(jr2);
		
		jp1.add(new JLabel("성 명"));
		jp1.add(jf1);
		jp1.add(new JLabel("성 별"));
		jp1.add(jr1);
		jp1.add(jr2);
		
		jp_s[0].add(jp1,BorderLayout.WEST);
		
		// 2행 : 생년월일
		
		JPanel jp2 = new JPanel();
		jp2.setLayout(new BoxLayout(jp2, BoxLayout.X_AXIS));
		
		JTextField jf2 = new JTextField(10);
		
		jp2.add(new JLabel("생년월일"));
		jp2.add(jf2);
		
		jp_s[1].add(jp2,BorderLayout.WEST);
		
		// 3행 : 주소
		
		JPanel jp3 = new JPanel();
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.X_AXIS));
		
		JTextField jf3 = new JTextField(40);
		
		jp3.add(new JLabel("주소"));
		jp3.add(jf3);
		
		jp_s[2].add(jp3,BorderLayout.WEST);
		
		// 4행 : 부서명
		
		JPanel jp4 = new JPanel();
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.X_AXIS));
		
		String[] depList = {"부서","기획부","총무부","영업부","생산부"}; 
		JComboBox jcom = new JComboBox(depList);
		
		jp4.add(new JLabel("부서명"));
		jp4.add(jcom);
		
		jp_s[3].add(jp4,BorderLayout.WEST);
		
		// 5행 : 취미
		
		JPanel jp5 = new JPanel();
		jp5.setLayout(new BoxLayout(jp5, BoxLayout.X_AXIS));
		
		JCheckBox jcb1 = new JCheckBox("운동");
		JCheckBox jcb2 = new JCheckBox("영화");
		JCheckBox jcb3 = new JCheckBox("독서");
		JCheckBox jcb4 = new JCheckBox("컴퓨터");
		
		jp5.add(new JLabel("취미"));
		jp5.add(jcb1);
		jp5.add(jcb2);
		jp5.add(jcb3);
		jp5.add(jcb4);
		
		jp_s[4].add(jp5,BorderLayout.WEST);
		
		// 6행 : 자기소개
		
		JPanel jp6 = new JPanel();
						
		JTextArea jta = new JTextArea(40, 20);
		
		JScrollPane jsp = new JScrollPane(
				jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER
				);
		
		jp6.add(new JLabel("자기소개"));
		jp6.add(jsp);
		
		// 7행 : 버튼
		
		JPanel jp7 = new JPanel();
		
		JButton jb1 = new JButton("저장");
		JButton jb2 = new JButton("종료");
		JButton jb3 = new JButton("취소");
		
		jp7.add(jb1);
		jp7.add(jb2);
		jp7.add(jb3);
		
		// 1 ~ 5행을 바탕 패널에 부착
		
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
