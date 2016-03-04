/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author deepak.m
 */
public class AnswerDetail extends JPanel {

    public AnswerDetail() {
        setLayout(new GridLayout(5, 1, 0, 5));
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));
        add(new AnswerRow("Answer 1", true));
        add(new AnswerRow("Answer 2"));
        add(new AnswerRow("Answer 3"));
        add(new AnswerRow("Answer 4"));
        add(new AnswerRow("Answer 5"));
    }

    //inner class

    class AnswerRow extends JPanel {

        public AnswerRow(String answerText, boolean check) {
            setLayout(new BorderLayout(5, 5));
            JPanel answerButtonPanel = new JPanel();
            setBorder(BorderFactory.createLineBorder(Color.GRAY, 2, true));
            answerButtonPanel.setPreferredSize(new Dimension(60, 0));
            answerButtonPanel.setLayout(new BorderLayout());
            answerButtonPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 0, 2, Color.GRAY));
            if (check) {
                JButton answerButton = new ControlPanelButton("RightAnswerButton2.png",28,28);
                answerButtonPanel.add(answerButton);
            }
            add(answerButtonPanel, BorderLayout.WEST);
            JLabel answerLabel = new JLabel(answerText);
            answerLabel.setFont(new Font("Sanserif", Font.PLAIN, 14));
            answerLabel.setOpaque(false);
            add(answerLabel, BorderLayout.CENTER);
        }

        public AnswerRow(String answerString) {
            this(answerString, false);
        }
        
        
    }
}
