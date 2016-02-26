/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.awt.Color;
import java.awt.Component;
import static java.awt.Component.TOP_ALIGNMENT;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author deepak.m
 */
class QuestionDetail extends JPanel {

    JPanel questionTitle, questionDescription;

    public QuestionDetail() {
//        setBorder(new EmptyBorder(5, 5, 5, 5));
        setLayout(new GridBagLayout());
        setOpaque(false);
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);

        questionTitle = new JPanel();
        questionTitle.setOpaque(false);
        JLabel questionTitleLabel = new JLabel("<html><body style='padding:10px'>Why is “pineapple” in English but “ananas” in all other languages?</body></html>");
        questionTitleLabel.setFont(new Font("Verdana", Font.PLAIN, 14));
        questionTitle.setLayout(new GridLayout());
        questionTitle.add(questionTitleLabel);
        questionTitle.setBorder(new LineBorder(Color.GRAY, 1, true));
        c.gridx = c.gridy = 0;
        //c.gridwidth = c.gridheight = 1;
        c.fill = GridBagConstraints.BOTH;
        c.weightx = c.weighty = 70;

        add(questionTitle, c);

        questionDescription = new JPanel();
        questionDescription.setOpaque(false);

        questionDescription.setLayout(new GridLayout());
        questionDescription.setBorder(new LineBorder(Color.GRAY, 1, true));
        //style='width:"+questionDescription.getPreferredSize().width*30+"px'
        JLabel questionDescriptionLabel = new JLabel("<html><body style='padding:10px'>This is a question related to english language and usage. This "
                + "is particularly related to the question of a fruit called pineapple. All other languages apart from "
                + "english call pineapple as ananas. </body></html>");
        questionDescriptionLabel.setFont(new Font("Verdana", Font.PLAIN, 11));
        questionDescriptionLabel.setForeground(Color.DARK_GRAY);
        questionDescriptionLabel.setVerticalAlignment(JLabel.TOP);
        questionDescriptionLabel.setVerticalTextPosition(JLabel.TOP);
        questionDescriptionLabel.setAlignmentY(TOP_ALIGNMENT);
        //questionDescriptionLabel.setBorder(new LineBorder(Color.yellow));
        questionDescription.add(questionDescriptionLabel);
        c.gridx = 0;
        c.gridy = 1;
        c.weightx = c.weighty = 200;
        add(questionDescription, c);
    }

}
