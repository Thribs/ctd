package me.thribs.small_pharma.data;

import org.apache.logging.log4j.Logger;

import me.thribs.small_pharma.model.Drug;

import static org.apache.logging.log4j.LogManager.getLogger;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static me.thribs.small_pharma.data.JdbcConfig.getConnectionInstance;

public class DrugDaoH2 implements IDAO<Drug> {

    private static Logger logger = getLogger(DrugDaoH2.class);
    private static final Connection connection = getConnectionInstance();

    public DrugDaoH2() {}

    @Override
    public Drug getById(int id) throws SQLException {
        logger.info("Getting drug with id {}", id);
        String sql = "SELECT * FROM drugs WHERE id = ?";
        PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        statement.setInt(1, id);
        statement.execute();
        ResultSet resultSet = statement.getResultSet();
        Drug drug = null;
        while (resultSet.next()) {
            logger.info("drug: {} - lab: {} - {} in stock - R${}" , resultSet.getString("name"), resultSet.getString("lab"), resultSet.getInt("quantity_in_stock"), resultSet.getDouble("price"));
            drug = new Drug(resultSet.getInt("id"), resultSet.getString("name"), resultSet.getString("lab"), resultSet.getInt("quantity_in_stock"), resultSet.getDouble("price"));
        }
        return drug;
    }

    @Override
    public Drug store(Drug drug) throws SQLException {
        logger.info("Storing drug {}", drug.toString());
        String sql = "INSERT INTO drugs (name, lab_name, quantity_in_stock, price) VALUES (?, ?, ?, ?)";
        PreparedStatement insertDrugStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        insertDrugStatement.setString(1, drug.getName());
        insertDrugStatement.setString(2, drug.getLabName());
        insertDrugStatement.setInt(3, drug.getQuantityInStock());
        insertDrugStatement.setDouble(4, drug.getPrice());
        insertDrugStatement.executeUpdate();
        ResultSet insertDrugResultSet = insertDrugStatement.getResultSet();
        while (insertDrugResultSet.next()) {
            logger.info(drug.toString());
            logger.info("Drug stored with id {}", insertDrugResultSet.getInt(1));
        }
        return drug;
    }
    
}
