package me.thribs.dental_clinic.data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import me.thribs.dental_clinic.model.Address;
import me.thribs.dental_clinic.model.Patient;

public class PatientDaoH2 implements IDao<Patient> {

    private JdbcConfig jdbcConfig;
    private Connection connection;
    private PreparedStatement preparedStatement;

    public PatientDaoH2(JdbcConfig jdbcConfig) {
        this.jdbcConfig = jdbcConfig;
    }
    
    @Override
    public Patient getById(int id) {

        Patient patient = null;

        try {
            connection = jdbcConfig.getConnection();
            String sql = "SELECT * FROM PATIENT WHERE ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int addressId = resultSet.getInt("address_id");
                Address address = new AddressDaoH2(jdbcConfig).getById(addressId);
                patient = new Patient(resultSet.getInt("id"), resultSet.getString("first_name"), resultSet.getString("last_name"), resultSet.getString("registration_number"), resultSet.getDate("registration_data").toLocalDate(), address);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return patient; 
    }
    
    @Override
    public void save(Patient t) {
            
            try {
                connection = jdbcConfig.getConnection();
                String sql = "INSERT INTO PATIENT (first_name, last_name, registration_number, registration_data, address_id) VALUES (?, ?, ?, ?, ?)";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, t.getFirstName());
                preparedStatement.setString(2, t.getLastName());
                preparedStatement.setString(3, t.getRegistrationNumber());
                preparedStatement.setDate(4, java.sql.Date.valueOf(t.getRegistrationData()));
                preparedStatement.setInt(5, t.getAddress().getId());
                preparedStatement.executeUpdate();
            } catch (Exception e) {
                e.printStackTrace();
            }               
    }
    
    @Override
    public void update(Patient t) {
                
                try {
                    connection = jdbcConfig.getConnection();
                    String sql = "UPDATE PATIENT SET first_name = ?, last_name = ?, registration_number = ?, registration_data = ?, address_id = ? WHERE ID = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setString(1, t.getFirstName());
                    preparedStatement.setString(2, t.getLastName());
                    preparedStatement.setString(3, t.getRegistrationNumber());
                    preparedStatement.setDate(4, java.sql.Date.valueOf(t.getRegistrationData()));
                    preparedStatement.setInt(5, t.getAddress().getId());
                    preparedStatement.setInt(6, t.getId());
                    preparedStatement.executeUpdate();
                } catch (Exception e) {
                    e.printStackTrace();
                }               
        
    }
    
    @Override
    public void delete(Patient t) {

        try {
            connection = jdbcConfig.getConnection();
            String sql = "DELETE FROM PATIENT WHERE ID = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, t.getId());
            preparedStatement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
}   