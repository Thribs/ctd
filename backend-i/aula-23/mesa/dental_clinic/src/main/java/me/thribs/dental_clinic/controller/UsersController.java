package me.thribs.dental_clinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import me.thribs.dental_clinic.model.AccessLevel;
import me.thribs.dental_clinic.model.User;
import me.thribs.dental_clinic.service.UsersService;

@RestController
@RequestMapping("/users")
public class UsersController {

    private final UsersService service;

    @Autowired
    public UsersController(UsersService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> get() {
        User arthur = new User("Arthur", "arthur@email.com", "senha123", AccessLevel.ADMIN);
        User johnny = new User("Johnny", "johnny@email.com", "senha123", AccessLevel.USER);
        User thiago = new User("Thiago", "thiago@email.com", "senha123", AccessLevel.GUEST);
        service.addUser(arthur);
        service.addUser(johnny);
        service.addUser(thiago);
        return service.getUsers();
    }
    
}
