package com.Task3;

import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bistros extends JFrame {

     public  Bistros(){
         setTitle("List of Bistros");
         setSize(400,400);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         try{
             Connection connection = Mydb.yourratingdb();
             Statement statement = connection.createStatement();
             ResultSet resultSet= statement.executeQuery("SELECT * FROM BISTRO");
             String[] columName = {"B_id", "Name", "Rating", "User_id"};
             String data [][] = new String[10][4];
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
             table.setPreferredScrollableViewportSize(new Dimension(500,50));
             table.setShowGrid(true);
             JScrollPane jScrollPane = new JScrollPane(table);
             add(jScrollPane);
             table.setFillsViewportHeight(true);
         }catch (Exception e){

         }
     }

    public static void main(String[] args) {
            new Bistros();
    }

}
