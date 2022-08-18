package me.thribs.small_pharma;

import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import org.apache.logging.log4j.Logger;
import static org.apache.logging.log4j.LogManager.getLogger;


public class App {

    private static final Connection connection = getConnectionInstance();
    private static final Logger logger = getLogger(App.class);
    
    public static void main(String[] args) {

    }

    public static Connection getConnectionInstance() {
        try {
            Connection connectionInstance = getConnection("jdbc:mysql://localhost:3306/small_pharma", "root", "root");
            return connectionInstance;
        } catch (Exception e) {
            logger.error("Error while connecting to database", e);
            throw new RuntimeException(e);
        }
    }
}
