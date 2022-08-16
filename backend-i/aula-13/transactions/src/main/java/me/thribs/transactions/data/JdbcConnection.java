package me.thribs.transactions.data;

import java.sql.Connection;
import static java.sql.DriverManager.getConnection;

public class JdbcConnection {
    

    public static Connection getInstance() {
        try {
            return getConnection("jdbc:h2:~/test","sa","");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public static void rollback(Connection connection) {
        try {
            connection.rollback();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
