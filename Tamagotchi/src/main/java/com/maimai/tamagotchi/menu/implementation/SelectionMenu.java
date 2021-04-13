package com.maimai.tamagotchi.menu.implementation;

import com.maimai.tamagotchi.menu.SimpleMenu;
import com.maimai.tamagotchi.util.console.Console;

import java.util.function.Consumer;

public class SelectionMenu extends SimpleMenu {
    @Override
    public void displayMenu() {
        Console.clearConsole();
        Console.print("&d&l[&b&l1&d&l] &rFeed your pet. &c🍣&r",
                "&d&l[&b&l2&d&l] &rInteract with your pet. &c⚽&r",
                "&d&l[&b&l3&d&l] &rPlay with your pet. &c🪁&r",
                "&d&l[&b&l4&d&l] &rEnter the store to buy some gifts for your pet. &c🎁&r",
                "&d&l[&b&l5&d&l] &rView your pet's statistics. &c🔍&r",
                "&d&l[&b&l6&d&l] &rSave all your game data. &c⚙&r",
                "&d&l[&b&l7&d&l] &rExit tamagotchi. &c💫&r",
                "");
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
