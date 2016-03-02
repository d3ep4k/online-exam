/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import com.util.ImageUtil;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author deepak
 */
class ControlPanelButton extends JButton {

    public ControlPanelButton(String imageFile) {
        setIcon(new ImageIcon(((new ImageIcon(ImageUtil.getImage(imageFile)).getImage()
                .getScaledInstance(30, 30, Image.SCALE_SMOOTH)))));
        setProps();
    }

    public ControlPanelButton(String imageFile, int width, int height) {
        super(new ImageIcon(((new ImageIcon(ImageUtil.getImage(imageFile)).getImage()
                .getScaledInstance(width, height, Image.SCALE_SMOOTH)))));
//        super(new StretchIcon(ImageUtil.getImage(imageFile).getScaledInstance(100, 100, Image.SCALE_SMOOTH)));
        setProps();
    }

    private void setProps() {
        setBorder(new EmptyBorder(2, 5, 2, 0));
        setContentAreaFilled(false);
        setBorderPainted(false);
        setFocusPainted(false);
    }

}
