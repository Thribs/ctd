package me.thribs.patients;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import me.thribs.patients.model.Address;
import me.thribs.patients.model.Patient;

public class PatientDaoH2 implements IDao<Patient> {

    private JdbcConfig jdbcConfig;
    private Connection connection;
    private Statement statement;
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
        
    }
    
    @Override
    public void update(Patient t) {
        
    }
    
    @Override
    public void delete(Patient t) {
        
    }
    
}
    
}
