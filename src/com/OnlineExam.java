/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
public class OnlineExam extends JFrame {

    private JPanel centerPanel;
    private JPanel leftPanel;
    private JPanel bottomPanel;

    public OnlineExam() {
        super();
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());

        this.leftPanel = new SideBar();
//        leftPanel.setMinimumSize(new Dimension(300, 0));
        leftPanel.setPreferredSize(new Dimension(220, 0));
        contentPane.add(leftPanel, BorderLayout.WEST);

        centerPanel = new JPanel();
        centerPanel.setBackground(new Color(0xeeeeee));
        centerPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        centerPanel.setLayout(new GridLayout(2, 1, 0, 10));
        JPanel questionPanel = new ContentPanel(new QuestionDetail(), new ControlPanel(), new QuestionSideMenu());
        centerPanel.add(questionPanel);
        JPanel answerPanel = new ContentPanel(new AnswerDetail(), new ControlPanel(), new AnswerSideMenu());
        centerPanel.add(answerPanel);

        contentPane.add(centerPanel, BorderLayout.CENTER);

        //bottom panel
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        JPanel timingCtrlPanel = new TimingControlPanel();
        timingCtrlPanel.setPreferredSize(new Dimension(210, 200));
        bottomPanel.add(timingCtrlPanel, BorderLayout.WEST);
        bottomPanel.add(new BottomControlPanel(), BorderLayout.CENTER);
        bottomPanel.setPreferredSize(new Dimension(contentPane.getWidth(), 120));
        contentPane.add(bottomPanel, BorderLayout.SOUTH);

        //frame props
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension minSize = new Dimension(800, 600);
        setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
        setMinimumSize(minSize);
//        pack();
        setVisible(true);
    }

}
