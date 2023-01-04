package org.Ukt;

import javax.swing.*;

public class main {
    public static void main(String[] args) {
        JFrame jf = new JFrame();
        jf. setContentPane(new FormUkt().getPanelnya());
        jf.setSize(500,700);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }
}
