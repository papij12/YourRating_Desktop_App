package com.Task3;

import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Users extends JFrame {
JTable table;
    private JPanel User;

    public Users (String title){
        super(title);
                try {
                    Connection connection = Mydb.yourratingdb();
                    Statement stmt = connection.createStatement();
                    ResultSet rs= stmt.executeQuery("SELECT * FROM USER ");
                    String[] columnName = {"User_id","Names",
                            "Surname"};
                    String data [][] = new String[10][3];
                    int i =0;
                    while(rs.next()){
                        int id = rs.getInt("User_id");
                        String name = rs.getString("Names");
                        String surname = rs.getString("Surname");
                        data[i][0] = id +"";
                        data[i][1]= name;
                        data[i][2]= surname;
                        i++;
                    }

                    JTable   table = new JTable(data, columnName);
                    table.setPreferredScrollableViewportSize(new Dimension(500,50));
                    table.setShowGrid(true);
                    JScrollPane jScrollPane = new JScrollPane(table);
                    add(jScrollPane);
                    table.setFillsViewportHeight(true);


                }
                catch (Exception e1){
                    e1.printStackTrace();
                }



            }

    public static void main(String[] args) {

        Users frame = new Users("List of users");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(600,200);
        frame.setVisible(true);


    }
}
