package com.hb.am;

import javax.swing.*;
import java.awt.*;

public class Hw03_JFrame extends JFrame {
//	JTextField[][] jf = new JTextField[5][];
	JPanel jp1;
	Hw03_methods lotto = new Hw03_methods();
	int [][] lottoRes;
	String n ="";
	public Hw03_JFrame(){
		setTitle("로또 5개 자동");
		jp1 = new JPanel(new GridLayout(5, 6, 15, 15));
		
		lottoRes = lotto.lottoRes();
		
		for (int i=0;i<5;i++){
			jp1.add(new JLabel((i+1)+"번째:"));
			for (int j=0;j<6;j++){
				n = (" "+lottoRes[i][j]);
				jp1.add(new JTextField(n));
			}
		}
		
		add(jp1);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width/2-150, ds.height/2-150, 300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setVisible(true);
	}
}
