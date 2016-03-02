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
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author deepak.m
 */
class ControlPanel extends JPanel {

    JButton b1, b2, b3, b4, b5, b6;
    JButton b7, b8, b9;

    public ControlPanel() {
        b1 = new ControlPanelButton("HyperlinkButton2.png");
        b2 = new ControlPanelButton("RecordOffButton2.png");
        b3 = new ControlPanelButton("PlayButton2.png");
        b4 = new ControlPanelButton("DeleteButton2.png");
        b5 = new ControlPanelButton("LatexButton2.png");
        b6 = new ControlPanelButton("LatexEditButton2.png");

        b7 = new ControlPanelButton("ImageSnapshotButton2.png");
        b8 = new ControlPanelButton("ImageUploadButton2.png");
        b9 = new ControlPanelButton("DeleteButton2.png");
        setBackground(new Color(0xffffff));
        this.setLayout(new BorderLayout());
        JPanel leftSide = new JPanel();
        leftSide.setOpaque(false);
        leftSide.setLayout(new GridLayout());
        leftSide.add(b1);
        leftSide.add(b2);
        leftSide.add(b3);
        leftSide.add(b4);
        leftSide.add(b5);
        leftSide.add(b6);
//        leftSide.setPreferredSize(new Dimension(100,20));
        this.add(leftSide, BorderLayout.WEST);

        JPanel rightSide = new JPanel();
//        rightSide.setPreferredSize(new Dimension(100,20));
        rightSide.setOpaque(false);
        leftSide.setLayout(new GridLayout());
        rightSide.add(b7);
        rightSide.add(b8);
        rightSide.add(b9);
        this.add(rightSide, BorderLayout.EAST);

    }
}


