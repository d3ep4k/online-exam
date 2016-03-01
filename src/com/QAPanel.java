/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
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



