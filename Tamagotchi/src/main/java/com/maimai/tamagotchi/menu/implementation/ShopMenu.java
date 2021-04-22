package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.manager.MoneyManager;
import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.util.console.Console;
import lombok.SneakyThrows;
import me.yushust.inject.InjectAll;
import me.yushust.inject.InjectIgnore;

import java.util.Scanner;
import java.util.function.Consumer;

@InjectAll
public class ShopMenu extends SimpleMenu {

    @InjectIgnore
    private final Scanner scanner = new Scanner(System.in);

    private SelectionMenu selectionMenu;
    private MoneyManager moneyManager;

    @SneakyThrows
    @Override
    public void displayMenu() {
        Console.clearConsole();

        moneyManager.setMoneyCache(100);

        if (moneyManager.getMoneyCache() <= 5) {
            Console.print("",
                    "&c&l¡ALERTA! &1» &r&dTú dinero es &b" + moneyManager.getMoneyCache() + "&d!",
                    "",
                    "&b&lSeguridad &1» &r&cHey! alto ahí &d&l" + CreatePetMenu.getMascotEntity().getOwner() +
                            "&r&c, lo lamento pero no puedo dejarte pasar.",
                    "Debido a que no tienes dinero suficiente para comprar algo en nuestra tienda",
                    "consigue más y regresa en un rato... &r&d(>'-'<)&r",
                    ""
            );

            returnSelectionMenu();
            return;
        }

        Console.print("&cActual balance: " + moneyManager.getMoneyCache() + "!&r");

        System.out.println("Debug replace money");
        moneyManager.replaceMoneyCache(91);
        moneyManager.replaceMoneyCache(100);

        System.out.println("Add money debug");
        moneyManager.addMoneyCache(100);
        moneyManager.addMoneyCache(23);
        moneyManager.addMoneyCache(4);

        System.out.println("Remove money debug");
        moneyManager.removeMoneyCache(99);
        moneyManager.removeMoneyCache(27);

        returnSelectionMenu();
    }

    private void returnSelectionMenu() {
        Console.print(
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
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
