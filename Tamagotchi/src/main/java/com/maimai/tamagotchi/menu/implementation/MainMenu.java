package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.util.console.Console;

import javax.inject.Inject;
import java.util.Scanner;
import java.util.function.Consumer;

public class MainMenu extends SimpleMenu {
    private final Scanner scanner = new Scanner(System.in);

    @Inject
    private SelectionMenu selectionMenu;

    private void menu() {
        Console.print(
                "",
                "&1&lHello, welcome you tamagotchi",
                "What do you want to do now?&r",
                "",
                "&c&l1 &d&lPlay on your tamagotchi",
                "&c&l2 &d&lDelete your progress.&r",
                "",
                "");

        byte option = Byte.parseByte(scanner.nextLine());

        switch (option) {
            case 1:
                createPet();
                break;
            case 2:

            default:
                System.out.println("Select an valid option");
        }
    }

    private void createPet() {
        Console.print(
                "",
                "&11. &dPlease provide a name to your pet:&r",
                "");

        String petName = scanner.nextLine();

        Console.print(
                "",
                "&dSure your pet name is: &c&l" + petName,
                "&r");

        Console.print(
                "",
                "&12. &dPlease provide your pet type:&r",
                "",
                "&1&lDog, Cat, Lion, Parrot, Rabbit&r",
                "");

        String petType = scanner.nextLine().toUpperCase();

        switch (petType) {
            case "CAT":
                System.out.println("Cat");
                selectionMenu.displayMenu();
                break;
            case "LION":
                System.out.println("Lion");
                selectionMenu.displayMenu();
                break;
            case "DOG":
                System.out.println("Dog");
                selectionMenu.displayMenu();
                break;
            case "PARROT":
                System.out.println("Parrot");
                selectionMenu.displayMenu();
                break;
            default:
                Console.clearConsole();
                Console.print(
                        "&1&n&l-----------------------------&r",
                        "&c&oPlease select a valid option!&r",
                        "&1&n&l-----------------------------&r");
                createPet();
        }
    }

    @Override
    public void displayMenu() {
        menu();
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}