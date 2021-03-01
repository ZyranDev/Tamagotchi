package com.maimai.tamagotchi.logs;

import com.maimai.tamagotchi.managers.UserManager;
import com.maimai.tamagotchi.menu.Menu;
import com.maimai.tamagotchi.utils.console.Colors;

import java.util.Scanner;

public class UserLog {

    Scanner input = new Scanner(System.in);
    Menu menu = new Menu();
    Colors color = new Colors();
    UserManager userManager = new UserManager();


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
