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
import javax.swing.JFrame;
import javax.swing.JPanel;

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
//        leftPanel.setBackground(new Color(0xfcfaaa));
        leftPanel.setPreferredSize(new Dimension(200, contentPane.getHeight()));
        contentPane.add(leftPanel, BorderLayout.WEST);

        centerPanel = new QAPanel();
        centerPanel.setBackground(new Color(0xeeeeee));
        //centerPanel.add(new QAPanel());
        contentPane.add(centerPanel, BorderLayout.CENTER);
        

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        JPanel timingCtrlPanel = new TimingControlPanel();
        timingCtrlPanel.setPreferredSize(new Dimension(220, 200));
        bottomPanel.add(timingCtrlPanel, BorderLayout.WEST);
        bottomPanel.add(new BottomControlPanel(), BorderLayout.CENTER);
        bottomPanel.setPreferredSize(new Dimension(contentPane.getWidth(), 120));
        contentPane.add(bottomPanel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Dimension minSize = new Dimension(800, 600);
        setSize(minSize);
        setMaximumSize(minSize);
        setVisible(true);
    }

}
