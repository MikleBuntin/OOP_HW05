package org.example.service;

import org.example.repository.UserRepo;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MoneyService {
    private UserRepo userRepo;
    {
        try {
            userRepo = new UserRepo();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void getCheck() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID");
        userRepo.getCheck(scanner.nextInt());
    }

    public void enrollment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID");
        Integer id = scanner.nextInt();
        System.out.println("Введите сумму");
        Integer summ = scanner.nextInt();
        userRepo.enrollment(id, summ);
    }

    public void consumption() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ID");
        Integer id = scanner.nextInt();
        System.out.println("Введите сумму");
        Integer summ = scanner.nextInt();
        userRepo.consumption(id, summ);
    }
}
