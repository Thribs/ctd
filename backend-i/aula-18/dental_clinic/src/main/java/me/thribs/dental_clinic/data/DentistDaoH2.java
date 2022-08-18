package me.thribs.dental_clinic.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import me.thribs.dental_clinic.model.Dentist;

public class DentistDaoH2 implements IDao<Dentist> {
    
    private JdbcConfig jdbcConfig;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public DentistDaoH2(JdbcConfig jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }

    @Override
    public Dentist getById(int id) {

        Dentist dentist = null;

        try {
            connection = jdbcConfig.getConnection();
            String sql = "SELECT * FROM DENTIST WHERE ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                dentist = new Dentist(resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getString("registration_number"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dentist;
    }

    @Override
    public void save(Dentist t) {
        
        try {
            connection = jdbcConfig.getConnection();
            String sql = "INSERT INTO DENTIST (first_name, last_name, registration_number) VALUES (?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, t.getFirstName());
            preparedStatement.setString(2, t.getLastName());
            preparedStatement.setString(3, t.getRegistrationNumber());
            preparedStatement.executeUpdate();
            
        } catch (Exception e) {
            e.printStackTrace();
        }               
    }

    @Override
    public void update(Dentist t) {
        
        try {
            connection = jdbcConfig.getConnection();
            String sql = "UPDATE DENTIST SET first_name = ?, last_name = ?, registration_number = ? WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, t.getFirstName());
            preparedStatement.setString(2, t.getLastName());
            preparedStatement.setString(3, t.getRegistrationNumber());
            preparedStatement.setInt(4, t.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void delete(Dentist t) {
        
        try {
            connection = jdbcConfig.getConnection();
            String sql = "DELETE FROM DENTIST WHERE id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, t.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
