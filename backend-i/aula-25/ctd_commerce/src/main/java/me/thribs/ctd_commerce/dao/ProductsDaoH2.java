package me.thribs.ctd_commerce.dao;

import org.apache.logging.log4j.Logger;
import static org.apache.logging.log4j.LogManager.getLogger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Configuration;

import me.thribs.ctd_commerce.model.Product;

@Configuration
public class ProductsDaoH2 implements IDao<Product> {

    private Connection connection = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;

    private static final Logger logger = getLogger(ProductsDaoH2.class);

    private final String getAllProductsSql = "select * from products";
    private final String getProductByIdSql = "select * from products where id = ?";
    private final String addProductSql = "insert into products (name, price) values (?, ?)";
    private final String updateProductSql = "update products set name = ?, price = ? where id = ?";
    private final String removeProductSql = "delete from products where id = ?";

    @Override
    public List<Product> getAll() throws SQLException {
        List<Product> products = new ArrayList<Product>();
        try {
            connection = getConnection();
            ps = prepareStatement(getAllProductsSql);
            rs = ps.executeQuery();
            while (rs.next()) {
                String productName = rs.getString("name");
                double productPrice = rs.getDouble("price");
                Product product = new Product(productName, productPrice);
                products.add(product);
            }
        } catch (Exception e) {
            logger.error("Error getting all products", e);
            throw new RuntimeException(e);
        }
        finally { connection.close(); }
        return products;
    }

    @Override
    public Product getById(int id) throws SQLException {
        Product product = null;
        try {
            connection = getConnection();
            ps = prepareStatement(getProductByIdSql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                String productName = rs.getString("name");
                double productPrice = rs.getDouble("price");
                product = new Product(productName, productPrice);
            }
        } catch (Exception e) {
            logger.error("Error getting product", e);
            throw new RuntimeException(e);
        }
        finally { connection.close(); }
        return product;
    }

    @Override
    public void add(Product product) throws SQLException {
        try {
            connection = getConnection();
            ps = prepareStatement(addProductSql);
            ps.setString(1, product.getName());
            ps.setDouble(2, product.getPrice());
            rs = ps.executeQuery();
            if (rs.next()) {
                int productId = rs.getInt("id");
                product.setId(productId);
            }
        } catch (Exception e) {
            logger.error("Error adding product", e);
            throw new RuntimeException(e);
        } finally { connection.close(); }

    }

    @Override
    public void remove(int id) throws SQLException {
        try {
            connection = getConnection();
            ps = prepareStatement(removeProductSql);
            ps.setInt(1, id);
            ps.executeQuery();
        } catch (Exception e) {
            logger.error("Error removing product", e);
            throw new RuntimeException(e);
        } finally { connection.close(); }

    }

    @Override
    public void update(int id, Product newProduct) throws SQLException {
        try {
            connection = getConnection();
            ps = prepareStatement(updateProductSql);
            ps.setString(1, newProduct.getName());
            ps.setDouble(2, newProduct.getPrice());
            ps.setInt(3, id);
            ps.executeQuery();
        } catch (Exception e) {
            logger.error("Error updating product", e);
            throw new RuntimeException(e);
        } finally { connection.close(); }
    }

    private Connection getConnection() throws SQLException {
        return JdbcConfig.getConnection("org.h2.Driver", "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1;INIT=RUNSCRIPT FROM 'src/main/resources/init.sql'", "sa", "");
    }

    private PreparedStatement prepareStatement(String sql) throws SQLException {
        return connection.prepareStatement(sql);
    }

}
