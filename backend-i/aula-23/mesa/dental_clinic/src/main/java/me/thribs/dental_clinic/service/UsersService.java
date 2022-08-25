package me.thribs.dental_clinic.service;

import java.util.List;

import me.thribs.dental_clinic.model.User;

public interface UsersService {
    

    public void addUser(User user);

    public List<User> getUsers();

    public void removeUser(int userId);
    
}
