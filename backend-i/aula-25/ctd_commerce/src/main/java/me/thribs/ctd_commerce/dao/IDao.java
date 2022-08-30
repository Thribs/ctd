package me.thribs.ctd_commerce.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao<T> {

    List<T> getAll() throws SQLException;

    T getById(int id) throws SQLException;

    void add(T item) throws SQLException;

    void update(int id, T newItem) throws SQLException;
    
    void remove(int id) throws SQLException;

}
