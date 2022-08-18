package me.thribs.patients;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConfig {
    
    private String driver;
    private String url;
    private String user;
    private String pass;

    public JdbcConfig(String driver, String url, String user, String pass) {
        this.driver = driver;
        this.url = url;
        this.user = user;
        this.pass = pass;
    }
    
    public JdbcConfig() {
        this.driver = "org.h2.Driver";
        this.url = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/main/resources/create-patients-table.sql'";
        this.user = "sa";
        this.pass = "";
    }

    public Connection getConnection() throws Exception {
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
