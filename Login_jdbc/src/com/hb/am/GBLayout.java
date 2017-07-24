package com.hb.am;

import java.awt.Component;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JPanel;

public class GBLayout extends JPanel {
	GridBagLayout gb;
	GridBagConstraints gbc;
	private Component com;
	private int x,y,width,height,weightx,weighty;
	
	public GBLayout() {
		gb = new GridBagLayout();
		setLayout(gb);
		
		gbc = new GridBagConstraints();
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
	}

	public void addToGB(Component com, int x, int y, int width, int height,
			double weightx, double weighty) {
		gb = new GridBagLayout();
		setLayout(gb);
		
		gbc = new GridBagConstraints();
		
		gbc.gridx = x;
		gbc.gridy = y;
		gbc.gridwidth = width;
		gbc.gridheight = height;
		gbc.weightx = weightx;
		gbc.weighty = weighty;
		
		this.add(com,gbc);
	}
	
//	public void 
}
