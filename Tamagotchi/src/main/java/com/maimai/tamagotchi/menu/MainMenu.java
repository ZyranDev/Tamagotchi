package com.maimai.tamagotchi.menu;

import com.maimai.tamagotchi.api.menu.IMenu;
import com.maimai.tamagotchi.utils.console.ChatColor;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainMenu implements IMenu {
    Scanner scanner = new Scanner(System.in);

    public void graphicalInter() {
        /*
         * This is only a test class and example, surely this is going to be re-coded.
         * I'm thinking here to put an option of logging in - registration,
         * that will be discussed more in the group, in the meantime I'll leave it like this.
         * Sincerely yours: Camilo
         */

        LoginMenu loginMenu = new LoginMenu();
        List<String> menuItems = Arrays.asList(
                "",
                "&1&lMain Menu",
                "",
                "&c&l1.&r &dSelect pet.",
                "&c&l2.&r &dPet information.",
                "",
                "&b&lPlease select an option:&r",
                ""
        );

        /*
         * I have an idea, to make several menus and create a parent menu class for 1,
         * if it is an interface or I do not know how to implement it or if it is a class then extend it,
         * but the idea here would be to create several menus for each option and thus be able to give priority
         * to what is happening, and if say it is in a menu 2 to return to menu 1 or main menu without problems.
         */

        menuItems.replaceAll(ChatColor::translateColorCodes);
        menuItems.forEach(System.out::println);

        byte option = scanner.nextByte();
        switch (option) {
            case 1:
                System.out.println("Here, you will be able to choose a pet if you are logged in and have one, obviously");
                break;
            case 2:
                System.out.println("Here, you will be able to see the information of your pets.");
                break;
            default:
                System.out.println("Please select one of the options specified above.");
                loginMenu.displayMenu();
                break;
        }
    }

    public void displayMenu() {
        graphicalInter();
    }

    public void interrupt() {

    }
}
