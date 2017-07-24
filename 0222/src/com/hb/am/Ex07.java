package com.hb.am;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Enumeration;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class Ex07 extends JFrame implements ActionListener, ItemListener, KeyListener{
	JPanel jp1,jp2,jp3,jp4,jp5;
	ButtonGroup gb1,gb2,gb3;
	JRadioButton jr1,jr2,jr3,jr4,jr5,jr6,jr7,jr8,jr9,jr10;
	JButton jb1,jb2;
	JTextField jf;
	int pizza, topping, size;
	int price;
	
	public Ex07(){
		setTitle("피자 주문판");
		
		jp1 = new JPanel();	// "자바 피자에 오신 것을 환영합니다
		jp2 = new JPanel();	// 종류 : 콤보, 포테이토, 불고기 (라디오버튼 수직정렬)
		jp3 = new JPanel();	// 추가토핑 : 피망, 치즈, 페퍼로니, 베이컨 (라디오버튼 수직정렬)
		jp4 = new JPanel();	// 크기 : small, medium, large (라디오버튼 수직정렬)
		jp5 = new JPanel();	// 주문, 취소, [] (버튼 2개, 텍스트프레임)
		
		/*jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.Y_AXIS));*/
		
		jp2.setLayout(new GridLayout(3, 1));
		jp3.setLayout(new GridLayout(4, 1));
		jp4.setLayout(new GridLayout(3, 1));
		
		// 각 패널 제목
		
		jp2.setBorder(new TitledBorder(BorderFactory.createTitledBorder("종류")));
		jp3.setBorder(new TitledBorder(BorderFactory.createTitledBorder("추가토핑")));
		jp4.setBorder(new TitledBorder(BorderFactory.createTitledBorder("크기")));
		
		// 라디오버튼 버튼그룹 설정
		
		gb1 = new ButtonGroup();
		gb2 = new ButtonGroup();
		gb3 = new ButtonGroup();
		
		// 라디오버튼
		
		jr1 = new JRadioButton("콤보");	// 15000원
		jr2 = new JRadioButton("포테이토");	// 20000원
		jr3 = new JRadioButton("불고기");	// 30000원
		
		gb1.add(jr1);		
		gb1.add(jr2);		
		gb1.add(jr3);
		
		jr4 = new JRadioButton("피망");	// 1000원
		jr5 = new JRadioButton("치즈");		// 500원
		jr6 = new JRadioButton("페퍼로니");	// 1000원
		jr7 = new JRadioButton("베이컨");	// 1500원
		
		gb2.add(jr4);
		gb2.add(jr5);
		gb2.add(jr6);
		gb2.add(jr7);
		
		jr8 = new JRadioButton("Small");		// 0.8배
		jr9 = new JRadioButton("Medium");	// 기본
		jr10 = new JRadioButton("Large");		// 1.2배
		
		gb3.add(jr8);
		gb3.add(jr9);
		gb3.add(jr10);
		
		// 버튼, 텍스트프레임
		
		jb1 = new JButton("주문");
		jb2 = new JButton("취소");
		jf = new JTextField(10);
		jf.setEditable(false);
		
		// 각 패널에 부착
		
		jp1.add(new JLabel("자바 피자에 오신 것을 환영합니다."));
		jp2.add(jr1);
		jp2.add(jr2);
		jp2.add(jr3);
		jp3.add(jr4);
		jp3.add(jr5);
		jp3.add(jr6);
		jp3.add(jr7);
		jp4.add(jr8);
		jp4.add(jr9);
		jp4.add(jr10);
		jp5.add(jb1);
		jp5.add(jb2);
		jp5.add(jf);
		
		// 프레임에 부착
		
		add(jp1,BorderLayout.NORTH);
		add(jp2,BorderLayout.WEST);
		add(jp3,BorderLayout.CENTER);
		add(jp4,BorderLayout.EAST);
		add(jp5,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-220, ds.height/2-160, 400, 320);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
		
		jr1.addItemListener(this);
		jr2.addItemListener(this);
		jr3.addItemListener(this);
		
		jr4.addItemListener(this);
		jr5.addItemListener(this);
		jr6.addItemListener(this);
		jr7.addItemListener(this);
		
		jr8.addItemListener(this);
		jr9.addItemListener(this);
		jr10.addItemListener(this);
		
		jb1.addActionListener(this);
		jb2.addActionListener(this);
	}
	
	public static void main(String[] args) {
		new Ex07();
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
/*		price=0;
		if (e.getStateChange() == e.SELECTED){
			if (jr1.isSelected()){
				price += 15000;
			} else if (jr2.isSelected()){
				price += 20000;
			} else if (jr3.isSelected()){
				price += 30000;
			}
			if (jr4.isSelected()){
				price += 1000;
			} else if (jr5.isSelected()){
				price += 500;
			} else if (jr6.isSelected()){
				price += 1000;
			} else if (jr7.isSelected()){
				price += 1500;
			}
			if (jr8.isSelected()){
				price = (int)(price*0.8/100)*100;
			} else if (jr9.isSelected()){				
			} else if (jr10.isSelected()){
				price = (int)(price*1.2/100)*100;
			}
		}
*/
		Enumeration<AbstractButton> enums = gb1.getElements();
		// 버튼그룹의 요소가 없을 때까지 하나씩 추출해 추상적인 버튼으로 반환한다.
		while(enums.hasMoreElements()){
			AbstractButton ab = enums.nextElement();
			JRadioButton jrb = (JRadioButton) ab;
			if(jrb.isSelected()){
				price = 0;
				if (jrb==jr1){
					price+=15000;
				} else if (jrb==jr2){
					price+=20000;
				} else if (jrb==jr3){
					price+=30000;
				}
			}
		}
		enums = gb2.getElements();
		// 버튼그룹의 요소가 없을 때까지 하나씩 추출해 추상적인 버튼으로 반환한다.
		while(enums.hasMoreElements()){
			AbstractButton ab = enums.nextElement();
			JRadioButton jrb = (JRadioButton) ab;
			if(jrb.isSelected()){
				if (jrb==jr4){
					price+=1000;
				} else if (jrb==jr5){
					price+=500;
				} else if (jrb==jr6){
					price+=1000;
				} else if (jrb==jr7){
					price+=1500;
				}
			}
		}
		enums = gb3.getElements();
		// 버튼그룹의 요소가 없을 때까지 하나씩 추출해 추상적인 버튼으로 반환한다.
		while(enums.hasMoreElements()){
			AbstractButton ab = enums.nextElement();
			JRadioButton jrb = (JRadioButton) ab;
			if(jrb.isSelected()){
				if (jrb==jr8){
					price=(int)(price*0.8/10)*10;
				} else if (jrb==jr10){
					price=(int)(price*1.2/10)*10;
				}
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)e.getSource();
		if (jb==jb1){
			jf.setText(price+"원");
		} else if (jb==jb2){
			jf.setText("");
			gb1.clearSelection();	// 라디오버튼 그룹 초기화
			gb2.clearSelection();
			gb3.clearSelection();
			price = 0;
		}
	}

}
