package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class Util {
    // реализуйте настройку соеденения с БД
    private static String DB_URL = "jdbc:mysql://localhost:3306/userdb";
    private static String DB_USERNAME = "olga";
    private static String DB_PASSWORD = "olga";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
            System.out.println("Wrong connection");
        }
        return connection;
    }
}
