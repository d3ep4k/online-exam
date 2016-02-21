package com;

import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JMyLabel extends JLabel{
	String str = "0";
	public JMyLabel(ImageIcon imageIcon){
		super(imageIcon);
	}
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		g.setFont(new Font("Arial", Font.PLAIN, 12));
		g.drawString(str, 40-(str.trim().length()*3), 28);
	}
	
	public void repaint(String str) {
		super.repaint();
		this.str = str;
	}
}