/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
class BottomControlPanel extends JPanel {

    public BottomControlPanel() {
        super();
        setLayout(new BorderLayout());
        setBorder(new EmptyBorder(5, 5, 5, 5));
        JPanel answerButtonPanel = new JPanel();
        answerButtonPanel.add(new ControlPanelButton("RightAnswerButton2.png", 25, 25));
        answerButtonPanel.add(new ControlPanelButton("WrongAnswerButton2.png", 25, 25));
//        playControlPanel.add(new ControlPanelButton("StopButton2.png"));

        add(answerButtonPanel, BorderLayout.WEST);

        JPanel saveButtonPanel = new JPanel();
        saveButtonPanel.add(new ControlPanelButton("SaveButton2.png"));
        saveButtonPanel.add(new ControlPanelButton("CancelButton2.png"));

        add(saveButtonPanel, BorderLayout.EAST);
        
        JPanel lowerPanel = new JPanel(new GridLayout());
        JPanel navigationButtonPanel = new JPanel();
        navigationButtonPanel.add(new ControlPanelButton("BeginningButton2.png", 40, 40));
        navigationButtonPanel.add(new ControlPanelButton("RewindButton2.png", 40, 40));
        navigationButtonPanel.add(new ControlPanelButton("BackButton2.png", 40, 40));
        navigationButtonPanel.add(new ControlPanelButton("NextButton2.png", 40, 40));
        navigationButtonPanel.add(new ControlPanelButton("ForwardButton2.png", 40, 40));
        navigationButtonPanel.add(new ControlPanelButton("EndButton2.png", 40, 40));
        
        JPanel searchPanel = new JPanel();
        searchPanel.add(new JTextField(8));
        searchPanel.add(new ControlPanelButton("SearchButton.png"));
        
        lowerPanel.add(navigationButtonPanel, BorderLayout.CENTER);
        lowerPanel.add(searchPanel, BorderLayout.EAST);
        
        add(lowerPanel, BorderLayout.SOUTH);
    }

}
