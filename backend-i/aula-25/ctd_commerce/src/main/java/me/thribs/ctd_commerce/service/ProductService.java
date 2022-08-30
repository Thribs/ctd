package me.thribs.ctd_commerce.service;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.thribs.ctd_commerce.dao.IDao;
import me.thribs.ctd_commerce.model.Product;

@Service
public class ProductService {

    @Autowired
    IDao<Product> productsDao;

    public Product getById(int id) throws SQLException {
        return productsDao.getById(id);
    }

    public List<Product> getAll() throws SQLException {
        return productsDao.getAll();
    }

    public void add(Product product) throws SQLException {
        productsDao.add(product);
    }

    public void update(int id, Product product) throws SQLException {
        productsDao.update(id, product);
    }

    public void remove(int id) throws SQLException {
        productsDao.remove(id);
    }

}
