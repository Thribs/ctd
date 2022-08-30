package me.thribs.ctd_commerce.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConfig {
    
    // private static String driver;
    // private static String url;
    // private static String user;
    // private static String pass;
    
    // public JdbcConfig() { }

    // public JdbcConfig(String driver, String url, String user, String pass) {
    //     JdbcConfig.driver = driver;
    //     JdbcConfig.url = url;
    //     JdbcConfig.user = user;
    //     JdbcConfig.pass = pass;
    // }

    public static Connection getConnection(String driver, String url, String user, String pass) {
        Connection connection = null;
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return connection;
    }
}
