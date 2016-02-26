package com;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class JMyLabel extends JLabel {

    String str = "1220";

    public JMyLabel(ImageIcon imageIcon) {
        super(imageIcon);
    }

    @Override
    public void paint(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Arial", Font.PLAIN, 12));
        g.setColor(Color.WHITE);
        g.drawString(str, 25 - (str.trim().length() * 5),  this.getHeight()/2 + 7);
    }

    public void repaint(String str) {
        super.repaint();
        this.str = str;
    }
}
