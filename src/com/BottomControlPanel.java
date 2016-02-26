/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
class BottomControlPanel extends JPanel {

    public BottomControlPanel() {
        super();
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(10, 10, 10, 10));
        JPanel playControlPanel = new JPanel();
        playControlPanel.add(new ControlPanelButton("RightAnswerButton2.png"));
        playControlPanel.add(new ControlPanelButton("WrongAnswerButton2.png"));
        playControlPanel.add(new ControlPanelButton("StopButton2.png"));
        
        add(playControlPanel, BorderLayout.WEST);
        
        
        JPanel playControlPanel2 = new JPanel();
        playControlPanel2.add(new ControlPanelButton("SaveButton2.png"));
        playControlPanel2.add(new ControlPanelButton("CancelButton2.png"));
        
        add(playControlPanel2, BorderLayout.EAST);
        
        JPanel playControlPanel3 = new JPanel();
        playControlPanel3.add(new ControlPanelButton("RewindButton2.png"));
        playControlPanel3.add(new ControlPanelButton("RewindButton2.png"));
        playControlPanel3.add(new ControlPanelButton("BackButton2.png"));
        playControlPanel3.add(new ControlPanelButton("BackButton2.png"));
        playControlPanel3.add(new ControlPanelButton("ForwardButton2.png"));
        playControlPanel3.add(new ControlPanelButton("ForwardButton2.png"));
        
        add(playControlPanel3, BorderLayout.SOUTH);
    }

}
