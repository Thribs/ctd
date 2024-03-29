package me.thribs.students.service;

import java.util.List;
import java.util.Optional;

public interface IStudentsService <T> {

    public List<T> getAll();
    public Optional<T> getById(Long id);
    public T add(T t);
    public void update(T t);
    public void remove(Long id);
    
}
