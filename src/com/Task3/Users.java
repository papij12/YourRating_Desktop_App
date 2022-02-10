package com.Task3;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Users extends JFrame {
    public Users (){
        setTitle("List of users");
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


                try {
                    Connection connection = Mydb.yourratingdb();
                    assert connection != null;
                    Statement stmt = connection.createStatement();
                    ResultSet rs= stmt.executeQuery("SELECT * FROM USER ");
                    String[] columnName = {"User_id","Names",
                            "Surname"};
                    String[][] data = new String[10][3];
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

new Users();


    }
}
