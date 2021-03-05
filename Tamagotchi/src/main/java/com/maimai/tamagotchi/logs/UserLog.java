package com.maimai.tamagotchi.logs;

import com.maimai.tamagotchi.managers.UserManager;
import com.maimai.tamagotchi.menu.Menu;
import com.maimai.tamagotchi.services.MainService;

import java.util.Scanner;

public class UserLog {

    private final Scanner input = new Scanner(System.in);
    UserManager userManager = new UserManager();
    MainService mainService = new MainService();
    Menu menu = new Menu();


    public void onUserLog() {
        System.out.println("----- Bienvenido -----");
        System.out.print("Por favor, introduce tu nombre: ");
        String userName = input.nextLine();
        if (userManager.getUserByDisplayName(userName).isPresent()) {
            menu.displayMainMenu();

        } else {
            userManager.createUser(userName);
        }

    }

}
