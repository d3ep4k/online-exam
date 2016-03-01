/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

/**
 *
 * @author deepak.m
 */
public class AnswerSideMenu extends JPanel {

    public AnswerSideMenu() {
        super();
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setPreferredSize(new Dimension(160, 1000));
//        setBackground(new Color(0xafcaff));
        setBackground(new Color(0xffffff));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JPanel choicePanel = new JPanel();
        choicePanel.setPreferredSize(new Dimension(this.getWidth(), 100));
        choicePanel.setLayout(new BoxLayout(choicePanel, BoxLayout.Y_AXIS));
        choicePanel.setOpaque(false);
        ButtonGroup group = new ButtonGroup();
        RadioButtonWithImage btn1 = new RadioButtonWithImage("NormalModeButton2.png");
        btn1.addToButtonGroup(group);
        choicePanel.add(btn1);
        RadioButtonWithImage btn2 = new RadioButtonWithImage("ExactMatchButton2.png");
        btn2.addToButtonGroup(group);
        choicePanel.add(btn2);
        RadioButtonWithImage btn3 = new RadioButtonWithImage("MultipleChoiceButton2.png");
        btn3.addToButtonGroup(group);
        choicePanel.add(btn3);

        add(choicePanel);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(60, 60));
        panel.setBorder(new DashedBorder());
        panel.setOpaque(false);
        add(panel);
    }
}
