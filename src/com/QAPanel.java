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
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

/**
 *
 * @author deepak.m
 */
class QAPanel extends JPanel {

    JPanel questionPanel, answerPanel;

    public QAPanel() {
        super();
        setBorder(new EmptyBorder(10, 10, 10, 10));
        setLayout(new GridLayout(2, 1, 0, 10));
        //setLayout(new GridLayout(2, 1));

        questionPanel = new ContentPanel(new QuestionDetail(), new ControlPanel(), new QuestionSideMenu());
        add(questionPanel);

        answerPanel = new ContentPanel(new QuestionDetail(), new ControlPanel(), new AnswerSideMenu());
        add(answerPanel);

    }

}

class ContentPanel extends JPanel {

    public ContentPanel(JPanel detail, JPanel control, JPanel sideMenu) {
        super();
        setBorder(new LineBorder(Color.GRAY, 2, true));
        setLayout(new BorderLayout());
        setBackground(Color.white);
        add(detail, BorderLayout.CENTER);
        add(control, BorderLayout.SOUTH);
        add(sideMenu, BorderLayout.EAST);
    }

}

class QuestionSideMenu extends JPanel {

    public QuestionSideMenu() {
        super();
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setPreferredSize(new Dimension(160, 1000));
//        setBackground(new Color(0xafcaff));
        setBackground(new Color(0xffffff));
        setLayout(new GridLayout(3, 1, 5, 5));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(60, 60));
        panel.setBorder(new DashedBorder());
        panel.setOpaque(false);
        add(panel);
    }
}

class AnswerSideMenu extends JPanel {

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
