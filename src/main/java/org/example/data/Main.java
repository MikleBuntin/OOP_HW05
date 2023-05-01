package org.example.data;

import org.example.controller.Controller;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Добрый день!");
        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Доступные операции:");
            System.out.println(
                    "1 - Просмотреть всех пользователей; \n" +
                    "2 - Добавить пользователя \n" +
                    "3 - Удалить пользователя \n" +
                    "4 - Узнать баланс \n" +
                    "5 - Зачислить средства \n" +
                    "6 - Снять средства \n" +
                    "Q - выйти");
            String str = iScanner.nextLine();
            Controller userController = new Controller();
            if (str.equals("Q")) {
                iScanner.close();
                break;
            } else if (str.equals("1")) {
                userController.viewAllUsers();
            } else if (str.equals("2")) {
                userController.addUser();
            }
            else if (str.equals("3")) Controller.deleteUser();
            else if (str.equals("4")) Controller.getCheck();
            else if (str.equals("5")) Controller.enrollment();
            else if (str.equals("6")) Controller.consumption();
        }
    }

}