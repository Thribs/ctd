package me.thribs.transactions;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.logging.log4j.Logger;
import static org.apache.logging.log4j.LogManager.getLogger;

import me.thribs.transactions.data.JdbcConnection;
import me.thribs.transactions.model.Account;

public class App {

    private static Connection connection = JdbcConnection.getInstance();
    private static final String createAccountTableSql = "CREATE TABLE IF NOT EXISTS accounts (ID INT PRIMARY KEY auto_increment, NAME VARCHAR(255), ACCOUNT_NUMBER VARCHAR(255), BALANCE numeric(10,2))";
    private static final String insertAccountSql = "INSERT INTO ACCOUNT (NAME, ACCOUNT_NUMBER, BALANCE) VALUES (?, ?, ?)";
    private static final String updateAccountSql = "UPDATE ACCOUNT SET BALANCE = ? WHERE ID = ?";
    private static final String selectAccountSql = "SELECT * FROM ACCOUNT WHERE ID = ?";
    private static final String deleteAccountSql = "DELETE FROM ACCOUNT WHERE ID = ?";
    private static final String selectAllAccountsSql = "SELECT * FROM ACCOUNT";
    private static final String truncateAccountTableSql = "TRUNCATE TABLE ACCOUNT";

    private static final Logger logger = getLogger(App.class);
    
    public static void main(String[] args) {
        

        Account account = new Account(1, "John Doe", "1234567890", 100);

        try {
            connection.createStatement().execute(createAccountTableSql);

            PreparedStatement insertAccountStatement = connection.prepareStatement(insertAccountSql);
            insertAccountStatement.setString(1, account.getName());
            insertAccountStatement.setString(2, account.getAccountNumber());
            insertAccountStatement.setDouble(3, account.getBalance());
            insertAccountStatement.execute();
            insertAccountStatement.close();

            account.deposit(100.5);

            PreparedStatement updateAccountStatement = connection.prepareStatement(updateAccountSql);
            updateAccountStatement.setDouble(1, account.getBalance());
            updateAccountStatement.setInt(2, account.getId());
            updateAccountStatement.execute();
            updateAccountStatement.close();

            connection.setAutoCommit(false);

            PreparedStatement selectAccountStatement = connection.prepareStatement(selectAccountSql);
            selectAccountStatement.setInt(1, account.getId());
            selectAccountStatement.execute();
            ResultSet accountResultSet = selectAccountStatement.getResultSet();
            selectAccountStatement.close();

            PreparedStatement deleteAccountStatement = connection.prepareStatement(deleteAccountSql);
            deleteAccountStatement.setInt(1, account.getId());
            deleteAccountStatement.execute();
            deleteAccountStatement.close();

            Statement selectAllAccountsStatement = connection.createStatement();
            selectAllAccountsStatement.execute(selectAllAccountsSql);
            ResultSet allAccountsResultSet = selectAllAccountsStatement.getResultSet();
            selectAllAccountsStatement.close();

            connection.createStatement().execute(truncateAccountTableSql);

            connection.commit();

            logger.info("Account: " + accountResultSet.getString("NAME"));
            while (allAccountsResultSet.next()) {
                logger.info(allAccountsResultSet.getString("NAME"));
            }
            
            
        } catch (Exception e) {
            String stackTrace = "";
            for (StackTraceElement stackTraceElement : e.getStackTrace()) {
                stackTrace += stackTraceElement.toString() + "\n";
            }
            System.out.println(stackTrace);
            logger.error(stackTrace);
            JdbcConnection.rollback(connection);
            throw new RuntimeException(e);
        }
    }
    
}
