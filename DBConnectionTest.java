package com.mycompany.app;
import java.sql.*;
//import utility.DBConnection;
public class DBConnectionTest 
{

    public static void main(String[] args)
     {
        Connection conn = DBConnection.getDBConnection();

        try {
            String query = "delete from student where Rollnum=1";
            Statement statement = conn.createStatement();
            PreparedStatement pm = conn.prepareStatement(query);
            pm.executeUpdate(query);
            System.out.println("Add elements successfully");

           /* while (resultSet.next())
             {
                System.out.println(resultSet.getString(1)+" "+resultSet.getString(2)+" "+resultSet.getString(3)+" "+resultSet.getString(4));
            }*/
        } catch (Exception e)
         {
            e.printStackTrace();
          }
    }
}