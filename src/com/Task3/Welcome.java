package com.Task3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Welcome extends JFrame {
    private JButton rateButton;
    private JPanel welcomePanel;

    public  Welcome (String title){
    super(title);

    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setContentPane(welcomePanel);
    this.pack();
        rateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Great job");
                JFrame frame2 = new Users("User");
                frame2.show();
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new Welcome("Your Rating");
        frame.setVisible(true);
    }
}
