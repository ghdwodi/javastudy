package com.hb.am;

import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Ex01 extends JFrame implements ActionListener {
	JButton[] jb;
	JPanel jp;
	public Ex01(){
		setTitle("다이얼로그 연습");
		jp = new JPanel();
		jp.setLayout(new FlowLayout());
		jb = new JButton[6];
		jb[0] = new JButton("메세지");
		jb[1] = new JButton("확인");
		jb[2] = new JButton("입력");
		jb[3] = new JButton("옵션");
		jb[4] = new JButton("파일 열기");
		jb[5] = new JButton("파일 저장");
		
		for (JButton jButton : jb) {
			jp.add(jButton);
		}
		
		add(jp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-250, ds.height/2-35, 500, 70);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		for (JButton jButton : jb) {
			jButton.addActionListener(this);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jbt = (JButton)e.getSource();
		
		if (jbt==jb[0]){
			// 메세지 : 사용자에게 알리는 역할
//			JOptionPane.showMessageDialog("부모 컴포넌트", "안녕");
//			JOptionPane.showMessageDialog(jp, "안녕");
//			JOptionPane.showMessageDialog(getParent(), "안녕");
			
			// 메세지 타입(messageType) : 상수
			JOptionPane.showMessageDialog(getParent(),
					"안녕",
					"메세지 다이얼로그",
					JOptionPane.PLAIN_MESSAGE);
			
		} else if (jbt==jb[1]){
			// 확인 : 예(=0) / 아니오(=1) / 취소(=2)
//			int ans = JOptionPane.showConfirmDialog(getParent(), "자니?");
			int ans = JOptionPane.showConfirmDialog(getParent(),
					"자니?",
					"컨펌다이얼로그",
					JOptionPane.OK_CANCEL_OPTION);
					
			
		} else if (jbt==jb[2]){
			// 입력 : 사용자의 정보를 받아들인다
//			String name = JOptionPane.showInputDialog("너의 이름은");
//			String name = JOptionPane.showInputDialog("너의 이름은", "김똘똘");
			String name = JOptionPane.showInputDialog(getParent(),
					"너의 이름은",
					"인풋 다이얼로그",
					JOptionPane.QUESTION_MESSAGE);

		} else if (jbt==jb[3]){
			// 사용자 정의 다이얼로그
			JOptionPane.showOptionDialog(getParent(),
					"사용자 정의",
					"사용자 정의 다이얼로그",
					JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE,
					null,	// 아이콘 없음
					null,	// 설정 없음
					null);	// 초기값 없음
		} else if (jbt==jb[4]){
			FileDialog fd = new FileDialog(this, "파일 열기", FileDialog.LOAD);
			fd.setVisible(true);
			// 이후 사용자가 직접 I/O를 해야 한다.
		} else if (jbt==jb[5]){
			FileDialog fd = new FileDialog(this, "파일 열기", FileDialog.SAVE);
			fd.setVisible(true);
			// 이후 사용자가 직접 I/O를 해야 한다.
		}
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}
