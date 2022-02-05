package com.Task3;
import javax.swing.*;
import java.sql.*;
public class Mydb {
public static Connection yourratingdb()
{
    try {
Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/yourratingdb",
        "root","Umury@ngo2022");
JOptionPane.showMessageDialog(null,"Connection established");
return connection;
}catch (Exception e){
        JOptionPane.showMessageDialog(null,e);
        return null;
    }
}
}
