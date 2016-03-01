/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.ImageUtil;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
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
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridLayout(8,1,0,0));

        JPanel examDescPanel = new JPanel();
        examDescPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5,0,5,0);
        gbc.gridx = gbc.gridy = 0;
        examDescPanel.add(new JLabel("FILE:", JLabel.LEFT), gbc);
        gbc.gridx = 1; gbc.gridy = 0;
        examDescPanel.add(new JLabel("EXAMPLE FILE", JLabel.LEFT), gbc);
        gbc.gridx = 0; gbc.gridy = 1;
        examDescPanel.add(new JLabel("CARD:", JLabel.LEFT), gbc);
        gbc.gridx = 1; gbc.gridy = 1;
        examDescPanel.add(new JTextField(2), gbc);
        
        gbc.gridx = 2; gbc.gridy = 1;
        examDescPanel.add(new JLabel("LEVEL: ", JLabel.LEFT), gbc);
        
        gbc.gridx = 3; gbc.gridy = 1;
        examDescPanel.add(new JLabel("0", JLabel.CENTER), gbc);
        
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
        panel.setLayout(new GridLayout(1, 3, 5, 5));
        JLabel level = new JLabel("Level " + (5 - i));
        panel.add(level);
        JLabel levelL = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox2.png")).getImage()
                .getScaledInstance(50, 40, Image.SCALE_SMOOTH)))));
        levelL.setPreferredSize(new Dimension(30, 30));
        panel.add(levelL);
        JButton learnLevelB = new ControlPanelButton("AllLevelsBButton2.png", 44, 44);
        learnLevelB.setPreferredSize(new Dimension(30, 30));
        panel.add(learnLevelB);
        return panel;
    }

}
