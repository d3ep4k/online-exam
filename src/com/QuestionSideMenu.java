/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author deepak.m
 */
class QuestionSideMenu extends JPanel {

    public QuestionSideMenu() {
        super();
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setPreferredSize(new Dimension(160, 1000));
//        setBackground(new Color(0xafcaff));
        setBackground(new Color(0xffffff));
        setLayout(new GridLayout(2, 1, 5, 5));
        
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        inputPanel.add(new JTextField(2));
        inputPanel.add(new ControlPanelButton("HelpButton2.png", 18, 18));
        inputPanel.setOpaque(false);
        add(inputPanel);
        
        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(60, 60));
        panel.setBorder(new DashedBorder());
        panel.setOpaque(false);
        add(panel);
    }
}
