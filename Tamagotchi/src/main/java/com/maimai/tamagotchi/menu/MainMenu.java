package com.maimai.tamagotchi.menu;

import com.maimai.tamagotchi.mascot.entity.EntityType;
import com.maimai.tamagotchi.mascot.entity.MascotEntity;
import com.maimai.tamagotchi.mascot.indicator.IndicatorType;
import com.maimai.tamagotchi.utils.console.Console;

import java.util.Locale;
import java.util.Scanner;
import java.util.function.Consumer;

public class MainMenu extends SimpleMenu {

    Scanner scanner = new Scanner(System.in);

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
                "");

        String petType = scanner.nextLine();

        switch (petType.toLowerCase()) {
            case "cat":
                System.out.println("Cat");
                new ShopMenu().displayMenu();
                break;
            case "lion":
                System.out.println("Lion");
                new ShopMenu().displayMenu();
                break;
            case "dog":
                System.out.println("Dog");
                new ShopMenu().displayMenu();
                break;
            case "parrot":
                System.out.println("Parrot");
                new ShopMenu().displayMenu();
                break;
            default:
                Console.print(
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "",
                        "&cPlease select a valid option!&r",
                        "");
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