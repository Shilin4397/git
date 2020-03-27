package com.bitedu.mysql;

import java.sql.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class Select {

    public static void createTable() {
        Connection connection=null;
        Statement stmt=null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/my_jdbc_db","root","");
            stmt=connection.createStatement();
            String sql="select* from  student";
            ResultSet rs=stmt.executeQuery(sql);
            while(rs.next()) {
                Integer col1=rs.getInt("col1");
                String col2=rs.getString("col2");
                System.out.println("col1="+col1+"col2"+col2);
            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        createTable();
    }
}
