package me.thribs.users_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;
import static org.apache.logging.log4j.LogManager.getLogger;
import org.apache.logging.log4j.Logger;

public class App {

    private static final Connection db = getConnectionInstance();
    private static final Logger logger = getLogger(App.class);
    // private static Logger logger;

    private static final String createUsersTableSql = "CREATE TABLE IF NOT EXISTS users (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(255), age INT)";
    private static final String insertUserSql = "INSERT INTO users (name, age) VALUES (?, ?)";
    private static final String selectAllUsersSql = "SELECT * FROM users";
    private static final String deleteUserSql = "DELETE FROM users WHERE name = ?";
    private static final String truncateUsersTableSql = "TRUNCATE TABLE users";
    
    public static void main(String[] args) {

        // Logger logger = LogManager.getLogger(App.class);
        logger.info("Application started");

        try {
            Statement statement = db.createStatement();
            statement.execute(createUsersTableSql);
            PreparedStatement insertUserPeparedStatement = db.prepareStatement(insertUserSql);
            PreparedStatement deleteUserPeparedStatement = db.prepareStatement(deleteUserSql);

            insertUserPeparedStatement.setString(1, "John");
            insertUserPeparedStatement.setInt(2, 25);
            insertUserPeparedStatement.execute();
            insertUserPeparedStatement.setString(1, "Jane");
            insertUserPeparedStatement.setInt(2, 26);
            insertUserPeparedStatement.execute();
            insertUserPeparedStatement.setString(1, "Jack");
            insertUserPeparedStatement.setInt(2, 32);
            insertUserPeparedStatement.execute();
            insertUserPeparedStatement.setString(1, "Jill");
            insertUserPeparedStatement.setInt(2, 30);
            insertUserPeparedStatement.execute();
            deleteUserPeparedStatement.setString(1, "Jack");
            deleteUserPeparedStatement.execute();
            
            logger.info("All users: ");
            ResultSet resultSet = statement.executeQuery(selectAllUsersSql);
            while (resultSet.next()) {
                logger.info(resultSet.getInt("id") + " " + resultSet.getString("name") + " " + resultSet.getInt("age"));
            }
            
            statement.execute(truncateUsersTableSql);
            throw new RuntimeException("Test exception");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            logger.error(e.getMessage());
        }

        

        logger.info("Application finished");
    }

    private static Connection getConnectionInstance() {
        try {
            return getConnection("jdbc:h2:~/test","sa","");
        } catch (Exception e) {
            System.out.println(e.getMessage());

            logger.error("Error while connecting to database", e);
            throw new RuntimeException(e);
        }
    }

}