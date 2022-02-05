package com.Task3;
import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.*;
import java.sql.*;

public class Rate extends JFrame{
    public static void main(String[] args) {
        JFrame f=new JFrame("Button Example");
        JButton b=new JButton("User");
        b.setBounds(0,0,105,30);
        b.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
            JOptionPane.showMessageDialog(null,"Great job");
            f.dispose();

            JFrame f2= new JFrame("Userinfo");
                JTable user= new JTable();
            try {
                Connection connection = Mydb.yourratingdb();
                Statement stmt = connection.createStatement();
                String query = "select * from User";
                ResultSet rs=stmt.executeQuery(query);
                String column[]= {"userid","First name","last name"};
                JTable jt= new JTable((TableModel) rs);
                jt.setBounds(30,40,200,300);
                JScrollPane sp=new JScrollPane(jt);
                f2.add(sp);

            }
            catch (Exception e1){
                e1.printStackTrace();

            }
            // JLabel l1=new JLabel("Userinfo");
           // l1.setBounds(50,0,100,30);
                String column[]={"Userid","Names","Surname"};

                f2.setSize(400,400);
                f2.setLayout(null);
                f2.setVisible(true);

              //  f2.add(l1);
            }
        });
        JButton b1= new JButton("Bistro");
        b1.setBounds(0,40,105,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Alright!");
                f.dispose();
                Connection connection = Mydb.yourratingdb();
                JFrame f3= new JFrame("Bistroinfo");
                JLabel l2=new JLabel("Bistroinfo");
                l2.setBounds(50,0,100,30);
                f3.setSize(400,400);
                f3.setLayout(null);
                f3.setVisible(true);
                f3.add(l2);
            }
        });
        JButton b2= new JButton("Restaurants");
        b2.setBounds(0,80,105,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Nice!");
                f.dispose();
                Connection connection = Mydb.yourratingdb();
                JFrame f4= new JFrame("Restaurantsinfo");
                JLabel l3=new JLabel("Restaurantsinfo");
                l3.setBounds(50,0,100,30);
                f4.setSize(400,400);
                f4.setLayout(null);
                f4.setVisible(true);
                f4.add(l3);
            }
        });
        JButton b3= new JButton("Takeaway");
        b3.setBounds(0,120,105,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Amazing!!");
                f.dispose();
                Connection connection = Mydb.yourratingdb();
                JFrame f5= new JFrame("Takeawayinfo");
                JLabel l4=new JLabel("Takeawayinfo");
                l4.setBounds(50,0,100,30);
                f5.setSize(400,400);
                f5.setLayout(null);
                f5.setVisible(true);
                f5.add(l4);
            }
        });
        f.add(b);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
}
