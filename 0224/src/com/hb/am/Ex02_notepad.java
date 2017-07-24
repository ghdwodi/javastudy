package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

// 메뉴작성법
// 하위 메뉴부터 만들기 (JMenuItem)
// 메뉴 만들기
// 메뉴바 만들기
// 프레임에 부착

public class Ex02_notepad extends JFrame implements ActionListener {
	JTextArea jta;
	JScrollPane jsp;
	JMenuItem jmi1,jmi2,jmi3,jmi4,jmi5,jmi6,jmi7,jmi8,jmi9;
	JMenu jm1,jm2,jm3,jm4;
	JMenuBar jmb;
	public Ex02_notepad(){
		setTitle("간단 메모장 ver 0.1");
		jta = new JTextArea();
		jta.setLineWrap(true);
		jsp = new JScrollPane(jta,
				ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jmi1 = new JMenuItem("새 파일");
		jmi2 = new JMenuItem("열  기...");
		jmi3 = new JMenuItem("저  장...");
		jmi4 = new JMenuItem("종  료...");
		jmi5 = new JMenuItem("돋움, 기울기, 30");
		jmi6 = new JMenuItem("궁서, 굵게, 40");
		jmi7 = new JMenuItem("굴림, 기본, 50");
		jmi8 = new JMenuItem("도움말");
		jmi9 = new JMenuItem("메모장 정보");
		
		jm1 = new JMenu("파  일");
		jm2 = new JMenu("서  식");
		jm3 = new JMenu("도움말");
		jm4 = new JMenu("글자 크기");
		
		jmb = new JMenuBar();
		
		jm1.add(jmi1);
		jm1.add(jmi2);
		jm1.add(jmi3);
		jm1.addSeparator();
		jm1.add(jmi4);
		
		jm4.add(jmi5);
		jm4.add(jmi6);
		jm4.add(jmi7);
		
		jm2.add(jm4);
		
		jm3.add(jmi8);
		jm3.add(jmi9);
		
		jmb.add(jm1);
		jmb.add(jm2);
		jmb.add(jm3);
		
		setJMenuBar(jmb);	// 메뉴바를 프레임 메뉴바에 부착
		
		add(jsp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		jmi1.addActionListener(this);
		jmi2.addActionListener(this);
		jmi3.addActionListener(this);
		jmi4.addActionListener(this);
		jmi5.addActionListener(this);
		jmi6.addActionListener(this);
		jmi7.addActionListener(this);
		jmi8.addActionListener(this);
		jmi9.addActionListener(this);
	}

	public static void main(String[] args) {
		new Ex02_notepad();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JMenuItem jmi = (JMenuItem)e.getSource();
		if(jmi == jmi1){				// 새 파일
			int size = jta.getText().length();
			if (size == 0){
				jta.setText("");
			} else {
				int res = JOptionPane.showConfirmDialog(getParent(), "저장할까요?");
				if (res==0){
					FileDialog fd = new FileDialog(this, "저장하기", FileDialog.SAVE);
					fd.setVisible(true);
					// 저장기능(I/O) 후 새 글
					
					jta.setText("");
					
				} else if (res==1){
					jta.setText("");
				}
			}
		} else if (jmi == jmi2){	// 열기
			FileDialog fd = new FileDialog(this, "불러오기", FileDialog.LOAD);
			fd.setVisible(true);
			// I/O 기능 미실장
			
		} else if (jmi == jmi3){	// 저장
			FileDialog fd = new FileDialog(this, "저장하기", FileDialog.SAVE);
			fd.setVisible(true);
			// I/O 기능 미실장
			
		} else if (jmi == jmi4){	// 종료
			System.exit(0);
		} else if (jmi == jmi5){	// 돋움, 기울기, 30
			Font font = new Font("돋움", Font.ITALIC, 30);
			jta.setFont(font);
		} else if (jmi == jmi6){	// 궁서, 굵게, 40
			Font font = new Font("궁서", Font.BOLD, 40);
			jta.setFont(font);
		} else if (jmi == jmi7){	// 굴림, 기본, 50
			Font font = new Font("굴림", Font.PLAIN, 50);
			jta.setFont(font);
		} else if (jmi == jmi8){	// 도움말
			JOptionPane.showMessageDialog(getParent(), "그런 거 없다");
		} else if (jmi == jmi9){	// 정보
			JOptionPane.showMessageDialog(getParent(), "간단 메모장 ver 0.1");
		}
	}
}
