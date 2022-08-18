package me.thribs.small_pharma.data;

import java.sql.Connection;
import static java.sql.DriverManager.getConnection;

public class JdbcConfig {
    
    private final String username;
    private final String password;
    private final String url;
    private final String driver;

    public JdbcConfig(String username, String password, String url, String driver) {
        this.username = username;
        this.password = password;
        this.url = url;
        this.driver = driver;
    }

    public JdbcConfig() {
        this.username = "root";
        this.password = "toor";
        this.url = "jdbc:h2:mem:small_pharma;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'init_small_pharma.sql'";
        this.driver = "org.h2.Driver";
    }

    public static Connection getConnectionInstance() {
        JdbcConfig jdbcConfig = new JdbcConfig();
        try {
            Class.forName(jdbcConfig.driver);
            Connection connectionInstance = getConnection(jdbcConfig.url, jdbcConfig.username, jdbcConfig.password);
            return connectionInstance;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
