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
		setTitle("���� �ֹ���");
		
		jp1 = new JPanel();	// "�ڹ� ���ڿ� ���� ���� ȯ���մϴ�
		jp2 = new JPanel();	// ���� : �޺�, ��������, �Ұ�� (������ư ��������)
		jp3 = new JPanel();	// �߰����� : �Ǹ�, ġ��, ���۷δ�, ������ (������ư ��������)
		jp4 = new JPanel();	// ũ�� : small, medium, large (������ư ��������)
		jp5 = new JPanel();	// �ֹ�, ���, [] (��ư 2��, �ؽ�Ʈ������)
		
		/*jp2.setLayout(new BoxLayout(jp2, BoxLayout.Y_AXIS));
		jp3.setLayout(new BoxLayout(jp3, BoxLayout.Y_AXIS));
		jp4.setLayout(new BoxLayout(jp4, BoxLayout.Y_AXIS));*/
		
		jp2.setLayout(new GridLayout(3, 1));
		jp3.setLayout(new GridLayout(4, 1));
		jp4.setLayout(new GridLayout(3, 1));
		
		// �� �г� ����
		
		jp2.setBorder(new TitledBorder(BorderFactory.createTitledBorder("����")));
		jp3.setBorder(new TitledBorder(BorderFactory.createTitledBorder("�߰�����")));
		jp4.setBorder(new TitledBorder(BorderFactory.createTitledBorder("ũ��")));
		
		// ������ư ��ư�׷� ����
		
		gb1 = new ButtonGroup();
		gb2 = new ButtonGroup();
		gb3 = new ButtonGroup();
		
		// ������ư
		
		jr1 = new JRadioButton("�޺�");	// 15000��
		jr2 = new JRadioButton("��������");	// 20000��
		jr3 = new JRadioButton("�Ұ��");	// 30000��
		
		gb1.add(jr1);		
		gb1.add(jr2);		
		gb1.add(jr3);
		
		jr4 = new JRadioButton("�Ǹ�");	// 1000��
		jr5 = new JRadioButton("ġ��");		// 500��
		jr6 = new JRadioButton("���۷δ�");	// 1000��
		jr7 = new JRadioButton("������");	// 1500��
		
		gb2.add(jr4);
		gb2.add(jr5);
		gb2.add(jr6);
		gb2.add(jr7);
		
		jr8 = new JRadioButton("Small");		// 0.8��
		jr9 = new JRadioButton("Medium");	// �⺻
		jr10 = new JRadioButton("Large");		// 1.2��
		
		gb3.add(jr8);
		gb3.add(jr9);
		gb3.add(jr10);
		
		// ��ư, �ؽ�Ʈ������
		
		jb1 = new JButton("�ֹ�");
		jb2 = new JButton("���");
		jf = new JTextField(10);
		jf.setEditable(false);
		
		// �� �гο� ����
		
		jp1.add(new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�."));
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
		
		// �����ӿ� ����
		
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
		// ��ư�׷��� ��Ұ� ���� ������ �ϳ��� ������ �߻����� ��ư���� ��ȯ�Ѵ�.
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
		// ��ư�׷��� ��Ұ� ���� ������ �ϳ��� ������ �߻����� ��ư���� ��ȯ�Ѵ�.
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
		// ��ư�׷��� ��Ұ� ���� ������ �ϳ��� ������ �߻����� ��ư���� ��ȯ�Ѵ�.
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
			jf.setText(price+"��");
		} else if (jb==jb2){
			jf.setText("");
			gb1.clearSelection();	// ������ư �׷� �ʱ�ȭ
			gb2.clearSelection();
			gb3.clearSelection();
			price = 0;
		}
	}

}
