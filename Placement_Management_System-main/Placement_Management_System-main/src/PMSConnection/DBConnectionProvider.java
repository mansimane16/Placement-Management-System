/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PMSConnection;
import java.sql.*;
/**
 *
 * @author lenovo
 */
public class DBConnectionProvider {
    public static Connection getCon()
    {
        try
        {
        Class .forName("com.mysql.cj.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pms","root","Alohomora@123");
        return con;
        }
        catch(Exception e)
        {
          System.out.println(e);
          return null;
        }
    }
}

    