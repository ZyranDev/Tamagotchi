package com.maimai.tamagotchi.service.implementation;

import com.maimai.tamagotchi.menu.implementation.MainMenu;
import com.maimai.tamagotchi.service.IService;
import com.maimai.tamagotchi.util.console.Console;
import me.yushust.inject.InjectAll;

@InjectAll
public class MenuServiceImpl implements IService {
    private Console console;
    private MainMenu mainMenu;

    @Override
    public void start() {
        Console.print("",
                "&d» &a&l¿&eQuieres abrir el menu principal&a?&r",
                "",
                "&d» &a&lTRUE &ror &cFALSE",
                "");

        boolean confirm = console.scanner.nextBoolean();
        if (confirm) mainMenu.displayMenu();
    }

    @Override
    public void interrupt() {
        System.out.println(" > Shutting down " + getClass().getName());
    }
}
