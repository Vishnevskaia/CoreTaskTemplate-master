package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Util {
    public static void main(String[] args) {

    }
    // реализуйте настройку соеденения с БД
    private static final String DB_URL = "jdbc:mysql://localhost:3306/mydbtest";
    private static final String DB_Driver = "com.mysql.cj.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "password";


    private static Connection connection;

    public static Connection getConnect() {

        try {
            Class.forName(DB_Driver);
            connection = DriverManager.getConnection(DB_URL, user, password);

          //  System.out.println("Соединение выполнено!");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Драйвер не найден!");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка SQL!");
        }
return connection;
    }


    //public static void disconnect(Connection connection) throws SQLException {
        //connection.close();
        //System.out.println("Отключение выполнено!");
   // }






}
