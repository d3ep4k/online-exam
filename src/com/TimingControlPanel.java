/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.ImageUtil;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak.m
 */
public class TimingControlPanel extends JPanel {

    public TimingControlPanel() {
        super();
        setPreferredSize(new Dimension(200, 300));
        setBorder(new EmptyBorder(5, 5, 5, 5));
        setOpaque(false);
        setLayout(new GridLayout(3, 3, 2, 2));
//        GridBagConstraints gbc = new GridBagConstraints();
        JButton autoTimingButton = new ControlPanelButton("AutoTimingOffButton2.png", 36, 36);
        add(autoTimingButton);
        JLabel autoTimingLabel = new JLabel("Auto Timing");
        add(autoTimingLabel);
        add(new ControlPanelButton("HelpButton2.png", 18, 18));

        JLabel connectionIcon = new IconLabel("ConnectionButton2.png");
        JLabel myTimingIcon = new IconLabel("MyTimingOnButton2.png");
        JPanel myTimingPanel = new JPanel();
        myTimingPanel.add(connectionIcon);
        myTimingPanel.add(myTimingIcon);
        add(myTimingPanel);
        
        JLabel autoTimingLabel2 = new JLabel("My Timing");
        add(autoTimingLabel2);
        add(new ControlPanelButton("HelpButton2.png", 18, 18));

        JButton autoPaukOnButton = new ControlPanelButton("AutoPaukOnButton.png", 36, 36);
        add(autoPaukOnButton);
        JLabel autoTimingLabel3 = new JLabel("Auto");
        add(autoTimingLabel3);
        add(new ControlPanelButton("HelpButton2.png", 18, 18));
    }

}

class IconLabel extends JLabel {

    public IconLabel(String imageString) {
        Icon icon = new ImageIcon(((new ImageIcon(ImageUtil.getImage(imageString)).getImage()
                .getScaledInstance(16, 16, Image.SCALE_SMOOTH))));
        this.setIcon(icon);
    }

    public IconLabel(String text, String imageString, int horizontalAlignment) {
        this(imageString);
        setText(text);
        setHorizontalAlignment(horizontalAlignment);
    }

}
