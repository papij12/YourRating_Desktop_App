package com.Task3;

import javax.swing.*;

public class Welcome extends JFrame {
    private JButton rateButton;
    private JPanel welcomePanel;
    private JButton bistro_btn;
    private JButton Restaurants_btn;

    public  Welcome (){
        setTitle("Your Rating");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(welcomePanel);
        rateButton.addActionListener(e -> {
            JOptionPane.showMessageDialog(null,"Great job");
            new Users();
            dispose();
        });
        bistro_btn.addActionListener(e ->{
            JOptionPane.showMessageDialog(null, "setting up bistro list");
            new Bistros();
            dispose();
        });
        Restaurants_btn.addActionListener(e ->{
            JOptionPane.showMessageDialog(null, "setting up Restaurants list");
            new Restaurants();
            dispose();
        });
    }

    public static void main(String[] args) {
       new Welcome();
    }

}
