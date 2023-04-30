package org.example.service;

import org.example.model.User;
import org.example.repository.UserRepo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class UserService {
    private UserRepo userRepo;
    {
        try {
            userRepo = new UserRepo();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    public void viewAll() throws IOException {
        userRepo.viewAll();
    }

    public void addUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя и баланс");
        Integer id = UserRepo.getNewID();
        userRepo.addUser(new User(id, scanner.nextLine(), scanner.nextInt()));
    }
}
