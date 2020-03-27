package com.bitedu.mysql;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: ShiLin
 * Date:
 * Time:
 */
public class HelloWorld {

    public static void main(String[] args) {

        try {
            // 加载数据库驱动
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection
                    ("jdbc:mysql://localhost/",
                            "root",
                            "");

            Statement stmt = connection.createStatement();

            stmt.execute("create database my_jdbc_db2");


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
