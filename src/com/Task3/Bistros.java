package com.Task3;

import javax.swing.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bistros extends JFrame {

     public  Bistros(){
         setTitle("List of Bistros");
         setSize(400,400);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

// Exception handling
         try{
             Connection connection = Mydb.yourratingdb();
             assert connection != null;
             Statement statement = connection.createStatement();
             ResultSet resultSet= statement.executeQuery("SELECT * FROM BISTRO");
             String[] columName = {"B_id", "Name", "Rating", "User_id"};
             String[][] data = new String[5][4];
             int i = 0;
             while (resultSet.next()){
                 int id = resultSet.getInt("B_id");
                 String name = resultSet.getString("Name");
                 int rating = resultSet.getInt("Rating");
                 int userId = resultSet.getInt("User_id");
                 data[i][0]= id+"";
                 data[i][1]= name;
                 data[i][2]=rating+"";
                 data[i][3]=userId+"";
                 i++;
             }

             JTable table = new JTable(data,columName);
             add(new JScrollPane(table));
             table.setFillsViewportHeight(true);

         }catch (Exception e){
JOptionPane.showMessageDialog(null,"Connection failed");
         }
     }

    public static void main(String[] args) {
            new Bistros();
    }

}
