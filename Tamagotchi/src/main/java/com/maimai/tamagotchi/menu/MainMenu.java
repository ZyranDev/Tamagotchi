package com.maimai.tamagotchi.menu;

import java.util.function.Consumer;

public class MainMenu extends SimpleMenu {

    @Override
    public void displayMenu() {
        System.out.println("Test");
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}