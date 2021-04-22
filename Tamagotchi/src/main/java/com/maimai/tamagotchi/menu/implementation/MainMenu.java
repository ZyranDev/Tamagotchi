package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.util.console.Console;
import me.yushust.inject.InjectAll;
import me.yushust.inject.InjectIgnore;

import java.util.Scanner;
import java.util.function.Consumer;

@InjectAll
public class MainMenu extends SimpleMenu {

    @InjectIgnore
    private final Scanner scanner = new Scanner(System.in);

    private SelectionMenu selectionMenu;
    private CreatePetMenu createPetMenu;

    @Override
    public void displayMenu() {
        Console.print(
                "",
                "&d&l¡Hola!, bienvenido a tu tamagotchi",
                "¿Qué quieres hacer ahora?&r",
                "",
                "&b&l1 &d» &1&lJugar en tu tamagotchi.",
                "&b&l2 &d» &1&lBorrar tu progreso. &d» &cDESHABILITADA!&r",
                "",
                "");

        byte option = Byte.parseByte(scanner.nextLine());

        switch (option) {
            case 1:
                createPetMenu.displayMenu();
                break;
            case 2:
                Console.print("",
                        "&cNo se ha encontrado ningun dato!&r",
                        "");

                displayMenu();
                break;
            default:
                Console.print("",
                        "&cSelecciona una opción valida!&r",
                        "");

                displayMenu();
                break;
        }
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }


}