package org.example.data;

import org.example.controller.UserController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        while (true) {
            System.out.println("Добрый день!\n Доступные операции:");
            System.out.println(
                    "1 - Просмотреть всех пользователей; \n" +
                    "2 - добавить пользователя \n" +
                    "3 - удалить пользователя \n" +
                    "4 - Зачислить средства \n" +
                    "5 - Снять средства \n" +
                    "Q - выйти");
            String str = iScanner.nextLine();
            if (str.equals("Q")) {
                iScanner.close();
                break;
            } else if (str.equals("1")) {

            } else if (str.equals("2")) {
                UserController userController = new UserController();
                userController.addUser();
            }

//            else if (str.equals("3")) PrintFiltered(laptopHashSet);
//            else if (str.equals("4")) PrintSorted(laptopHashSet);
        }
    }

}