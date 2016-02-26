package com;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;

public class Main {

    public static void main(String[] args) {

        String lookAndFeel = "javax.swing.plaf.nimbus.NimbusLookAndFeel";
        try {
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (Exception e1) {
            try {
                for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                    if ("Nimbus".equals(info.getName())) {
                        UIManager.setLookAndFeel(info.getClassName());
                        break;
                    }
                }
                UIManager.setLookAndFeel(lookAndFeel);
            } catch (Exception e) {

            }
        }
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {
                new OnlineExam();
            }
        });
    }
}
