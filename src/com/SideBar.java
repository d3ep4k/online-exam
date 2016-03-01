/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.ImageUtil;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
class SideBar extends JPanel {

    public SideBar() {
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel examDescPanel = new JPanel();
        examDescPanel.setPreferredSize(new Dimension(100, 40));
        examDescPanel.setLayout(new GridLayout(2, 1));
//        examDescPanel.setBackground(Color.red);
        JPanel examDescPanelTop = new JPanel(new FlowLayout(FlowLayout.LEFT));
        examDescPanelTop.add(new DescLabel("FILE:  ", Font.BOLD));
        examDescPanelTop.add(new DescLabel("EXAMPLE FILE", Font.PLAIN));
        examDescPanel.add(examDescPanelTop, BorderLayout.NORTH);
        JPanel examDescPanelBottom = new JPanel(new FlowLayout(FlowLayout.LEFT));
        examDescPanelBottom.add(new DescLabel("CARD:", Font.BOLD));
        JTextField cardField = new JTextField(2);
        cardField.setFont(new Font("SansSerif", Font.PLAIN, 9));
        examDescPanelBottom.add(cardField);
        examDescPanelBottom.add(new DescLabel("LEVEL: ", Font.BOLD));
        examDescPanelBottom.add(new DescLabel("0", Font.PLAIN));
        examDescPanel.add(examDescPanelBottom, BorderLayout.SOUTH);

        add(examDescPanel);

        for (int i = 0; i < 6; i++) {
            add(getLevelRecord(i));
        }

        JButton learnLevelB = new ControlPanelButton("AllLevelsGButton2.png", 70, 70);
        JPanel panel = new JPanel();
        panel.add(learnLevelB);
        add(panel);
    }

    private JPanel getLevelRecord(int i) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 1, 1));
        JLabel level = new JLabel("Level " + (5 - i));
        panel.add(level);
        JLabel levelL = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox2.png")).getImage()
                .getScaledInstance(50, 40, Image.SCALE_SMOOTH)))));
        levelL.setPreferredSize(new Dimension(30, 30));
        panel.add(levelL);
        JButton learnLevelB = new ControlPanelButton("AllLevelsBButton2.png", 40, 40);
        learnLevelB.setPreferredSize(new Dimension(30, 30));
        panel.add(learnLevelB);
        return panel;
    }
}

class DescLabel extends JLabel {

    public DescLabel(String text, int style) {
        super(text, JLabel.LEFT);
        setFont(new Font("SansSerif", style, 11));
    }

}
