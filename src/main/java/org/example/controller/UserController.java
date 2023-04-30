package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;

public class UserController {
    private UserService userService = new UserService();
    public void saveNewUser(String name, int age){
        userService.saveUser(new User(name, age));
    }

}
