package me.thribs.dental_practice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import me.thribs.dental_practice.model.Dentist;

public class App {

    public static String createTableSql = "create table if not exists dentists (id int primary key auto_increment, firstName varchar(255), lastName varchar(255), registrationNumber varchar(255))";
    public static String insertDentistSql = "insert into dentists (firstName, lastName, registrationNumber) values (?, ?, ?)";
    public static String updateDentistSql = "update dentists set firstName = ?, lastName = ?, registrationNumber = ? where id = ?";
    public static String selectAllDentistsSql = "select * from dentists";
    public static String truncateDentistSql = "truncate table dentists";

    private static Connection connection;

    public static void main(String[] args) throws Exception {

        Dentist john = new Dentist("John", "Doe","12345");
        Dentist jane = new Dentist("Jane", "Doe","54321");

        try {
            connection = getConnection();

            connection.createStatement().execute(createTableSql);
            PreparedStatement insertDentistPreparedStatement = connection.prepareStatement(insertDentistSql);
            insertDentistPreparedStatement.setString(1, john.getName());
            insertDentistPreparedStatement.setString(2, john.getLastName());
            insertDentistPreparedStatement.setString(3, john.getRegistrationNumber());
            insertDentistPreparedStatement.execute();

            System.out.println("all dentists:");
            PreparedStatement allDentistsStatement = connection.prepareStatement(selectAllDentistsSql);
            allDentistsStatement.execute();
            ResultSet allDentistsResultSet = allDentistsStatement.getResultSet();
            while (allDentistsResultSet.next()) {
                System.out.println(allDentistsResultSet.getInt("id") + " " + allDentistsResultSet.getString("firstName") + " " + allDentistsResultSet.getString("lastName") + " " + allDentistsResultSet.getString("registrationNumber"));
            }

            connection.setAutoCommit(false);

            PreparedStatement updateDentistPreparedStatement = connection.prepareStatement(updateDentistSql);
            updateDentistPreparedStatement.setString(1, jane.getName());
            updateDentistPreparedStatement.setString(2, jane.getLastName());
            updateDentistPreparedStatement.setString(3, jane.getRegistrationNumber());
            updateDentistPreparedStatement.setInt(4, 11);
            updateDentistPreparedStatement.execute();

            System.out.println("all dentists:");
            allDentistsStatement.execute();
            allDentistsResultSet = allDentistsStatement.getResultSet();
            while (allDentistsResultSet.next()) {
                System.out.println(allDentistsResultSet.getInt("id") + " " + allDentistsResultSet.getString("firstName") + " " + allDentistsResultSet.getString("lastName") + " " + allDentistsResultSet.getString("registrationNumber"));
            }

            connection.commit();

            System.out.println("all dentists:");
            allDentistsStatement.execute();
            allDentistsResultSet = allDentistsStatement.getResultSet();
            while (allDentistsResultSet.next()) {
                System.out.println(allDentistsResultSet.getInt("id") + " " + allDentistsResultSet.getString("firstName") + " " + allDentistsResultSet.getString("lastName") + " " + allDentistsResultSet.getString("registrationNumber"));
            }

            connection.setAutoCommit(true);

            connection.createStatement().execute(truncateDentistSql);

            
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
        } finally {
            connection.close();
        }


    }

    public static Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:h2:~/test","sa","");
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static String getAllDentists() throws SQLException {
        connection = getConnection();
        String allDentists = "";

        try {
            PreparedStatement allDentistsStatement = connection.prepareStatement(selectAllDentistsSql);
            allDentistsStatement.execute();
            ResultSet allDentistsResultSet = allDentistsStatement.getResultSet();
            allDentistsStatement.close();
            while (allDentistsResultSet.next()) {
                allDentists += allDentistsResultSet.getString("firstName") + " " + allDentistsResultSet.getString("lastName") + " " + allDentistsResultSet.getString("registrationNumber") + "\n";
            }
            return allDentists;
        } catch (Exception e) {
            e.printStackTrace();
            connection.rollback();
            throw new RuntimeException(e);
        } finally {
            connection.close();
        }
    }
    
}
