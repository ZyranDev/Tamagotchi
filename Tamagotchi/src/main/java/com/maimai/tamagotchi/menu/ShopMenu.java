package com.maimai.tamagotchi.menu;

import com.maimai.tamagotchi.utils.console.Console;

import java.util.function.Consumer;

public class ShopMenu extends SimpleMenu {
    @Override
    public void displayMenu() {
        Console.print(
                "________________________",
                "| &cTama-Shop&r            |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "|                      |",
                "------------------------"
        );
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
