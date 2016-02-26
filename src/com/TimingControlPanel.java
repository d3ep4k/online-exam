/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Insets;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
public class TimingControlPanel extends JPanel{

    public TimingControlPanel() {
        super();
        setPreferredSize(new Dimension(200, 300));
        setBorder(new EmptyBorder(5,5,5,5));
//        setBackground(Color.red);
    }
    
}
