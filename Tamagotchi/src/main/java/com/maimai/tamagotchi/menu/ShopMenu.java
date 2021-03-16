package com.maimai.tamagotchi.menu;

import java.util.function.Consumer;

public class ShopMenu extends SimpleMenu {
    @Override
    public void displayMenu() {
        System.out.println("TEST");
    }

    @Override
    public Consumer<String> listener() {
        return null;
    }
}
