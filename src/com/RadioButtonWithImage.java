/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author deepak.m http://stackoverflow.com/a/7706917/1097600
 */
import com.util.ImageUtil;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.ChangeListener;

public class RadioButtonWithImage extends JPanel {
    
    private JRadioButton radio = new JRadioButton();
    private JLabel image;
    
    public RadioButtonWithImage(String imageString) {
        Icon icon = new ImageIcon(((new ImageIcon(ImageUtil.getImage(imageString)).getImage()
                .getScaledInstance(18, 18, Image.SCALE_SMOOTH))));
        image = new JLabel(icon);
        add(radio);
        add(image);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        this.setOpaque(false);
    }
    
    public void addToButtonGroup(ButtonGroup group) {
        group.add(radio);
    }
    
    public void addActionListener(ActionListener listener) {
        radio.addActionListener(listener);
    }
    
    public void addChangeListener(ChangeListener listener) {
        radio.addChangeListener(listener);
    }
    
    public Icon getImage() {
        return image.getIcon();
    }
    
    public void setImage(Icon icon) {
        image.setIcon(icon);
    }
    
}
