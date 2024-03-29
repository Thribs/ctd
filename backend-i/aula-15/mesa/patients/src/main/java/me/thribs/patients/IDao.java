package me.thribs.patients;

public interface IDao <T> {

    public T getById(int id);

    public void save(T t);
    
    public void update(T t);

    public void delete(T t);
    
}
