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
public class InsertCase {

    public static void createTable() {
        Connection connection=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost","root","");
            stmt=connection.createStatement();
            stmt.execute("create database my_jdbc_db1");
            //stmt.execute("drop database my_jdbc_db2");
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

    public static void insertIntoTable() {
        Connection connection = null;
        Statement stmt = null;

        try {
            //1. 加载驱动
            Class.forName("com.mysql.jdbc.Driver");
            //2. 获取连接
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost/my_jdbc_db",
                    "root",
                    ""
            );
            //3. 创建语句对象
            stmt = connection.createStatement();
            //4. 执行
            String sql = "create table " +
                    "student(col1 int, col2 varchar(20))";
            stmt.execute(sql);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //5. 关闭资源
            try {
                if (stmt != null){
                    stmt.close();
                }

                if (connection != null){
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
       createTable();
        //insertIntoTable();
    }
}
