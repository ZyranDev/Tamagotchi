package com.maimai.tamagotchi.menu.implementation.submenu;

import com.maimai.tamagotchi.manager.MoneyManager;
import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.menu.implementation.CreatePetMenu;
import com.maimai.tamagotchi.menu.implementation.SelectionMenu;
import com.maimai.tamagotchi.util.console.Console;
import lombok.SneakyThrows;
import me.yushust.inject.InjectAll;
import me.yushust.inject.InjectIgnore;

import java.util.Scanner;
import java.util.function.Consumer;

@InjectAll
public class StatsMenu extends SimpleMenu {

    @InjectIgnore
    private final Scanner scanner = new Scanner(System.in);
    private SelectionMenu selectionMenu;
    private MoneyManager moneyManager;

    @SneakyThrows
    @Override
    public void displayMenu() {
        Console.clearConsole();
        Console.print("&r",
                "&d[&1&l»&d] &c&lDueño &d" + CreatePetMenu.getMascotEntity().getOwner(),
                "&d[&1&l»&d] &c&lNombre de la mascota &d" + CreatePetMenu.getMascotEntity().getName(),
                "&d[&1&l»&d] &c&lTipo de la mascota &d" + CreatePetMenu.getMascotEntity().getType(),
                "",
                "&d[&1&l»&d] &c&lDinero &d" + moneyManager.getMoneyCache() + "&r",
                "",
                "&d&l[&b&l0&d&l] &rRegresa al menu principal. &c🎯&r",
                "");

        byte option = Byte.parseByte(scanner.nextLine());

        switch (option) {
            case 0:
                selectionMenu.displayMenu();
                break;
            case 1:
                System.out.println("Alto ahí viejo, esta opción no esta disponible por el momento.");
                displayMenu();
                break;
            default:
                System.out.println("Select an valid option");
                displayMenu();
                break;
        }

        selectionMenu.displayMenu();
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
