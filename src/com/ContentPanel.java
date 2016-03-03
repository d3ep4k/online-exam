/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author deepak.m
 */
public class ContentPanel extends JPanel {

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
