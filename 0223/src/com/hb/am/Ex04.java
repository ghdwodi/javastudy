package com.hb.am;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ex04 extends JFrame implements ActionListener {
	JButton first, prev, next, last;
//	JPanel card1,card2,card3,card4,card5;
	JPanel[] card = new JPanel[5];
	JPanel pg1,pg2;
	CardLayout cardLayout;
	public Ex04(){
		setTitle("카드 레이아웃");
		pg1 = new JPanel();
		pg2 = new JPanel();
		
/*		card1 = new JPanel();
		card2 = new JPanel();
		card3 = new JPanel();
		card4 = new JPanel();
		card5 = new JPanel();
*/
		
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		
		// 해당 카드 호출시 card.show() 이용
		for (int i=0;i<card.length;i++) {
 			card[i] = new JPanel();
// 			card[i].setBackground(Color.getHSBColor(i+1,(i+1)*20,(i+1)*50));
			card[i].add(new JLabel((i+1)+"번째 카드"));
			pg1.add(card[i],"<"+(i+1)+">");
		}
		
		card[0].setBackground(Color.BLACK);
		card[1].setBackground(Color.GREEN);
		card[2].setBackground(Color.BLUE);
		card[3].setBackground(Color.RED);
		card[4].setBackground(Color.YELLOW);

		
/*		card1.setBackground(Color.BLACK);
		card2.setBackground(Color.GREEN);
		card3.setBackground(Color.BLUE);
		card4.setBackground(Color.RED);
		card5.setBackground(Color.YELLOW);
*/		
		
		

/*		card1.add(new JLabel("첫번째 카드"));
		card2.add(new JLabel("두번째 카드"));
		card3.add(new JLabel("세번째 카드"));
		card4.add(new JLabel("네번째 카드"));
		card5.add(new JLabel("다섯번째 카드"));
		
		pg1.add(card1,"<1>");
		pg1.add(card2,"<2>");
		pg1.add(card3,"<3>");
		pg1.add(card4,"<4>");
		pg1.add(card5,"<5>");
*/
		
		first = new JButton("<<");
		prev = new JButton("<");
		next = new JButton(">");
		last = new JButton(">>");
		
		pg2.add(first);
		pg2.add(prev);
		pg2.add(next);
		pg2.add(last);
		
		add(pg1,BorderLayout.CENTER);
		add(pg2,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 150);
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		first.addActionListener(this);
		prev.addActionListener(this);
		next.addActionListener(this);
		last.addActionListener(this);
		
		cardLayout.show(pg1,"<3>");
		
	}

	public static void main(String[] args) {
		new Ex04();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton jb = (JButton)(e.getSource());
		if (jb==first){
			cardLayout.first(pg1);
		} else if (jb==prev){
			cardLayout.previous(pg1);
		} else if (jb==next){
			cardLayout.next(pg1);
		} else if (jb==last){
			cardLayout.last(pg1);
		}
	}
}
