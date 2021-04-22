package com.maimai.tamagotchi.menu.implementation.submenu;

import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.menu.implementation.CreatePetMenu;
import com.maimai.tamagotchi.menu.implementation.SelectionMenu;
import com.maimai.tamagotchi.menu.implementation.submenu.interact.FeedPetMenu;
import com.maimai.tamagotchi.menu.implementation.submenu.interact.PlayPetMenu;
import com.maimai.tamagotchi.util.console.Console;
import me.yushust.inject.InjectAll;
import me.yushust.inject.InjectIgnore;

import java.util.Scanner;
import java.util.function.Consumer;

@InjectAll
public class InteractPetMenu extends SimpleMenu {

    @InjectIgnore
    private final Scanner scanner = new Scanner(System.in);
    private SelectionMenu selectionMenu;
    private FeedPetMenu feedPetMenu;
    private PlayPetMenu playPetMenu;

    @Override
    public void displayMenu() {
        Console.clearConsole();
        Console.print("&d&l[&b&l1&d&l] &rAlimenta a " + CreatePetMenu.getMascotEntity().getName() + ". &c🍣&r",
                "&d&l[&b&l2&d&l] &rJuega con " + CreatePetMenu.getMascotEntity().getName() + ". &c🪁&r ",
                "",
                "&d&l[&b&l0&d&l] &rRegresa al menu principal. &c🎯&r",
                "");

        byte option = Byte.parseByte(scanner.nextLine());

        switch (option) {
            case 0:
                selectionMenu.displayMenu();
                break;
            case 1:
                feedPetMenu.displayMenu();
                break;
            case 2:
                playPetMenu.displayMenu();
                break;
            default:
                System.out.println("Select an valid option");
                displayMenu();
                break;
        }
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
