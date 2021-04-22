package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.menu.implementation.information.InformationMenu;
import com.maimai.tamagotchi.menu.implementation.submenu.InteractPetMenu;
import com.maimai.tamagotchi.menu.implementation.submenu.StatsMenu;
import com.maimai.tamagotchi.util.console.Console;
import lombok.SneakyThrows;
import me.yushust.inject.InjectAll;
import me.yushust.inject.InjectIgnore;

import java.util.Scanner;
import java.util.function.Consumer;

@InjectAll
public class SelectionMenu extends SimpleMenu {
    @InjectIgnore
    private final Scanner scanner = new Scanner(System.in);
    private InformationMenu informationMenu;
    private InteractPetMenu interactPetMenu;
    private StatsMenu statsMenu;
    private ShopMenu shopMenu;

    @SneakyThrows
    @Override
    public void displayMenu() {
        Console.clearConsole();
        informationMenu.displayMenu();
        Console.print("&d&l[&b&l1&d&l] &rInteractua con " + CreatePetMenu.getMascotEntity().getName() + ". &c⚽&r",
                "&d&l[&b&l2&d&l] &rEntra a la tienda, para comprarle algunos regalos a " + CreatePetMenu.getMascotEntity().getName() + ". &c🎁&r",
                "&d&l[&b&l3&d&l] &rMira las estadisticas de " + CreatePetMenu.getMascotEntity().getName() + ". &c🔍&r",
                "&d&l[&b&l4&d&l] &rGuarda todos los datos de tu juego. &c⚙&r",
                "&d&l[&b&l5&d&l] &rSal del tamagotchi y guarda todos sus datos! &c💫&r",
                "");

        byte option = Byte.parseByte(scanner.nextLine());

        switch (option) {
            case 1:
                interactPetMenu.displayMenu();
                break;
            case 2:
                shopMenu.displayMenu();
                break;
            case 3:
                statsMenu.displayMenu();
                break;
            default:
                Console.clearConsole();
                Console.print(
                        "",
                        "&1&n&l------------------------------------&r",
                        "&c&oPorfis, selecciona una opción valida!&r",
                        "&1&n&l------------------------------------&r",
                        "");

                Thread.sleep(2000L);
                displayMenu();
                break;
        }
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
