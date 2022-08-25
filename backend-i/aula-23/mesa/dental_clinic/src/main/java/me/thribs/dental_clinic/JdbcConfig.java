package me.thribs.dental_clinic;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConfig {
    
    private static String driver = "org.h2.Driver";
    private static String url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/main/resources/init.sql'";
    private static String user = "sa";
    private static String pass = "";

    public JdbcConfig(String driver, String url, String user, String pass) { }

    public JdbcConfig() { }

    public static Connection getConnection() throws Exception {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
        return connection;
    }
}
