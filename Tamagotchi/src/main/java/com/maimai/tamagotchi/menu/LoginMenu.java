package com.maimai.tamagotchi.menu;

import com.maimai.tamagotchi.api.menu.IMenu;
import com.maimai.tamagotchi.managers.UserManager;
import com.maimai.tamagotchi.services.MainService;
import com.maimai.tamagotchi.utils.console.ChatColor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LoginMenu implements IMenu {

    private final Scanner input = new Scanner(System.in);
    private UserManager userManager = new UserManager();
    private MainService mainService = new MainService();
    private MainMenu menu = new MainMenu();

    public void graphicalInter() {
        List<String> menuItems = Arrays.asList(
                "",
                "&1&l*-     &dWelcome &1     -*&r",
                "&dPlease enter your name:&r",
                ""
        );

        menuItems.replaceAll(ChatColor::translateColorCodes);
        menuItems.forEach(System.out::println);

        String userName = input.nextLine();
        if (!userManager.getUserByDisplayName(userName).isPresent()) {
            userManager.createUser(userName);
        }

        menu.displayMenu();
    }

    public void displayMenu() {
        graphicalInter();
    }
}
