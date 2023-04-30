package org.example.controller;

import org.example.model.User;
import org.example.service.UserService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class UserController {
    private UserService userService = new UserService();

    public void saveNewUser(String name, int age){
        userService.saveUser(new User(name));
    }

    public void viewAllUsers() throws IOException {
    userService.viewAll();
    }


    public void addUser() {
        userService.addUser();
    }
}
