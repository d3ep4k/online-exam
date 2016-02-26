/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.sun.java.swing.plaf.windows.WindowsBorders;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.AbstractBorder;
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
        setBorder(new EmptyBorder(20, 20, 20, 20));
        setLayout(new GridLayout(2, 1, 0, 10));
        //setLayout(new GridLayout(2, 1));

        questionPanel = new ContentPanel();
        add(questionPanel);

        answerPanel = new ContentPanel();
        add(answerPanel);

    }

}

class ContentPanel extends JPanel {

    public ContentPanel() {
        super();
        setBorder(new LineBorder(Color.GRAY, 2, true));
        setLayout(new BorderLayout());
        setBackground(Color.white);
        add(new QuestionDetail(), BorderLayout.CENTER);
        add(new ControlPanel(), BorderLayout.SOUTH);
        add(new QuestionSideMenu(), BorderLayout.EAST);
    }

}

class QuestionSideMenu extends JPanel {

    public QuestionSideMenu() {
        super();
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        setPreferredSize(new Dimension(160, 1000));
        setBackground(new Color(0xafcaff));
        setLayout(new GridLayout(3, 1, 5, 5));

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(60, 60));
        panel.setBorder(new DashedBorder());
        add(panel);
    }
}
