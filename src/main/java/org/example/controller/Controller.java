package org.example.controller;

import org.example.service.MoneyService;
import org.example.service.UserService;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Controller {
    private static UserService userService = new UserService();
    private static MoneyService moneyService = new MoneyService();

    public void viewAllUsers() throws IOException {
    userService.viewAll();
    }

    public void addUser() throws FileNotFoundException {
        userService.addUser();
    }

    public static void deleteUser() throws FileNotFoundException {
        userService.deleteUser();
    }

    public static void getCheck() {
        moneyService.getCheck();
    }

    public static void enrollment() {
        moneyService.enrollment();
    }
    public static void consumption() {
        moneyService.consumption();
    }
}
