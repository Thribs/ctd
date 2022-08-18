package me.thribs.small_pharma.data;

import java.sql.SQLException;

public interface IDAO<T> {
    
    public T getById(int id) throws SQLException;

    public T store(T t) throws SQLException;
}
