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
        System.out.println("Do you want open the main menu?");
        boolean confirm = console.scanner.nextBoolean();
        if (confirm) mainMenu.displayMenu();
    }

    @Override
    public void interrupt() {
        System.out.println(" > Shutting down " + getClass().getName());
    }
}
