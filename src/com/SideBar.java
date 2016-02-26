/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.ImageUtil;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
class SideBar extends JPanel {

    public SideBar() {
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        for (int i = 0; i < 6; i++) {
            add(getLevelRecord(i));
        }

        JButton learnLevelB = new JButton(new ImageIcon((new ImageIcon(ImageUtil.getImage("AllLevelsGButton2.png")).getImage()
                .getScaledInstance(44, 44, Image.SCALE_SMOOTH))));
        learnLevelB.setBorderPainted(false);
        learnLevelB.setFocusPainted(false);
        learnLevelB.setContentAreaFilled(false);
        JPanel panel = new JPanel();
        panel.add(learnLevelB);
        add(panel);
    }

    JPanel getLevelRecord(int i) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 3, 5, 5));
        JLabel level = new JLabel("Level " + (5 - i));
        panel.add(level);
        JLabel levelL = new JMyLabel(new ImageIcon(((new ImageIcon(ImageUtil.getImage("cardbox2.png")).getImage()
                .getScaledInstance(60, 40, Image.SCALE_SMOOTH)))));
        levelL.setPreferredSize(new Dimension(40, 40));
        levelL.setText("0");
        panel.add(levelL);
        JButton learnLevelB = new JButton(new ImageIcon(((new ImageIcon(ImageUtil.getImage("AllLevelsBButton2.png")).getImage()
                .getScaledInstance(44, 44, Image.SCALE_SMOOTH)))));
        learnLevelB.setPreferredSize(new Dimension(40, 40));
        learnLevelB.setBorderPainted(false);
        learnLevelB.setFocusPainted(false);
        learnLevelB.setContentAreaFilled(false);
        panel.add(learnLevelB);
        return panel;
    }

}
