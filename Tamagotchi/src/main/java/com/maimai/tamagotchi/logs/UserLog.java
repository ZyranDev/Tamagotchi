package com.maimai.tamagotchi.logs;

import com.maimai.tamagotchi.managers.UserManager;
import com.maimai.tamagotchi.menu.Menu;
import com.maimai.tamagotchi.services.MainService;
import com.maimai.tamagotchi.utils.console.ChatColor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserLog {

    private final Scanner input = new Scanner(System.in);
    UserManager userManager = new UserManager();
    MainService mainService = new MainService();
    Menu menu = new Menu();

    public void onUserLog() {
        List<String> menuItems = Arrays.asList(
                "",
                "&1&l----- &dWelcome &1-----&r",
                "&dPlease enter your name:&r",
                ""
        );

        menuItems.forEach(ChatColor::translateColorCodes);
        menuItems.forEach(System.out::println);

        String userName = input.nextLine();
        if (!userManager.getUserByDisplayName(userName).isPresent()) {
            userManager.createUser(userName);
        }

        menu.displayMainMenu();
    }
}
