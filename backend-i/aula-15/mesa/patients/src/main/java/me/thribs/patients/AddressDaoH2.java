package me.thribs.patients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import me.thribs.patients.model.Address;

public class AddressDaoH2 implements IDao<Address> {

    private JdbcConfig jdbcConfig;
    private Connection connection;
    private Statement statement;
    private PreparedStatement preparedStatement;

    public AddressDaoH2(JdbcConfig jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }
    
    @Override
    public Address getById(int id) {

        Address address = null;

        try {
            connection = jdbcConfig.getConnection();
            String sql = "SELECT * FROM Address WHERE ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                address = new Address(resultSet.getInt("id"), resultSet.getString("street"), resultSet.getInt("number"), resultSet.getString("city"), resultSet.getString("neighborhood"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return address;
    }
    
    @Override
    public void save(Address t) {

        try {
            connection = jdbcConfig.getConnection();
            String sql = "INSERT INTO Address (street, number, city, neighborhood) VALUES (?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, t.getStreet());
            preparedStatement.setInt(2, t.getNumber());
            preparedStatement.setString(3, t.getCity());
            preparedStatement.setString(4, t.getNeighborhood());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }       
    }
    
    @Override
    public void update(Address t) {

        try {
            connection = jdbcConfig.getConnection();
            String sql = "UPDATE Address SET street = ?, number = ?, city = ?, neighborhood = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, t.getStreet());
            preparedStatement.setInt(2, t.getNumber());
            preparedStatement.setString(3, t.getCity());
            preparedStatement.setString(4, t.getNeighborhood());
            preparedStatement.setInt(5, t.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }    
    }
    
    @Override
    public void delete(Address t) {

        try {
            connection = jdbcConfig.getConnection();
            String sql = "DELETE FROM Address WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, t.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }       
       
    }
    
}